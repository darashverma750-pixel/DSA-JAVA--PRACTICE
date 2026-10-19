public class Reverse {
    public static void main(String[] args) {
        int[][] arr = {{1,20,3},{4,5,6,29},{7,8,9,7}};
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i].length-1; j >= 0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
