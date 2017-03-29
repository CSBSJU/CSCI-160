/**
 * This program will generate an array of n random values and then recursively
 * search it for a random value and print whether the value was found in the
 * array or not.
 */
public class ArraySearch
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
   * Method to recursively search an array for a desired value by counting up.
   * In this method, recursion will continue until 1 position beyond the end of
   * the array, at which point the base case will be reached and false will be
   * returned (since the value cannot exist past the end of the array).
   */
  private static boolean search1(int [] array, int i, int v)
  {
    // base case
    if (i >= array.length)
    {
      return false;
    }
    // recursive case
    else
    {
      return array[i] == v || ArraySearch.search1(array, i + 1, v);
    }
  }


  /**
   * Method to recursively search an array for a desired value by counting up.
   * In this method, recursion will continue until the last position in the
   * array, at which point the base case will be reached and the result of
   * comparing the last value with the desired value will be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * greater than array.length - 1, then the program will recurse until a stack
   * overflow. Test that for yourself.
   */
  private static boolean search2(int [] array, int i, int v)
  {
    // base case
    if (i == array.length - 1)
    {
      return array[i] == v;
    }
    // recursive case
    else
    {
      return array[i] == v || ArraySearch.search2(array, i + 1, v);
    }
  }


  /**
   * Method to recursively search an array for a desired value by counting down.
   * In this method, recursion will continue until 1 position beyond the
   * beginning of the array, at which point the base case will be reached and
   * false will be returned (since the value cannot exist past the end of the
   * array).
   */
  private static boolean search3(int [] array, int i, int v)
  {
    // base case
    if (i < 0)
    {
      return false;
    }
    // recursive case
    else
    {
      return array[i] == v || ArraySearch.search3(array, i - 1, v);
    }
  }


  /**
   * Method to recursively search an array for a desired value by counting down.
   * In this method, recursion will continue until the first position in the
   * array, at which point the base case will be reached and the result of
   * comparing the first value with the desired value will be returned.
   *
   * You should be careful with this one, since if the initial value of i is
   * less than 0, then the program will recurse until a stack overflow. Test
   * that for yourself.
   */
  private static boolean search4(int [] array, int i, int v)
  {
    // base case
    if (i == 0)
    {
      return array[i] == v;
    }
    // recursive case
    else
    {
      return array[i] == v || ArraySearch.search4(array, i - 1, v);
    }
  }


  /**
   * Program entry point.
   */
  public static void main(String [] args)
  {
    int [] array = new int[N];
    int v = (int)(Math.random() * N);

    ArraySearch.populate(array);

    System.out.println(ArraySearch.search1(array, 0, v));
    System.out.println(ArraySearch.search2(array, 0, v));
    System.out.println(ArraySearch.search3(array, array.length - 1, v));
    System.out.println(ArraySearch.search4(array, array.length - 1, v));
  }
}
