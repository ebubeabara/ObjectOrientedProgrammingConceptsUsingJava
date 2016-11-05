
/**
 * Write a description of class TestConsumption here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestConsumption
{
    public static void main(String[] args)
    {
        SportCar car1 = new SportCar(200, 1500, 0.5, 220); //creating an Object
        SportCar car2 = new SportCar(100, 1000, 0.5, 170); //creating an Object
        SportCar car3 = new SportCar(135, 1100.2, 0.5, 173); //creating an Object
        
        double car1fc = 0; //initialising car 1 fuel consumption
        double car2fc = 0; //initialising car 2 fuel consumption
        double car3fc = 0; //initialising car 3 fuel consumption
        
        car1fc = (1000+(car1.getWeight())/5) * ((car1.getTopspeed())/100) * ((car1.getAerodynamics())*(car1.getHorsepower()))/1000; //calculation fuel consumption 
        car2fc = (1000+(car2.getWeight())/5) * ((car2.getTopspeed())/100) * ((car2.getAerodynamics())*(car2.getHorsepower()))/1000; //calculation fuel consumption
        car3fc = (1000+(car3.getWeight())/5) * ((car3.getTopspeed())/100) * ((car3.getAerodynamics())*(car3.getHorsepower()))/1000; //calculation fuel consumption
        
        //TESTING BEGINS
        System.out.println("START!"); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car1 Horsepower is: " + car1.getHorsepower()); //TESTING
        System.out.println("Car1 Weight is: " + car1.getWeight()); //TESTING
        System.out.println("Car1 Topspeed is: " + car1.getTopspeed()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car2 Horsepower is: " + car2.getHorsepower()); //TESTING
        System.out.println("Car2 Weight is: " + car2.getWeight()); //TESTING
        System.out.println("Car2 Topspeed is: " + car2.getTopspeed()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car3 Horsepower is: " + car3.getHorsepower()); //TESTING
        System.out.println("Car3 Weight is: " + car3.getWeight()); //TESTING
        System.out.println("Car3 Topspeed is: " + car3.getTopspeed()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car1 aerodynamics: " + car1.getAerodynamics()); //TESTING
        System.out.println("Car2 aerodynamics: " + car2.getAerodynamics()); //TESTING
        System.out.println("Car3 aerodynamics: " + car3.getAerodynamics()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Fuel Consumption of CAR 1 is " + car1fc); //TESTING
        System.out.println("Fuel Consumption of CAR 2 is " + car2fc); //TESTING
        System.out.println("Fuel Consumption of CAR 3 is " + car3fc); //TESTING
        System.out.println(); //TESTING
        System.out.println("FINISH!!!"); //TESTING
        //TESTING FINISHED
        
        System.exit(0); //end program
    }
}
