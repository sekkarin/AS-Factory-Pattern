package factory;

import main.java.factory.AbstractCreator;
import main.java.factory.Circle;
import main.java.factory.ConcreateSgapeFactory;
import main.java.factory.Shape;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        AbstractCreator shapeSgapeFactory = new ConcreateSgapeFactory();
        Shape shape1 = shapeSgapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeSgapeFactory.getShape("Triangle");
        shape2.draw();
    }
}