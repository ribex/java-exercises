package org.launchcode.java.exercises.class7;

/**
 * Created by Rebecca on 4/1/2017.
 */
public class Shape {
    private int area;
    private String borderColor;
    private String fillColor;

    private Shape(int area, String borderColor, String fillColor) {
        this.area = area;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    private Shape(int area) {
        this(area, "", "");
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
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
