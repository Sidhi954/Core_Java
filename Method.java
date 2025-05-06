class Account{
    private String account_no="3465768903456";
    private int balance=20000;                //private members are accessed by getter and setter
    public int getBalance(){
        return balance;
    }
    public String getAccountNo(){
        return account_no;
    }
    public int setBalance(int num){
        return balance+=num;
    }

}
class Stationary{
    public void getPen(){                    //Instance method in different class
        System.out.println("Blue Pen");
    }
}
public class Method {

    public static void main(String[] args){      //static method
        
        Stationary obj=new Stationary();     //Here obj is my reference variable 
        obj.getPen();

        Account acc1=new Account();
        acc1.setBalance(10000);
        System.out.println("Current balance in account: "+acc1.getBalance());
        System.out.println("Your account number is: "+acc1.getAccountNo());   
    }
}
