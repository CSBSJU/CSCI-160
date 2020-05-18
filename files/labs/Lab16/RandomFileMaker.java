// FileNotFoundException
import java.io.FileNotFoundException;

/**
 * Program that generates an array of random double values with the specified
 * size and range
 *
 * @author  J. A. W. H., revised by J Schnepf and P Ohmann
 * @version 2018
 */
public class RandomFileMaker
{
  public static void main(String [] args)
  {
    // make sure the user provided 4 arguments
    if (args.length != 4)
    {
      System.err.println("Usage: RandomFileMaker numDoubles minValue maxValue outFile");
      return;
    }
    
    // get user's arguments for the following values
    int numDoubles    = Integer.parseInt(args[0]);
    double low        = Double.parseDouble(args[1]);
    double high       = Double.parseDouble(args[2]);
    String outputFile = args[3];

    // generate a random double array
    double [] doubleArray = DoubleUtilities.generateValues(numDoubles, low, high);

    try
    {
      // write random double array to file
      DoubleUtilities.writeFile(outputFile, doubleArray);
    }
    catch (FileNotFoundException e)
    {
      System.err.println("Cannot create file '" + outputFile + "'");
    }
  }
}
