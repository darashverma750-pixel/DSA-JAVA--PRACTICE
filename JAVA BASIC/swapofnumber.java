
import java.util.Scanner;

public class swapofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a :-");
        int a = sc.nextInt();
        System.out.print("enter the value of b :-");
        int b = sc.nextInt();
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("the value of a is : "+a );
        System.out.println("the value of b is : "+b);

    }
    
}
