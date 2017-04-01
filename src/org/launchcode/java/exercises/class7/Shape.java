package org.launchcode.java.exercises.class7;

/**
 * Created by Rebecca on 4/1/2017.
 */
public class Shape extends AbstractEntity{
    private int id;
    private double area;
    private String borderColor;
    private String fillColor;


    protected Shape(int id, double area, String borderColor, String fillColor) {
        this.id = id;
        this.area = area;
        this.borderColor = borderColor;
        this.fillColor = fillColor;

    }

    protected Shape(int id, double area) {
        this(id, area, "black", "black");
    }

    protected Shape() {};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }
}
