import java.util.*;

public class TypeErrorVisitor<T> extends SimpleLangBaseVisitor<T>{
    private Set<String> typeMemory = new HashSet<>();

    @Override public T visitProject(SimpleLangParser.ProjectContext ctx) { 
        typeMemory.add("int");
        typeMemory.add("char");
        typeMemory.add("boolean");
        return visitChildren(ctx); 
    }

    @Override public T visitClassDecl(SimpleLangParser.ClassDeclContext ctx) { 
        typeMemory.add(ctx.ID().getText());
        return visitChildren(ctx); 
    } 

    @Override public T visitVarDecl(SimpleLangParser.VarDeclContext ctx) { 
        if(!typeMemory.contains(ctx.type().getText())){
            System.out.println("TYPE ERROR: type '" + ctx.type().getText() + "' was not declared");
        }
        return visitChildren(ctx); 
    }

    @Override public T visitFactor(SimpleLangParser.FactorContext ctx) { 
        if(ctx.type() == null){
            return visitChildren(ctx); 
        }
        if(!typeMemory.contains(ctx.type().getText())){
            System.out.println("TYPE ERROR: type '" + ctx.type().getText() + "' was not declared");
        }
        
        return visitChildren(ctx); 
    }


}