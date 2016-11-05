
/**
 * Write a description of class Van here.
 * 
 * @author (Ebube Abara) 
 * @version (a version number or a date)
 */
public class Van extends Vehicle
{
    private double horsepower; //state: instance variable    
    private double aerodynamics; //state: instance variable
    private double weight; //state: instance variable
    private double carryweight; //state: instance variable    
    private double acceleration; //state: instance variable
    
    private double topspeed; //state: instance variable
    
    //constructor
    public Van(double h, double a, double w, double cw, double t)
    {
        super(h, w, a); //explicit call to superclass Vehicle constructor
        horsepower = h;
        aerodynamics = a;
        weight = w;
        carryweight = cw;
        topspeed= t;
    }
    
    
    
    //constructor    
    //public Van(double h, double a, double w, double cw)
    //{
    //    super(h, w, a); //explicit call to superclass Vehicle constructor
    //    horsepower = h;
    //    aerodynamics = a;
    //    weight = w;
    //    carryweight = cw;        
    //}
    
    //instance getter method
    public double getCarryweight()
    {
        return carryweight;
    }
    
    @Override
    public double acceleration()
    {
        acceleration = ((100/horsepower)*(aerodynamics/2)*weight/100);
        System.out.println(acceleration);
        return acceleration; 
    }
    
    public double getTopspeed()
    {
        return topspeed;
    }
    
}
