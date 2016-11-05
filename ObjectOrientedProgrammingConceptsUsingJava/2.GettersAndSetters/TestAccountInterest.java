
/**
 * Write a description of class TestAccountInterest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAccountInterest
{
    
    public static void main(String[] args)
    {
        Account account1 = new Account(0); //creating an object
        Account account2 = new Account(0); //creating an object
        System.out.println("Account 1 balance: " + (double)account1.getBalance()); //TESTING
        System.out.println("Account 2 balance: " + (double)account2.getBalance()); //TESTING
        
        account1.deposit(500); //DEPOSIT 500 IN ACCOUNT 1
        account2.deposit(100); //DEPOSIT 100 IN ACCOUNT 2
        System.out.println("Account 1 balance after deposit: " + (double)account1.getBalance()); //TESTING
        System.out.println("Account 2 balance after deposit: " + (double)account2.getBalance()); //TESTING
        
        //account1.getBalance(setInterest(computeInterest(12))); //WRONG
        account1.computeInterest(12); //CALCULATE ACCOUNT 1 INTEREST AFTER 12 MONTHS
        account2.computeInterest(12); //CALCULATE ACCOUNT 2 INTEREST AFTER 12 MONTHS
        
        account1.setInterest(0.1);
        account2.setInterest(0.1);
        
        account1.getBalance(); //GET ACCOUNT 1 BALANCE
        account2.getBalance(); //GET ACCOUNT 2 BALANCE
        System.out.println("Account 1 balance after 12 months: " + (double)account1.getBalance()); //TESTING
        System.out.println("Account 2 balance after 12 months: " + (double)account2.getBalance()); //TESTING
        
        account1.computeInterest(24); //CALCULATE ACCOUNT 1 INTEREST AFTER 24 MONTHS
        account2.computeInterest(24); //CALCULATE ACCOUNT 2 INTEREST AFTER 24 MONTHS
        
        account1.getBalance(); //GET ACCOUNT 1 BALANCE
        account2.getBalance(); //GET ACCOUNT 2 BALANCE
        System.out.println("Account 1 balance after 24 months: " + (double)account1.getBalance()); //TESTING
        System.out.println("Account 2 balance after 24 months: " + (double)account2.getBalance()); //TESTING
        
        System.out.println("Finished!!!");
    }
    
   
/**    public static void main(String[] args){
        Account acc1=new Account(100); //creating objects
        System.out.println("Account 1: " + (int)acc1.getBalance());//testing
        Account acc2=new Account(1000);
        System.out.println("Account 2: " + (int)acc2.getBalance());//testing
        Account acc3=new Account();
        System.out.println("Account 3: " + (int)acc3.getBalance());//testing
        System.out.println("Hello Ebube");
        acc1.deposit(500); //calling instance methods
        System.out.println("Account 1: " + (int)acc1.getBalance());//testing
        acc2.deposit(acc3.getBalance()*2);
        System.out.println("Account 2: " + (int)acc2.getBalance());//testing
        acc2.deposit(acc1.getBalance()*2);
        System.out.println("Account 2: " + (int)acc2.getBalance());//testing
        acc1.transfer(acc2,100);
        System.out.println("Account 1: " + (int)acc1.getBalance());//testing
        
        //for(int i=0; i<10;i++){
        //    int amount=(int)(Math.random()*100);
        //    System.out.println(amount);//testing
        //    acc1.transfer(acc2,amount);
        //    System.out.println("Account 1: " + (int)acc1.getBalance());//testing
        //    acc2.transfer(acc2,amount*3);
        //    System.out.println("Account 2: " + (int)acc2.getBalance());//testing
        //    acc3.transfer(acc1,acc1.getBalance()/2);
        //   System.out.println("Account 3: " + (int)acc3.getBalance());//testing
        //    System.out.println((int)acc1.getBalance()+" "+(int)acc2.getBalance()+" "+(int)acc1.getBalance());
        //}
    }
    */
}



// instance variables - replace the example below with your own
//private int x;
/**
* Constructor for objects of class TestAccountInterest
*/
//public TestAccountInterest()
//{
// initialise instance variables
//    x = 0;
//}
/**
* An example of a method - replace this comment with your own
* 
* @param  y   a sample parameter for a method
* @return     the sum of x and y 
*/
//public int sampleMethod(int y)
//{
// put your code here
//    return x + y;
//}