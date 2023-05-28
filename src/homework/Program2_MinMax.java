package homework;

/**
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */

import java.util.Scanner;

public class Program2_MinMax
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Program2_MinMax obj=new Program2_MinMax();
        obj.MinAndMaxInputChallenge();
    }

    public void MinAndMaxInputChallenge()
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {

            System.out.print("Enter number: ");

            boolean isAnInt = sc.hasNextInt();

            if (isAnInt)
            {
                int number = sc.nextInt();

                if(number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            else
            {
                System.out.println("Invalid Number");
                break;
            }
            sc.nextLine();
        }
        System.out.println("Max = " + max + " and = " + min);
        sc.close();
    }
}
