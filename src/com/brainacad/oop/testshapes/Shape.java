package com.brainacad.oop.testshapes;

public class Shape {
    private String shapeColor;
    public String getShapeColor() {   return shapeColor; }
    public void setShapeColor(String shapeColor) {  this.shapeColor = shapeColor; }

    public double calcArea(){double area=0.0 ; System.out.println("Shape area is: "+area); return area;}
    public void Shape(String shapeColor){
        setShapeColor(shapeColor);}

    @Override
    public String toString() {
        return "Shape, color is: " + shapeColor ; }
}
