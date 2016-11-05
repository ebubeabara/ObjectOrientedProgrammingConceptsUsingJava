
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
    public SportCar(double h, double w, double t)
    {
        super(h, w, 0.5); //explicit call to superclass Vehicle constructor
        topspeed = t;
    }    
    
    //public SportCar(double h, double w, double ae)
    //{
    //    super(h, w, ae); //explicit call to superclass Vehicle constructor
    //    topspeed = t;
    //}
    
    //instance getter method
    public double getTopspeed()
    {
        return topspeed;
    }
    
}
