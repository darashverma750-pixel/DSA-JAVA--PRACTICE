public class book {
        String title;
        int price;

         book(String title,int price) {
            this.title  = title;
            this.price = price;
        }
        void print(){
            System.out.println(title+" "+price);
        }
    public static void main(String[] args) {
       book b1  = new book("oswal",10000);
       book b2  = new book("arihant",10000);
       b1.print();
       b2.print();

    }
}
