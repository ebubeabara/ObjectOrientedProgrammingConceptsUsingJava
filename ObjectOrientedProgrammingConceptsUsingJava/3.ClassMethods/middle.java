
/**
 * Write a description of class exercise3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class middle
{
    public static void main(String[] args)
    {
        double paramOne = Double.parseDouble(args[0]); //converting string to double
        double paramTwo = Double.parseDouble(args[1]); //converting string to double
        double paramThree = Double.parseDouble(args[2]); //converting string to double        
        double array[] = {paramOne, paramTwo, paramThree}; //initialising array and adding array values       
        String answer = "";
        
        answer = middle(array); //passing array parameter into middle method
        System.out.println("FINAL ANSWER:- " + answer); //TESTING
        System.exit(0);
    }    
    
    //middle class method collects three values and uses bubble sort to find the middle value
    public static String middle(double[] array)
    {
        String outputMessage = ""; //initialising class method variable
    
        boolean sorted = false; //initialising sorted boolean type to false
        
        while(!sorted)
        {
            sorted = true;
            
            //for loop for bubble sort
            for(int i=0; i < array.length-1; i++)
            {
                if(array[i] > array[i+1])
                {
                    double tempValue = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tempValue;
                    sorted = false;
                }
            }
        }
        
        outputMessage = Double.toString(array[1]); //converting array[1] value from double to string
        System.out.println("Middle value: " + outputMessage); //TESTING        
        return outputMessage;
    }
}
