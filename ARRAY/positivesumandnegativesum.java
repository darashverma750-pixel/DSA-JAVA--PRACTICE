public class positivesumandnegativesum {
    public static void main(String[] args) {
        int[] arr = {1,-8,-5,-6,8,2,3};
        int positvesum = 0;
        int negativesum = 0;
        for (int i = 0; i < arr.length; i++){
        if (arr[i]>0) 
            positvesum = positvesum + arr[i];
        else
            negativesum = negativesum + arr[i];
        }
        System.out.println(positvesum+" ");
        System.out.println(negativesum+" ");

    }
}
