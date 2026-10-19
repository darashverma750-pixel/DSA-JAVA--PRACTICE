public class minofarray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,3};
        int min = arr[0];
        for(int i = 0 ;i<arr.length;i++){
            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println(min);
    }
    
}
