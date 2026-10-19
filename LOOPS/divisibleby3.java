
import java.util.Scanner;

public class divisibleby3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("ENTER THE VALUE OF N :");
        int n = sc.nextInt();
        for(int i = 1 ; i <=n ; i = i +1 ){
            if (i% 3 == 0){
                System.out.println(i);

            }
            

    }
    
}
}
