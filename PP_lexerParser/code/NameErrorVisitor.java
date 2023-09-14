import java.util.*;

public class NameErrorVisitor<T> extends SimpleLangBaseVisitor<T>{
    private Set<String> memory = new HashSet<>();
    @Override public T visitProject(SimpleLangParser.ProjectContext ctx) { 
        memory.add("ord");
        memory.add("chr");
        memory.add("len");
        return visitChildren(ctx); 
    }

    @Override public T visitConstDecl(SimpleLangParser.ConstDeclContext ctx) { 
        for (int i = 0; i< ctx.ID().size(); i++){
            memory.add(ctx.ID(i).getText());
        }
        return visitChildren(ctx); 
    }

    @Override public T visitEnumDecl(SimpleLangParser.EnumDeclContext ctx) { 
        for(int i=0; i<ctx.ID().size(); i++){
            memory.add(ctx.ID(i).getText());
        }
        return visitChildren(ctx); 
    }

    @Override public T visitVarDecl(SimpleLangParser.VarDeclContext ctx) { 
        for (int i = 0; i< ctx.ID().size(); i++){
            memory.add(ctx.ID(i).getText());
        }
        return visitChildren(ctx); 
    } 

    @Override public T visitClassDecl(SimpleLangParser.ClassDeclContext ctx) { 
        memory.add(ctx.ID().getText());
        for(int i=0; i<ctx.type().size(); i++){
            if(!memory.contains(ctx.type(i).getText())){
                System.out.println("NAME USE ERROR: name '" + ctx.type(i).getText() + "' was not declared");
            }
        }
        return visitChildren(ctx); 
    }

    @Override public T visitInterfaceDecl(SimpleLangParser.InterfaceDeclContext ctx) {
        memory.add(ctx.ID().getText());
        return visitChildren(ctx);
    }

    @Override public T visitMethodDecl(SimpleLangParser.MethodDeclContext ctx) { 
        memory.add(ctx.ID().getText());
        return visitChildren(ctx); 
    }

    @Override public T visitFormPars(SimpleLangParser.FormParsContext ctx) {
        for(int i=0; i<ctx.ID().size(); i++){
            memory.add(ctx.ID(i).getText());
        }
        return visitChildren(ctx);
    }
    
    @Override public T visitDesignator(SimpleLangParser.DesignatorContext ctx) {
        for(int i=0; i<ctx.ID().size(); i++){
            if(i==0 && ctx.ID(i).getText().equals("this")) continue;
            if(!memory.contains(ctx.ID(i).getText())){
                System.out.println("NAME USE ERROR: name '" + ctx.ID(i).getText() + "' was not declared");
            }
        }
        return visitChildren(ctx);
    }
}
