// PrintWriter
import java.io.PrintWriter;

// Scanner
import java.util.Scanner;

// FileChooser
import fileChooser.*;


/**
 * Utilities for double arrays
 */
public class DoubleUtilities
{
  /**
   * Selects a file, reads the file and returns a double array of data from the
   * file.
   *
   * @return a double array containing the data read from the file
   */
  public static double [] readFile()
  {
    Scanner scanner = FileChooser.openScanner();

    //*** Complete this method

    return null;
  }


  /**
   * Writes the specified double array into a selected file.
   *
   * @param array the array of doubles to write
   */
  public static void writeFile(double [] doubleArray)
  {
    PrintWriter printwriter = FileChooser.openPrintWriter();        

    //*** Complete this method
  }


  /**
   * Generates size random double values and returns an array containing those
   * values.
   * 
   * @param  numDoubles the number of values to generate
   * @param  low        the lower bound of values to generate
   * @param  high       the upper bound of values to generate
   *
   * @return an array containing size random double values 
   */
  public static double [] generateValues(int numDoubles, double low, double high)
  {
    //*** Complete this method

    return null;
  }


  /**
   * Sorts an array of double values using the insertionSort algorithm.
   *
   * @param array the array of doubles to sort
   */
  public static void sort(double [] array)
  {
    //*** Complete this method
  }
}
