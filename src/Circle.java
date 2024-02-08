import java.util.Scanner;

public class Circle {
    int r ;
public Circle(int r){
   this.r=r;

    int area = (int) (Math.PI*r*r);
    System.out.println("area of circle is "+area);;

}
public int Circumference(){
    int Cir = (int) (2*Math.PI*r);
    return Cir;

}

    public static void main(String[] args) {
        Circle sc = new Circle(52);


      int Cir=  sc.Circumference();

        System.out.println("circumference of circle is "+Cir);
    }
}
