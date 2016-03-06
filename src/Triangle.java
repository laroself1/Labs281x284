import com.brainacad.oop.testshapes.Shape;

public class Triangle extends Shape{
    private  double a;
    private  double b;
    private  double c;

    public double getA() {   return a; }
    public void setA(double a) {  this.a = a; }
    public double getB() {  return b;  }
    public void setB(double b) { this.b = b;  }
    public double getC() {    return c;  }
    public void setC(double c) {   this.c = c;  }


    @Override
    public double calcArea(){
        double S = (getA()+getB()+getC())/2;
        double area = Math.sqrt(S*(S-getA())*(S-getB())*(S-getC()));
            return area;}

    @Override
    public String toString() {
        return "This is Triangle, " +  "color: "+super.getShapeColor()+
                " a=" + a +
                ", b=" + b +
                ", c=" + c;    }
    public  Triangle(String color, double a, double b, double c){
        Shape(color);
        setA(a);
        setB(b);
        setC(c);
    }
}
