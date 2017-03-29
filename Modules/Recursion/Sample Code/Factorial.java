/**
 * This program will recursively compute the factorial of a number and print it.
 */
public class Factorial
{
  // The number to compute the factorial of
  private static final int N = 7;


  /**
   * Method to recursively compute the factorial of a number by counting up. In
   * this method, recursion will continue until the argument i reaches n + 1,
   * i.e., one position beyond the number for which we are computing the
   * factorial, at which point the base case will be reached and 1 will be
   * returned (since multiplying by 1 does not change the value of the rest of
   * the computed factorial).
   */
  private static long factorial1(int i, int n)
  {
    // base case
    if (i > n)
    {
      return 1;
    }
    // recursive case
    else
    {
      return i * Factorial.factorial1(i + 1, n);
    }
  }


  /**
   * Method to recursively compute the factorial of a number by counting up. In
   * this method, recursion will continue until the last factor in the
   * factorial, at which point the base case will be reached and the factor will
   * be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * greater than n, then the program will recurse until a stack overflow. Test
   * that for yourself.
   */
  private static long factorial2(int i, int n)
  {
    // base case
    if (i == n)
    {
      return i;
    }
    // recursive case
    else
    {
      return i * Factorial.factorial2(i + 1, n);
    }
  }


  /**
   * Method to recursively compute the factorial of a number by counting down.
   * In this method, recursion will continue until the argument i reaches -1,
   * i.e., one position beyond 0, at which point the base case will
   * be reached and 1 will be returned (since multiplying by 1 does not change
   * the value of the rest of the computed factorial).
   */
  private static long factorial3(int n)
  {
    // base case
    if (n < 1)
    {
      return 1;
    }
    // recursive case
    else
    {
      return n * Factorial.factorial3(n - 1);
    }
  }


  /**
   * Method to recursively compute the factorial of a number by counting down.
   * In this method, recursion will continue until the last factor in the
   * factorial, at which point the base case will be reached and the factor will
   * be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * less than 0, then the program will recurse until a stack overflow. Test
   * that for yourself.
   */
  private static long factorial4(int n)
  {
    // base case
    if (n == 1)
    {
      return n;
    }
    // recursive case
    else
    {
      return n * Factorial.factorial4(n - 1);
    }
  }


  /**
   * Program entry point.
   */
  public static void main(String [] args)
  {
    System.out.println(Factorial.factorial1(1, N));
    System.out.println(Factorial.factorial2(1, N));
    System.out.println(Factorial.factorial3(N));
    System.out.println(Factorial.factorial4(N));
  }
}
