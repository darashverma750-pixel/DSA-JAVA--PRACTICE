
import java.util.Scanner;

public class AREAOFCIRCLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius :- ");
        double r = sc.nextInt();
        double area = 3.1415 * r * r;
        System.out.println("the area of circle is :" +area);


    }
    
}
