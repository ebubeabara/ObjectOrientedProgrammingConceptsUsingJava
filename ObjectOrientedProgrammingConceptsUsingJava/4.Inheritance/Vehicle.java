
/**
 * Write a description of class Vehicle here.
 * 
 * @author (Ebube Abara) 
 * @version (a version number or a date)
 */
public class Vehicle
{    
    private double horsepower; //state: instance variable
    private double aerodynamics; //state: instance variable
    private double weight; //state: instance variable
    
    //constructor
    public Vehicle(double h, double w, double a)
    {
        horsepower = h;
        weight = w;
        aerodynamics = a;
    }
    
    //instance getter method
    public double getHorsepower()
    {
        return horsepower;
    }
    
    //instance getter method
    public double getAerodynamics()
    {
        return aerodynamics;
    }
    
    //instance getter method
    public double getWeight()
    {
        return weight;
    }
}
