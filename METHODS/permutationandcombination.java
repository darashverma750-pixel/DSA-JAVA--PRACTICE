
import java.util.Scanner;

public class permutationandcombination {
    public static int fact(int x) {
        int fact = 1;
        for(int i =1; i <= x; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("total number of object :-");
        int n = sc.nextInt();
        System.out.print("total number of object choosen at once is  :-");
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r) * fact(n-r));
        System.out.println(ncr+" is the combination of this ");
        
    }
    
}
