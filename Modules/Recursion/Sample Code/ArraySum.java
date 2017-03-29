/**
 * This program will generate an array of n random values and then recursively
 * add them and finally print the sum.
 */
public class ArraySum
{
  // The number of values in the array
  private static final int N = 100;


  /**
   * Method to populate an array with random values.
   */
  private static void populate(int [] array)
  {
    for (int i=0; i<array.length; i++)
    {
      array[i] = (int)(Math.random() * array.length);
    }
  }


  /**
   * Method to recursively add the values by counting up. In this method,
   * recursion will continue until 1 position beyond the end of the array, at
   * which point the base case will be reached and 0 will be returned (which has
   * no effect on the sum of the array).
   */
  private static int sum1(int [] array, int i)
  {
    // base case
    if (i >= array.length)
    {
      return 0;
    }
    // recursive case
    else
    {
      return array[i] + ArraySum.sum1(array, i + 1);
    }
  }


  /**
   * Method to recursively add the values by counting up. In this method,
   * recursion will continue until the last position in the array, at which
   * point the base case will be reached and the last value will be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * greater than array.length - 1, then the program will recurse until a stack
   * overflow. Test that for yourself.
   */
  private static int sum2(int [] array, int i)
  {
    // base case
    if (i == array.length - 1)
    {
      return array[i];
    }
    // recursive case
    else
    {
      return array[i] + ArraySum.sum2(array, i + 1);
    }
  }


  /**
   * Method to recursively add the values by counting down. In this method,
   * recursion will continue until 1 position beyond the beginning of the array,
   * at which point the base case will be reached and 0 will be returned (which
   * has no effect on the sum of the array).
   */
  private static int sum3(int [] array, int i)
  {
    // base case
    if (i < 0)
    {
      return 0;
    }
    // recursive case
    else
    {
      return array[i] + ArraySum.sum3(array, i - 1);
    }
  }


  /**
   * Method to recursively add the values by counting down. In this method,
   * recursion will continue until the first position in the array, at which
   * point the base case will be reached and the first value will be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * less than 0, then the program will recurse until a stack overflow. Test
   * that for yourself.
   */
  private static int sum4(int [] array, int i)
  {
    // base case
    if (i == 0)
    {
      return array[i];
    }
    // recursive case
    else
    {
      return array[i] + ArraySum.sum4(array, i - 1);
    }
  }


  /**
   * Program entry point.
   */
  public static void main(String [] args)
  {
    int [] array = new int[N];

    ArraySum.populate(array);

    System.out.println(ArraySum.sum1(array, 0));
    System.out.println(ArraySum.sum2(array, 0));
    System.out.println(ArraySum.sum3(array, array.length - 1));
    System.out.println(ArraySum.sum4(array, array.length - 1));
  }
}
