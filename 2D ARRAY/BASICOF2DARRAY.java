
import java.util.Scanner;

public class BASICOF2DARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input 
        int [][]arr = new int[3][4];
        for (int i = 0; i<arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                System.err.println("the vlaue for row = "+ i + " and the col = " +j);
                  arr[i][j] = sc.nextInt();
            }
            // output 
            for (int rowindex = 0; rowindex < arr.length; rowindex++){
                for (int columnindex = 0; columnindex < arr[rowindex].length;columnindex++){
                    System.out.print(arr[rowindex][columnindex] + " ");
                }
                System.out.println("");
            }
        }
    }
}
