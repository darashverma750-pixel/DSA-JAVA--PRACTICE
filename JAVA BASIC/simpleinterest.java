
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of principle  :");
        int p = sc.nextInt();
        System.out.print("enter the value of rate  :");
        double r = sc.nextDouble();
        System.out.print("enter the value of time  :");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("the simple interest is :"+si);


    }
    
}
