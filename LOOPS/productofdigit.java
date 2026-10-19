import java.util.Scanner;

public class productofdigit {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int product = 1;
        while(n!=0){
           
            int lastdigit = n%10;
            if(lastdigit%2==0)

            product  = product * lastdigit;
            n/=10;
            

        } 
        System.out.print("the product of the n varaible is :" +product);
    }
}

