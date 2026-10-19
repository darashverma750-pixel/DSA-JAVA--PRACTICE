public class RowWithMaximumSum {
    public static void main(String[] args) {
    int[][] arr = {{1,20,3},{4,5,6},{7,8,9}};
    int maxsum = Integer.MIN_VALUE;
    int idx = -1;
    for(int i = 0; i<arr.length;i++){
        int sum =0;
        for(int j = 0; j<arr[0].length;j++){
            sum = sum + arr[i][j];
            
        }
        if( sum > maxsum){
           maxsum = sum;
           idx = i;
        }
    }
    System.out.println(maxsum+"");
    System.out.println(idx+"");

    }
}
