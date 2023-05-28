package encapsulation26;

/**
 * 26. Encapsulations example (Create package name ‘encapsulation26’ and create all
 * below classes in this package)
 */
public class TestEncapsulation
{
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        // Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation
        // System.out.println("Prime's rollNo : " + obj.geekName);
    }

}
