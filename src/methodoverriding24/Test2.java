package methodoverriding24;

/**
 * 24. A real example of Java Method Overriding (Create package name
 * ‘methodoverriding24’ and create all below classes in this package)
 */
public class Test2
{
    public static void main(String[] args)
    {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
