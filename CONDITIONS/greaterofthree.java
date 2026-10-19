
import java.util.Scanner;

public class greaterofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age of ram :");
        int ram = sc.nextInt();
         System.out.print("enter the age of shyam :");
        int shyam = sc.nextInt();
         System.out.print("enter the age of ajay :");
        int ajay = sc.nextInt();
        if (ram > shyam){
            if (ram > ajay)
                System.out.println("ram is greatest ");
            else 
                System.out.println("ajay is the greatest ");
        }
        else {
            if (shyam>ajay)
              System.out.println("shyam is greatest ");
            else
                System.out.println("ajay is gratest ");
        }








    }
    
}
