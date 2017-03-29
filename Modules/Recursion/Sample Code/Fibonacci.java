/**
 * This program will recursively compute the nth Fibonacci number and print it.
 */
public class Fibonacci
{
  // Which Fibonacci number to compute
  private static final int N = 7;


  /**
   * Method to recursively compute the nth Fibonacci number.
   */
  private static long fibonacci(int n)
  {
    // base case 1 and 2
    if (n == 1 || n == 2)
    {
      return 1;
    }
    // recursive case
    else
    {
      return Fibonacci.fibonacci(n - 1) + Fibonacci.fibonacci(n - 2);
    }
  }


  /**
   * Program entry point.
   */
  public static void main(String [] args)
  {
    System.out.println(Fibonacci.fibonacci(N));
  }
}
