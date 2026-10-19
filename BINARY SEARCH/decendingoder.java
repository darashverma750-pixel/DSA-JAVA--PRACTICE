public class decendingoder {
    public static void main(String[] args) {
    int[] arr = {100,97,87,76,66,52,35,29,13,5};
    int n = arr.length;
    int low = 0;
    int high = n - 1;
    int tar = 29;
    boolean found = false;
    while( low <= high ){
       int mid = (low + high)/2;
    if(arr[mid] > tar){
        low  = mid + 1; 
    }
    else if(arr[mid] < tar){
        high = mid - 1;
    }
    else{
        found = true;
        System.out.println("target found at index "+mid);
        break;
    }
    }
    if(!found)
    System.out.println("target is not found ");
}
}



