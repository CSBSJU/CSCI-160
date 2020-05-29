// GLabel, GLine
import acm.graphics.*;

// GraphicsProgram
import acm.program.GraphicsProgram;

// RandomGenerator
import acm.util.RandomGenerator;

/**
 * A race program between a hare and a turtle
 */
public class NewRace extends GraphicsProgram
{
  /** x-coordinate for the racers */
  private static final double RACER_X       = 0;
  /** size of the racers */
  private static final double RACER_SIZE    = 40;
  /** y-coordinate for hare */
  private static final double HARE_Y        = 20;
  /** y-coordinate for turtle */
  private static final double TURTLE_Y      = 100;
  /** x-coordinate for start line */
  private static final double STARTLINE_X   = RACER_SIZE;
  /** x-coordinate for instruction label */
  private static final double INSTRUCTION_X = 100;
  /** y-coordinate for instruction label */
  private static final double INSTRUCTION_Y = 40;
 
  /** label for instructions */
  private GLabel instructions;
  /** the racers */
  private Racer[] racers;

  /**
   * Initialize the canvas
   */
  public void init()
  {
    // calculate the distance of the race
    double raceDistance = this.getWidth() - STARTLINE_X - RACER_SIZE;

    // calculate the x-coordinate for the endline
    double endLineX = STARTLINE_X + raceDistance;

    // display the start and end lines 
    this.add(new GLine(STARTLINE_X, 0, STARTLINE_X, this.getHeight()));
    this.add(new GLine(endLineX, 0, endLineX, this.getHeight()));

    // display instructions
    this.instructions = new GLabel("Click to begin the race");
    this.add(this.instructions, INSTRUCTION_X, INSTRUCTION_Y);

    // calculate racer speeds
    RandomGenerator rand = new RandomGenerator();
    int hareSpeed   = 2 + rand.nextInt(8); // average of 5.5 for the hare but a wide range.
    int turtleSpeed = 4 + rand.nextInt(3); // average of 5 for the turtle but a narrow range.

    // create racer array
    this.racers = new Racer[0];

    // create racers
    //*** Create a new object for each of your racers and put it into the racer
    //*** array. Don't forget to add it to the canvas as well!

    // hide racers initially
    for (Racer racer : this.racers)
    {
      racer.setVisible(false);
    }
  }

  /**
   * Create and start the racers 
   */
  public void run()
  {
    this.waitForClick();

    // hide the instructions once they've been followed
    this.instructions.setVisible(false);

    // unhide and start the racers
    for (Racer racer : this.racers)
    {
      racer.setVisible(true);
      new Thread(racer).start();
    }
  }
}
