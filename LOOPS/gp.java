import java.util.Scanner;

public class gp {
                public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF N :");
        int n = sc.nextInt();
        System.out.print("ENTER THE VALUE OF first term :");
        int a = sc.nextInt();
        System.out.print("ENTER THE VALUE OF common difference :");
        int r = sc.nextInt();
        for(int i = 1; i <=n ; i++ ){ 
              System.out.print(a+" ");
                a = a * r ;

            }
            

    }
        
   
}  

