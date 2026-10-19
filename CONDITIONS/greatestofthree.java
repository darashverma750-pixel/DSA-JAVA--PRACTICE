
import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("enter the value of x :");
        int x = sc.nextInt();
         System.err.print("enter the value of y :");
        int y = sc.nextInt();
         System.err.print("enter the value of z :");
        int z = sc.nextInt();

        if(x > y && x > z){
            System.out.println("the x is the greatest number ");
        }
        if (y>x && y>z){
            System.out.println("the y is the greatest number ");

        }
        if (z>x && z>y){
            System.out.println("the z is the greatest number ");
        }
        
    }
}
