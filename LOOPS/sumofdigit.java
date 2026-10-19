import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int lastdigit = n%10;

            sum = sum + lastdigit;
            n/=10;

        } 
        System.out.print("the sum of the n varaible is :" +sum);
    }
}
