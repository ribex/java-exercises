package org.launchcode.java.exercises.class7;

import static java.lang.Math.*;

/**
 * Created by Rebecca on 4/1/2017.
 */
public class Circle extends Shape{

    private double radius;
    private double area = (radius * radius * 3.141529);


    private Circle(double radius, double area, String borderColor, String fillColor) {
        super(area, borderColor, fillColor);
        this.radius = radius;
    }

    private Circle(double radius) {
        this.radius = radius;
    }

    private Circle() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
