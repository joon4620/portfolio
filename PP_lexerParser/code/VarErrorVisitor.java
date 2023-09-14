import java.util.*;

public class VarErrorVisitor<T> extends SimpleLangBaseVisitor<T>{
    private String scope = "";
    private Map<String,Set<String>> memory = new HashMap<>();

    @Override public T visitProject(SimpleLangParser.ProjectContext ctx) { 
        scope = ctx.ID().getText();
        Set<String> set = new HashSet<>();
        memory.put(scope, set);
        return visitChildren(ctx); 
    }

    @Override public T visitClassDecl(SimpleLangParser.ClassDeclContext ctx) { 
        scope = ctx.ID().getText();
        Set<String> set = new HashSet<>();
        memory.put(scope, set);
        return visitChildren(ctx); 
    }

    @Override public T visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) { 
        scope = ctx.ID().getText();
        Set<String> set = new HashSet<>();
        memory.put(scope, set);
        return visitChildren(ctx); 
    }

    @Override public T visitInterfaceMethodDecl(SimpleLangParser.InterfaceMethodDeclContext ctx) { 
        scope = ctx.ID().getText();
        Set<String> set = new HashSet<>();
        memory.put(scope, set);
        return visitChildren(ctx); 
    }

    @Override public T visitVarDecl(SimpleLangParser.VarDeclContext ctx) { 
        //Check if vars in scope don't have duplicates
        for(int i=0; i<ctx.ID().size(); i++){
            if(!memory.get(scope).add(ctx.ID(i).getText())){
                System.out.println("VAR ERROR: var '" + ctx.ID(i).getText() + "' was already declared in scope: " + scope);
            }
        }
        return visitChildren(ctx); 
    }

    // check var names in form Pars
    @Override public T visitFormPars(SimpleLangParser.FormParsContext ctx) { 
        for(int i=0; i<ctx.ID().size(); i++){
            if(!memory.get(scope).add(ctx.ID(i).getText())){
                System.out.println("VAR ERROR: var '" + ctx.ID(i).getText() + "' was already declared in scope: " + scope);
            }
        }
        return visitChildren(ctx); 
    }

}