// Animator
import acm.util.Animator;

// GCanvas, GLabel
import acm.graphics.*;


/**
 * An ActiveHare runs a race on a supplied canvas
 */
public class ActiveHare extends Animator
{
  // coordinates to report final time
  private static final int REPORT_X =  50;
  private static final int REPORT_Y = 220;

  // speed of racer
  private int speed;
  // x coordinate indicating when to remove racer from canvas
  private double endLine;
  // canvas on which to place the racer
  private GCanvas canvas;
  // the racer
  private Hare hare;


  /**
   * Constructor for an ActiveHare
   *
   * @param x       the x-coordinate of the hare's initial position
   * @param y       the y-coordinate of the hare's initial position
   * @param size    the size of the hare
   * @param endLine the x-coordinate of the race's end line
   * @param canvas  the canvas to draw the hare on
   * @param speed   the speed the hare moves at
   */
  public ActiveHare(double x, double y, double size, double endLine, int speed, GCanvas canvas)
  {
    //*** create your Hare
  }


  /**
   * This hare runs the race
   */
  public void run()
  {
    //*** while loop to move the Hare along at its speed
  }
}
