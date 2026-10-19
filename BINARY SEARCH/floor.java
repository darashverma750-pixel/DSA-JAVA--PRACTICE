public class floor {
    public static void main(String[] args) {
        int[] arr = {1,2,4,10,10,12,19};
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        int x = 5;
        while(left<=right){
           int mid = (left + right)/2;
        if(arr[mid]>x){
            right = mid - 1;
        }
        else if(arr[mid]<= x ){
           index = mid;
           left = mid + 1; 
        }    
        }
        System.out.println("idex no of the flooer is "+index);   
        }
    }

