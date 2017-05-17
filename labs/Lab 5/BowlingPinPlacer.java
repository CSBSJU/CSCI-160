// Color
import java.awt.Color;

// GraphicsProgram
import acm.program.GraphicsProgram;

// GOval
import acm.graphics.GOval;


/**
 *  Class to place a set of pins on a canvas
 */
public class BowlingPinPlacer extends GraphicsProgram
{
  // default location of the back left pin
  private final double DEFAULT_X = 120;
  private final double DEFAULT_Y = 100;


  /**
   * Entry point for ACM Program -- this is where the program will start --
   * create a new set of bowling pins on the canvas
   */
  public void init()
  {
    BowlingPins bowlingPins = new BowlingPins();

    this.add(bowlingPins, DEFAULT_X, DEFAULT_Y);

    /* create a red bowling pin to in the correct location for the back left
     * pin, to verify that the BowlingPins object was created at the correct
     * location. */
    GOval redBackLeftPin = new GOval(DEFAULT_X, DEFAULT_Y, 20, 20);
    redBackLeftPin.setColor(Color.RED);
    redBackLeftPin.setFilled(true);
    this.add(redBackLeftPin);
  }
}
