package com.brainacad.oop.testshapes;

public class Circle extends Shape {
    private  double radius;

    public double getRadius() {  return radius;  }
    public void setRadius(double radius) { this.radius = radius; }
@Override
    public double calcArea(){
        double area = Math.PI*Math.pow(radius,2);

    return area ;}

     public Circle(String color, double R){setShapeColor(color); setRadius(R);}
    @Override
    public String toString() {
        return "This is Circle, color: " + super.getShapeColor() +", radius=" + getRadius();
    }
}
