package homework;
/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Program15_StarNum
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        star();
    }
    public static void star()
    {
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();

        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
