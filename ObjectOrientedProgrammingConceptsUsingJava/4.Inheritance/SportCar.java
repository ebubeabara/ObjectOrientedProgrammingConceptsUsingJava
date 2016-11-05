
/**
 * Write a description of class SportCar here.
 * 
 * @author (Ebube Abara) 
 * @version (a version number or a date)
 */
public class SportCar extends Vehicle
{
    private double topspeed; //state: instance variable
    
    //constructor
    public SportCar(double h, double w, double a, double t)
    {
        super(h, w, a); //explicit call to superclass Vehicle constructor
        topspeed = t;
    }
    
    //instance getter method
    public double getTopspeed()
    {
        return topspeed;
    }
}
