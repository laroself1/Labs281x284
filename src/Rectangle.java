import com.brainacad.oop.testshapes.Shape;

public class Rectangle extends Shape {
    private  double height;
    private   double width;


    public double getHeight() {  return height; }
    public void setHeight(double height) {  this.height = height;  }

    public double getWidth() {   return width;   }
    public void setWidth(double width) {    this.width = width;  }
    @Override
    public double calcArea(){double area = getHeight()*getWidth();

        return area;}

    @Override
    public String toString() {
        return "This is Rectangle" + ", color: "+ super.getShapeColor()+
                " height=" + height +
                ", width=" + width     ;
            }
    public Rectangle(String color, double width, double height){
        setShapeColor(color);
        setWidth(width);
        setHeight(height);
    }
}
