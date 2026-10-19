 import java.util.Scanner;

public class smallalphabet {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row :");
        int row = sc.nextInt();
        System.out.println("enter the column :");
        int col = sc.nextInt();
        for(int i = 1 ; i <= row ;i++){
            for(int j = 1; j <= col; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}


