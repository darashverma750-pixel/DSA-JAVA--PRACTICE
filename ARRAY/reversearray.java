public class reversearray {
    public static void main(String[] args) {
        int[] arr = {12,15,13,85};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println("");
          for(int ele : arr){
            System.out.print(ele +" ");
          } 


        
    }
    public static void reverse(int[] arr) {
        int i = 0; int j = arr.length-1;
        while(i < j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
    }
}
