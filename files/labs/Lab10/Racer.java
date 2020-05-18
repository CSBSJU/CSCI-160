// GCompound, GLabel
import acm.graphics.*;

/**
 * A Racer runs moves itself independently until it reaches the end line.
 */
public class Racer extends GCompound implements Runnable
{
  /** time delay for animation */
  private static final double DELAY_TIME = 33.0;

  /** speed of racer */
  private double speed;
  /** the distance of the race */
  private double distance;
  /** the time message for the racer */
  private GLabel lblTime;

  /**
   * Constructor for a Racer
   *
   * @param speed    the speed the racer moves at
   * @param distance the distance of the race
   */
  public Racer(double speed, double distance)
  {
    this.speed    = speed;
    this.distance = distance;
    this.lblTime  = new GLabel("");
    this.add(this.lblTime);
  }

  /**
   * Implement the run method, this will be the method that allows the Racer to
   * run independently.
   */
  public void run()
  {
    // Get start time in milliseconds
    long startTime = System.currentTimeMillis();

    //*** Run the race

    // Get end time
    long endTime = System.currentTimeMillis();

    // Compute the display elapsed time in seconds
    double elapsedTime = (endTime - startTime) / 1000.0;

    //*** Display the elapsed time in a message using the GLabel instance variable
  }
}
