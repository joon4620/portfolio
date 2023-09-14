import java.util.*;

public class EntryErrorVisitor<T> extends SimpleLangBaseVisitor<T>{
    private boolean entryE = false;

    @Override public T visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) { 
        //check if entry() method exists in proper foramt
        if (ctx.ID().getText().equals("entry") && ctx.type() == null && ctx.formPars() == null){
            entryE = true;
        }
        return visitChildren(ctx); 
    }

    public boolean getEntryE(){
        return entryE;
    }
}