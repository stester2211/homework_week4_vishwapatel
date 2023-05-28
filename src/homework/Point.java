package homework;

/**
 * 16. Point
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 */
public class Point
{
    int x;
    int y;
    public static void main(String[] args)
    {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
    public Point()
    {
    }
    public Point( int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public double distance()
    {
        return distance(0,0);
    }
    public double distance(Point another)
    {
        return distance(another.getX(), another.getY());
    }
    public double distance(int x, int y)
    {
        return Math.sqrt(((x-this.x) * (x-this.x)) + ((y-this.y) * (y-this.y)));
    }

}
