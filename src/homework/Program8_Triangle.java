package homework;
/**
 *8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Program8_Triangle
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        triangle();
    }
    public static void triangle()
    {
        System.out.print("Enter the number of rows : ");
        int row=sc.nextInt();

        for (int x = 1; x <= row; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }
}
