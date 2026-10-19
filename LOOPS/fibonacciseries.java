
import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term :");
        int term = sc.nextInt();
        int a = 0 ,b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 1; i<= term;i++){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
    
}
