
/**
 * Write a description of class TestCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCounter
{
    public static void main(String[] args){
        
        Counter ctr = new Counter(0);//task 1  //creating an Object
        
        ctr.increment();//task 2 // Object calling Instance method
        
        System.out.println((int)ctr.getValue());//task 3
        
        ctr.reset();//task 4 // Object calling Instance method
        System.out.println((int)ctr.getValue());//testing task 4
    }
}
