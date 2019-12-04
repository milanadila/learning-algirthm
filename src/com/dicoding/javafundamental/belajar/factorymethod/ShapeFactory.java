package com.dicoding.javafundamental.belajar.factorymethod;

public class ShapeFactory {

    //use getShape method to get object of type shape

    // Create a ShapeFactory to generate object of concrete classes based on given information..

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}


