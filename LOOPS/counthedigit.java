import java.util.Scanner;
public class counthedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n/=10;  //dived by ten to remove the last digit 
            count++;

        }
        System.out.println(count);
    }
}

