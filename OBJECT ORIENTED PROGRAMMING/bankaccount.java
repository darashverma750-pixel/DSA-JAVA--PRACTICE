

public class bankaccount {
    private double balance;
    private String accoutnumber;

    public bankaccount(double balance, String accoutnumber) {
        this.balance = balance;
        this.accoutnumber = accoutnumber;
    }

    
    void deposite(double amount){
        balance = balance + amount;
        System.out.println(balance+" = rupees amount deposite sussefully ");
    }
    void withdraw(double amount){
        if (balance > amount ){
            balance = balance - amount;
            System.out.println("amount withdraw sussesfully = "+balance);
        }
        else{
                System.out.println("insufficient balance");
            }
         
        }

    public double getBalance() {
        return balance;
    }
        public static void main(String[] args) {
            bankaccount  b1 = new bankaccount(5000, "12345");
            b1.deposite(10000);
            b1.withdraw(2000);
            System.out.println("current balance = "+b1.getBalance());
            
        }
}    

    

