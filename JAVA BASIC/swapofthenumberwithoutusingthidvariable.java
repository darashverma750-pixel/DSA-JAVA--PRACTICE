
import java.util.Scanner;

public class swapofthenumberwithoutusingthidvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x is :-");
        int x = sc.nextInt();
        System.out.print("enter the value of y is :-");
        int y = sc.nextInt();
        x = x + y;  // if x is 10 and y is 20 then it will change the x is equal to the 30.
        y = x - y;  // then y is change 30 - 20 then it mean that it reverse the number of x into y.
        x = x - y;  // it will used to reverse the value of x = 30 - 10 = 20 is the value of x .
        System.out.println("the swap value of x is :-"+x);
        System.out.println("the swap value of y is :-"+y);


    }
}
