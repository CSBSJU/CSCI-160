/**
 * Interface for a light that can be OFF, ON, or FLASHING
 */
public interface Light
{
  /**
   * enum for the light states
   */
  public enum State
  {
    OFF,
    FLASHING,
    ON
  }


  /**
   * Turn this Light ON
   */
  public void turnOn();


  /**
   * Turn this Light OFF
   */
  public void turnOff();


  /**
   * Turn this Light FLASHING
   */
  public void turnFlashing();


  /**
   * Returns a string representation of this Light.
   *
   * @return a string representation of this Light
   */
  public String toString();
}
