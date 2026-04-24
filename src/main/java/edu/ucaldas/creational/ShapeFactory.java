package edu.ucaldas.creational;

/**
 * Factory Method - Crea instancias de Shape según el tipo solicitado.
 */
public class ShapeFactory {
    public Shape createShape(String type) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
