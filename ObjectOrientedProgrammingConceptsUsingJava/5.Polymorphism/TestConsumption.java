
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
        Vehicle car1 = new SportCar(200, 1500, 220); //creating an Object: horsepower | weight | aerodynamics | topspeed
        Vehicle car2 = new SportCar(100, 1000, 170); //creating an Object: horsepower | weight | aerodynamics | topspeed
        Vehicle car3 = new SportCar(135, 1100.2, 173); //creating an Object: horsepower | weight | aerodynamics | topspeed
        
        //Vehicle van = new Van(100, 0.9, 3500, 160.4); //creating an Object: horsepower | aerodynamics | weight | carryweight (CORRECT CODE DO NOT REMOVE)
        Vehicle van = new Van(100, 0.9, 3500, 160.4, 60); //creating an Object: horsepower | aerodynamics | weight | carryweight | topspeed
        
        
        SportCar sportcar1 = (SportCar) car1; //typecasting car1 to a type sportscar
        SportCar sportcar2 = (SportCar) car2; //typecasting car2 to a type sportscar
        SportCar sportcar3 = (SportCar) car3; //typecasting car3 to a type sportscar
        
        Van van1 = (Van) van;  //typecasting van1 to a type van        
        
        double car1fc = 0; //initialising car 1 fuel consumption
        double car2fc = 0; //initialising car 2 fuel consumption
        double car3fc = 0; //initialising car 3 fuel consumption
        
        car1fc = (1000+(car1.getWeight())/5) * ((sportcar1.getTopspeed())/100) * ((car1.getAerodynamics()) * (car1.getHorsepower()))/1000; //calculation fuel consumption 
        car2fc = (1000+(car2.getWeight())/5) * ((sportcar2.getTopspeed())/100) * ((car2.getAerodynamics()) * (car2.getHorsepower()))/1000; //calculation fuel consumption
        car3fc = (1000+(car3.getWeight())/5) * ((sportcar3.getTopspeed())/100) * ((car3.getAerodynamics()) * (car3.getHorsepower()))/1000; //calculation fuel consumption
       
        //double calcTopspeed = 0;
        //calcTopspeed = ((car2fc*1000)/((car2.getWeight()/5) * (car2.getAerodynamics()) * (car2.getHorsepower()))) * 100 - 1000;
        //calcTopspeed = ((car2fc * 1000) / ((car2.getWeight()/5) * (car2.getAerodynamics()) * (car2.getHorsepower()))) * 100;              
        //System.out.println("TOP SPEED FOR CAR 2: " + calcTopspeed); //TESTING
        
        
        //TESTING BEGINS
        System.out.println("START!"); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car 1 acceleration: " + car1.acceleration()); //TESTING
        System.out.println("Car 2 acceleration: " + car2.acceleration()); //TESTING
        System.out.println("Car 3 acceleration: " + car3.acceleration()); //TESTING
        System.out.println("Van 1 acceleration: " + van1.acceleration()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Van Horsepower is: " + van.getHorsepower()); //TESTING
        System.out.println("Van Weight is: " + van.getWeight()); //TESTING
        System.out.println("Van Carry-Weight is: " + van1.getCarryweight()); //TESTING
        System.out.println("Van Aerodynamics is: " + van.getAerodynamics()); //TESTING
        System.out.println("Van1 Aerodynamics is: " + van1.getAerodynamics()); //TESTING
        System.out.println("Van1 Topspeed is: " + van1.getTopspeed()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car1 Horsepower is: " + car1.getHorsepower()); //TESTING
        System.out.println("Car1 Weight is: " + car1.getWeight()); //TESTING
        System.out.println("Car1 Topspeed is: " + sportcar1.getTopspeed()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car2 Horsepower is: " + car2.getHorsepower()); //TESTING
        System.out.println("Car2 Weight is: " + car2.getWeight()); //TESTING
        System.out.println("Car2 Topspeed is: " + sportcar2.getTopspeed()); //TESTING
        System.out.println(); //TESTING
        System.out.println("Car3 Horsepower is: " + car3.getHorsepower()); //TESTING
        System.out.println("Car3 Weight is: " + car3.getWeight()); //TESTING
        System.out.println("Car3 Topspeed is: " + sportcar3.getTopspeed()); //TESTING
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
