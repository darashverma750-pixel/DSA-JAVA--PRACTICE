import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("enter the number ");
        int n = sc.nextInt();
        if(n>9 && n<100){
            System.err.println("the number is two digit number ");
        }
        else {
            System.err.println("the number is not the two digit number ");
        }
    }
    
}
