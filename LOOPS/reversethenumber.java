import java.util.Scanner;
public class reversethenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the diggit that you want to reverse :");
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0){
            int lastdigit = n%10;    // get the last digit 
            rev = rev * 10;          // bulid to reverse the number 
            rev = rev + lastdigit;    
            n = n / 10;                // remove the last digit 

        }
        System.out.println("the reverse of the number is :" +rev);

    }
    
}
