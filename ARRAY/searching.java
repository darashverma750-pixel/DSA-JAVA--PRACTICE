

public class searching{
    public static void main(String[] args) {
        int[] arr = {15,20,58,89,54,64};
        int target = 54;
        boolean flag = false;
        for(int i = 0; i<arr.length;i++){
          if(arr[i]==target){
            flag = true;
          }

        }
        if(flag == true)  System.out.println("target is found ");
        else System.out.println("target is not found");
        }    
        }