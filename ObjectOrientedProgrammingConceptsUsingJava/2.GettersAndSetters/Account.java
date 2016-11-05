
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Account
{
    
    private double balance; //state: instance variables
    public double interestRate; //state: instance variables
    
    public Account(double inputBalance)
    {
        balance = inputBalance;
    }
    
    //indtance method
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println(balance); //TESTING
    }
    
    //instance method
    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance = balance - amount;
            System.out.println(balance); //TESTING
        }
        else
        {
            System.out.println("insufficient funds");
        }
    }
    
    //instance method
    public double getBalance()
    {
        System.out.println("Balance: " + balance); //TESTING
        return balance;
    }
    
    //instance method
    public void setInterest(double rate)
    {
        //rate = 0.1;
        interestRate = rate;
        System.out.println("Interest Rate: " + interestRate); //TESTING
        //return interestRate;
    }
    
    //instance method
    public double computeInterest(int n)
    {
        balance = balance * Math.pow((1 + interestRate),(n/12));
        System.out.println(balance); //TESTING
        return balance;
    }
    
    
    /** 
    private double balance; //state: instance variable
    
    //constructors: to initialise objects to creayte an instance
    public Account(double amount){
        balance = amount;
    }
    
    public Account(){
        balance = 0; 
    }

    //behaviour: instance methods, to change or show the state of account
    public void deposit(double amount){
        balance=balance+amount;
    }
    
    public void withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;}
        else{
            System.out.println("not enough funds");
        }
    }

    public void transfer(Account acc,double amount){
        if (acc.getBalance()>=amount){
            balance = balance+amount;
            acc.withdraw(amount);}
        else{
            System.out.println("not enough funds");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void close(){
        balance =0;
    }
    */
}
