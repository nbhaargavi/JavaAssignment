package org.example;
import java.util.logging.Logger;
public class shapedetails {
    Logger l = Logger.getLogger("kitty");
    private String type;

    private double[] dimensions;
    public shapedetails(String type, double[] dimensions) {
        this.type = type;
        this.dimensions = dimensions;

    }

    public double getPerimeter() {
        double perimeter = 0;
        if (type.equals("triangle")) {
            perimeter = dimensions[0] + dimensions[1] + dimensions[2];
        } else if (type.equals("rectangle")) {
            perimeter = 2 * (dimensions[0] + dimensions[1]);
        } else if (type.equals("circle")) {
            perimeter = 2 * Math.PI * dimensions[0];
        }
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        if (type.equals("triangle")) {
            double s = (dimensions[0] + dimensions[1] + dimensions[2]) / 2;
            area = Math.sqrt(s * (s - dimensions[0]) * (s - dimensions[1]) * (s - dimensions[2]));
        } else if (type.equals("rectangle")) {
            area = dimensions[0] * dimensions[1];
        } else if (type.equals("circle")) {
            area = Math.PI * dimensions[0] * dimensions[0];
        }
        return area;
    }
}

