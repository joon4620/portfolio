import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.nio.file.Path;
import java.nio.file.FileSystems;

public class Main {
    public static void main(String[] args) throws Exception {
        Path path = FileSystems.getDefault().getPath(args[0]);
        SimpleLangLexer lexer = new SimpleLangLexer(CharStreams.fromPath(path));
        SimpleLangParser parser = new SimpleLangParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new MyParserErrorListener());
        ParseTree tree = parser.project();


        //Checks NAME ERROR
        NameErrorVisitor nameErrorVisitor = new NameErrorVisitor();
        nameErrorVisitor.visit(tree);

        //Checks VAR ERROR
        VarErrorVisitor varErrorVisitor = new VarErrorVisitor();
        varErrorVisitor.visit(tree);

        //Checks ENTRY ERROR 
        EntryErrorVisitor entryErrorVisitor = new EntryErrorVisitor();
        entryErrorVisitor.visit(tree);
        if(!entryErrorVisitor.getEntryE()) System.out.println("ENTRY ERROR");
 
        //Checks TYPE ERROR
        TypeErrorVisitor typeErrorVisitor = new TypeErrorVisitor();
        typeErrorVisitor.visit(tree);
        
        
    }

    
}
