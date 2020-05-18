// MouseEvent
import java.awt.event.MouseEvent;
// GLabel
import acm.graphics.*;
// GraphicsProgram
import acm.program.GraphicsProgram;

/**
 * A program for rolling dice.
 * 
 * @author <your name>
 */
public class DiceRoller extends GraphicsProgram
{
  // the two dice we can roll
  private Die firstDie;
  private Die secondDie;
  
  // the two GLabel that we use to show the rolls
  private GLabel firstLabel;
  private GLabel secondLabel;
  
  /**
   * Initialize by creating the dice and labels.
   */
  public void init()
  {
    firstDie = new Die(1);
    secondDie = new Die(1);
    
    // create the labels
    firstLabel = new GLabel("", 100, 100);
    firstLabel.setFont("SanSerif-50");
    secondLabel = new GLabel("", 100, 200);
    secondLabel.setFont("SanSerif-50");
    this.add(firstLabel);
    this.add(secondLabel);
    
    // code here is repeated when clicked.  Pull out into a method!
    firstLabel.setLabel("You rolled a " + firstDie.getRoll() + ".");
    secondLabel.setLabel("You rolled a " + secondDie.getRoll() + ".");
    
    this.addMouseListeners();
  }
  
  /**
   * Roll both dice on each click.
   * 
   * @param e the mouse click event
   */
  public void mouseClicked(MouseEvent e)
  {
    firstDie.roll();
    secondDie.roll();
    
    // code here is repeated in init.  Pull out into a method!
    firstLabel.setLabel("You rolled a " + firstDie.getRoll() + ".");
    secondLabel.setLabel("You rolled a " + secondDie.getRoll() + ".");
  }
}
