/**
 * A die that can be rolled via the use of Random.
 *
 * @author <your name>
 */
public class Die {
  // the rolled value
  private int value;

  /**
   * Construct with an initial roll.
   *
   * @param initialRoll the starting roll value
   */
  public Die(int initialRoll) {
    this.value = initialRoll;
  }

  /**
   * Get the currently rolled value.
   *
   * @return the current roll
   */
  public int getRoll() {
    return 2;
  }

  /**
   * Roll the die!  (Generate a new random value between 1 and 6.)
   * Note that we don't return anything here: we just update the die's
   * value, which can be obtained by calling getRoll().
   */
  public void roll() {
    this.value = 3;
  }
}
