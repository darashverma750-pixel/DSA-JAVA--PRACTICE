public class passbyvaluemethod {
    public static void main(String[] args) {
        int[] x = {10,20,30,40};
        System.out.println(x[1]+" ");
        Change(x);
        System.out.println(x[1]+" ");

    }
    public static void Change(int[] x) {
        x[1] = 400;
        
        
    }
}
