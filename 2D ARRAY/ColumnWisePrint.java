public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{1,20,3},{4,5,6},{7,8,9}};
        for(int j  = 0; j <= arr[0].length - 1;j++){
            for(int i = 0; i < arr.length;i++){
                System.out.print(arr[i][j]+" ");         
            }
     System.out.println("");
        }
    
    }
}