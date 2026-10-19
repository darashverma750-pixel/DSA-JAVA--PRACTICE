public class countzeroesandones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,0,0,1,0,1};
        int countones = 0;
        int countzeroes = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 1) countones++;
            else countzeroes++;
        }
        System.out.println("countones = "+countones);
        System.out.println("countzeroes = "+countzeroes);


    }
    
}
