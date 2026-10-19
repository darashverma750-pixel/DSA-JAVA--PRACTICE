
import java.util.Scanner;

public class percentageofstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks of mathmetic :-");
        int m = sc.nextInt();
        System.out.print("enter the marks of english :-");
        int e = sc.nextInt();
        System.out.print("enter the marks of science :-");
        int s = sc.nextInt();
        System.out.print("enter the marks of socical science :-");
        int soc = sc.nextInt();
         System.out.print("enter the marks of hindi :-");
        int h = sc.nextInt();
        int  total = m + e + s + soc + h;
        int maxtotal = 500;
        double percentage = (total * 100) / maxtotal;
        System.out.println("the total number is :"+total);
        System.out.println("the percentage of the given marks are is :"+percentage);
    }    
}
