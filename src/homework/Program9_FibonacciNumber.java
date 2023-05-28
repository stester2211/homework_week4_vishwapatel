package homework;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
import java.util.Scanner;
public class Program9_FibonacciNumber
{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        fibonacciNumber();
    }
    public static void fibonacciNumber()
    {
        int n = 8, firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(firstTerm + " ");
            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
