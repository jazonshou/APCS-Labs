public class CoolChicken 
{
    // instance variables
    private int wingCount;
    //add speed
    private double speed;
    //add name
    private String name;
    
    public CoolChicken( double s, int wc, String n )
    {
        //add code
        speed = s; wingCount = wc; name = n;
    }
    
    public double maxSpeed()
    {
        return wingCount * speed;  //add code
    }
    
    public boolean isCool()
    {
        //add code 
        return maxSpeed() > 1000 && name.indexOf("cool") >= 0;
    }
}