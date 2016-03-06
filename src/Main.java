import com.brainacad.oop.testshapes.Circle;
import com.brainacad.oop.testshapes.Shape;

public class Main{
    public static void main(String[] args) {
        double totalShapeArea=0;
        double trianglesArea = 0;
        double rectanglesArea = 0;
        double circlesArea = 0;

        Shape A = new Shape();
        A.setShapeColor("RED");
        System.out.println(A.toString());
        System.out.println("area is:" + A.calcArea());

        Rectangle H = new Rectangle("RED", 1024,768);
        System.out.println(H.toString());
        System.out.println("area is:" + H.calcArea());

        Rectangle D = new Rectangle("RED", 1024,768);
        Rectangle F = new Rectangle("BLUE", 1280,1024);
        Rectangle G = new Rectangle("RED", 2048,768);
        Rectangle J = new Rectangle("YELLOW", 1024,769);

        Triangle T = new Triangle("GREEN",4,5.9,3);
        System.out.println(T.toString());
        System.out.println("area is:" + T.calcArea());
        Triangle Y = new Triangle("BLACK",4,7,8);

        Circle Z = new Circle("BLUE", 10.0);
        System.out.println(Z.toString());
        System.out.println(Z.calcArea());
        Circle X = new Circle("CYAN", 20.0);
        System.out.println();

//2.7.10 Lab

        Shape [] arr = {H,D,F,G,J,T,Y,Z,X};
        for (Shape P:arr ) {
            System.out.print(P.toString());
            System.out.print(", area is: ");
            System.out.println(P.calcArea()); }
        for (int i = 0; i<arr.length; i++){totalShapeArea += arr[i].calcArea();
        if (arr[i]instanceof Circle){circlesArea += arr[i].calcArea();}
        if (arr[i]instanceof Rectangle){rectanglesArea+=arr[i].calcArea();}
        if (arr[i]instanceof Triangle){trianglesArea+=arr[i].calcArea();   }    }

        System.out.println("area of all figures is: " + totalShapeArea);
        System.out.println("area of circles is: " +circlesArea);
        System.out.println("area of rectangles is: " + rectanglesArea);
        System.out.println("area of triangles is: " + trianglesArea);

         }}

