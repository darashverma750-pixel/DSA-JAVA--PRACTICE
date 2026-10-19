public class Bubble {
    public static void print(int[] arr) {
        int  n = arr.length;
        for(int i = 0; i < n - 1; i++ ){
            for(int j = 0; j < n - 1 - i; j++){
                if ( arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,-5,4,6,7,3,9};
        for(int i = 0; i<arr.length-1;i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println("");
        int n = arr.length;
        print(arr);
        for(int i = 0; i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}