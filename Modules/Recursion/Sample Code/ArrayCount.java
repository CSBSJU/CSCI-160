/**
 * This program will generate an array of n random values and then recursively
 * search it for a random value and print the number of times that the value was
 * found in the array.
 */
public class ArrayCount
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
   * Method to recursively count the number of times that a desired value
   * appears in an array by counting up. In this method, recursion will continue
   * until 1 position beyond the end of the array, at which point the base case
   * will be reached and 0 will be returned (since the value cannot exist
   * past the end of the array).
   */
  private static int count1(int [] array, int i, int v)
  {
    // base case
    if (i >= array.length)
    {
      return 0;
    }
    // recursive case
    else
    {
      int count = 0;
      if (array[i] == v)
      {
        count = 1;
      }
      return count + ArrayCount.count1(array, i + 1, v);
      // in one line
      // return (array[i] == v ? 1 : 0) + ArrayCount.count1(array, i + 1, v);
    }
  }


  /**
   * Method to recursively count the number of times that a desired value
   * appears in an array by counting up. In this method, recursion will continue
   * until the last position in the array, at which point the base case will be
   * reached and the result of comparing the last value with the desired value
   * will be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * greater than array.length - 1, then the program will recurse until a stack
   * overflow. Test that for yourself.
   */
  private static int count2(int [] array, int i, int v)
  {
    // base case
    if (i == array.length - 1)
    {
      int count = 0;
      if (array[i] == v)
      {
        count = 1;
      }
      return count;
    }
    // recursive case
    else
    {
      int count = 0;
      if (array[i] == v)
      {
        count = 1;
      }
      return count + ArrayCount.count2(array, i + 1, v);
    }
  }


  /**
   * Method to recursively count the number of times that a desired value
   * appears in an array by counting down. In this method, recursion will
   * continue until 1 position beyond the beginning of the array, at which point
   * the base case will be reached and 0 will be returned (since the value
   * cannot exist past the end of the array).
   */
  private static int count3(int [] array, int i, int v)
  {
    // base case
    if (i < 0)
    {
      return 0;
    }
    // recursive case
    else
    {
      int count = 0;
      if (array[i] == v)
      {
        count = 1;
      }
      return count + ArrayCount.count3(array, i - 1, v);
    }
  }


  /**
   * Method to recursively count the number of times that a desired value
   * appears in an array by counting down. In this method, recursion will
   * continue until the first position in the array, at which point the base
   * case will be reached and the result of comparing the first value with the
   * desired value will be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * less than 0, then the program will recurse until a stack overflow. Test
   * that for yourself.
   */
  private static int count4(int [] array, int i, int v)
  {
    // base case
    if (i == 0)
    {
      int count = 0;
      if (array[i] == v)
      {
        count = 1;
      }
      return count;
    }
    // recursive case
    else
    {
      int count = 0;
      if (array[i] == v)
      {
        count = 1;
      }
      return count + ArrayCount.count4(array, i - 1, v);
    }
  }


  /**
   * Program entry point.
   */
  public static void main(String [] args)
  {
    int [] array = new int[N];
    int v = (int)(Math.random() * N);

    ArrayCount.populate(array);

    System.out.println(ArrayCount.count1(array, 0, v));
    System.out.println(ArrayCount.count2(array, 0, v));
    System.out.println(ArrayCount.count3(array, array.length - 1, v));
    System.out.println(ArrayCount.count4(array, array.length - 1, v));
  }
}
