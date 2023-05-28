package abstractexample23;

/**
 * 21. Understanding the real scenario of Abstract class (Create package name
 * ‘abstractexample23’ and create all below classes in this package)
 */
public class TestAbstraction1
{
    public static void main(String args[])
    {
        Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}
