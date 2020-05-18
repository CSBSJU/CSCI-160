/**
 * A die that can be rolled via the use of Random
 * 
 * @author <your name>
 */
public class Die
{
  // the rolled value
  private int value;
  
  /**
   * Construct with an initial roll.
   * 
   * @param initialRoll the starting roll value
   */
  public Die(int initialRoll)
  {
    this.value = initialRoll;
  }
  
  /**
   * Get the currently rolled value.
   * 
   * @return the current roll
   */
  public int getRoll()
  {
    return this.value;
  }
  
  /**
   * Roll the die!  (Generate a new random value between 1 and 6.)
   */
  public void roll()
  {
    int newValue = (int) Math.round(Math.random() * 5) + 1;
    this.value = newValue;
  }
}
