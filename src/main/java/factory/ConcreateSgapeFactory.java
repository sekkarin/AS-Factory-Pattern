package main.java.factory;

public class ConcreateSgapeFactory extends AbstractCreator {

    @Override
    public Shape getShape(String shaString){
        if ("CIRCLE".equalsIgnoreCase(shaString)) {
            return new Circle();
        } else if("Reactangle".equalsIgnoreCase(shaString)){
            return new Reactangle();
        }else if("Triangle".equalsIgnoreCase(shaString)){
            return new Triangle();
        }
        return null;
    }
}
