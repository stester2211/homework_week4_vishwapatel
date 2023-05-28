package homework;

/**
 * 5. Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 */

import java.util.Scanner;

public class Program5_PalindromeNum
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String [] args)
    {
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("The number you enter " +num+ " to check is it palindrome number is : "+ isPalindrome(num));
    }

    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int originalNumber = number;

        while (number !=0)
        {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
