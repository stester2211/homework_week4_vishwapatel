package homework;
/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 5
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

import java.util.Scanner;
public class Program6_TriangleNum
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Program6_TriangleNum obj=new Program6_TriangleNum();
        obj.pattern();
    }
    public void pattern()
    {
        int i,j,n;
        System.out.print("Input number of rows : ");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
