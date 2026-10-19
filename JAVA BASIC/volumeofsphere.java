
import java.util.Scanner;

public class volumeofsphere {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the radius : ");
    int r = sc.nextInt();
    double volume = (4.0 / 3.0) * 3.1415 * r * r * r;
    System.out.println("the volume of sphere is :"+volume); 
}    
}
