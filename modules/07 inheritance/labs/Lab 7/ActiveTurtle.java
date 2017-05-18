// Animator
import acm.util.Animator;

// GCanvas, GLabel
import acm.graphics.*;


/**
 * An ActiveTurtle runs a race on a supplied canvas
 */
public class ActiveTurtle extends Animator
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
  private Turtle turtle;

   
  /**
   * Constructor for an ActiveTurtle
   *
   * @param x       the x-coordinate of the turtle's initial position
   * @param y       the y-coordinate of the turtle's initial position
   * @param size    the size of the turtle
   * @param endLine the x-coordinate of the race's end line
   * @param canvas  the canvas to draw the turtle on
   * @param speed   the speed the turtle moves at
   */
  public ActiveTurtle(double x, double y, double size, double endLine, int speed, GCanvas canvas)
  {
    this.endLine = endLine;
    this.speed   = speed;
    this.canvas  = canvas;
    this.turtle  = new Turtle(size);
    this.canvas.add(this.turtle, x, y);
  }


  /**
   * This turtle runs the race
   */
  public void run()
  {
    // Get start time in milliseconds
    long startTime = System.currentTimeMillis();
      
    // Run the race
    while (this.turtle.getX() + this.turtle.getWidth() < this.endLine)
    {
      this.turtle.move(this.speed, 0);
      this.turtle.pause(50);
    }
      
    // Get end time
    long endTime = System.currentTimeMillis();
      
    // Compute and display elasped time in seconds
    double elapsedTime = (endTime - startTime) / 1000.0;
    GLabel turtleTimeMsg = new GLabel(String.format("The turtle ran the race in %5.2f seconds", elapsedTime));
    this.canvas.add(turtleTimeMsg, REPORT_X, REPORT_Y);
  }
}
