package homework;
/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 */

import java.util.Scanner;

public class Program14_Diamond
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        diamond();
    }
    public static void diamond()
    {
        System.out.print("Enter the numbers: ");
        int number=sc.nextInt();
        int m, n;
        for (m = 1; m <= number; m++)
        {
            for (n = 1; n <= number - m; n++)
            {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (m = number - 1; m > 0; m--)
        {
            for (n = 1; n <= number - m; n++)
            {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
