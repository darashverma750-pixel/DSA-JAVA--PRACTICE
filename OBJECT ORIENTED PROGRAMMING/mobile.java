public class mobile {
    String brand;
    int price;

    public mobile(String brand,int price) {
        this.brand = brand;
        this.price = price;
    }
  void print(){
    System.out.println("the brand of moblie phone is "+brand);
    System.out.println("the price of moblie phone is " +price);

  }    
  public static void main(String[] args) {
      mobile m1 = new mobile("vivo",15000);
      m1.print();
  }
    
}
