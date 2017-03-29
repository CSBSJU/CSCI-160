/**
 * This program will generate an array of n random values and then recursively
 * find its maximum value and then print it.
 */
public class ArrayMax
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
   * Method to recursively find the maximum value in an array by counting up.
   * In this method, recursion will continue until 1 position beyond the end of
   * the array, at which point the base case will be reached and
   * Integer.MIN_VALUE will be returned (since this will guarantee that any
   * value in the array will compare greater than or equal to it).
   */
  private static int max1(int [] array, int i)
  {
    // base case
    if (i >= array.length)
    {
      return Integer.MIN_VALUE;
    }
    // recursive case
    else
    {
      return Math.max(array[i], ArrayMax.max1(array, i + 1));
    }
  }


  /**
   * Method to recursively find the maximum value in an array by counting up.
   * In this method, recursion will continue until the last position in the
   * array, at which point the base case will be reached and the last value
   * will be returned, since it is the maximum value in the sub array that
   * contains only the last value.
   *
   * You should be careful with this one, since if the initial value of i is
   * greater than array.length - 1, then the program will recurse until a stack
   * overflow. Test that for yourself.
   */
  private static int max2(int [] array, int i)
  {
    // base case
    if (i == array.length - 1)
    {
      return array[i];
    }
    // recursive case
    else
    {
      return Math.max(array[i], ArrayMax.max2(array, i + 1));
    }
  }


  /**
   * Method to recursively find the maximum value in an array by counting down.
   * In this method, recursion will continue until 1 position beyond the
   * beginning of the array, at which point the base case will be reached and
   * Integer.MIN_VALUE will be returned (since this will guarantee that any
   * value in the array will compare greater than or equal to it).
   */
  private static int max3(int [] array, int i)
  {
    // base case
    if (i < 0)
    {
      return Integer.MIN_VALUE;
    }
    // recursive case
    else
    {
      return Math.max(array[i], ArrayMax.max3(array, i - 1));
    }
  }


  /**
   * Method to recursively find the maximum value in an array by counting down.
   * In this method, recursion will continue until the first position in the
   * array, at which point the base case will be reached and the first value
   * will be returned, since it is the maximum value in the sub array that
   * contains only the first value.
   *
   * You should be careful with this one, since if the initial value of i is
   * less than 0, then the program will recurse until a stack overflow. Test
   * that for yourself.
   */
  private static int max4(int [] array, int i)
  {
    if (i == 0)
    {
      return array[i];
    }
    else
    {
      return Math.max(array[i], ArrayMax.max4(array, i - 1));
    }
  }


  /**
   * Program entry point.
   */
  public static void main(String [] args)
  {
    int [] array = new int[N];

    ArrayMax.populate(array);

    System.out.println(ArrayMax.max1(array, 0));
    System.out.println(ArrayMax.max2(array, 0));
    System.out.println(ArrayMax.max3(array, array.length - 1));
    System.out.println(ArrayMax.max4(array, array.length - 1));
  }
}
