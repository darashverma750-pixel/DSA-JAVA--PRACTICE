public class kitab {
   public static class book{
        String title;
        int price;

        public book(String title,int price) {
            this.title  = title;
            this.price = price;
        }
        void print(){
            System.out.println(title+" "+price);
        }
    
    }

    public static void main(String[] args) {
    book b1 = new book("oswal",10000);
    book b2 = new book("complex",20000);

       b1.print(); 
       b2.print(); 

    }
    
  }


