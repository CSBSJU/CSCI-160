/**
 * Interface for a traffic signal that can be in any of the specified states
 */
public interface TrafficSignal
{
  /**
   * enum for the traffic signal states
   */
  public enum State
  {
    OFF,
    FLASHING_RED,
    RED,
    YELLOW,
    GREEN
  }


  /**
   * Turn this TrafficSignal ON with an initial state of FLASHING_RED; if it was
   * already ON, the state should be unchanged
   */
  public void turnOn();


  /**
   * Turn this TrafficSignal OFF
   */
  public void turnOff();


  /**
   * Turn this TrafficSignal FLASHING_RED
   */
  public void turnFlashing();


  /**
   * Advance this TrafficSignal to its next state:
   *  RED    -> GREEN
   *  GREEN   -> YELLOW
   *  YELLOW   -> RED
   *  FLASHING_RED -> RED
   *  OFF    -> OFF
   */
  public void advance();


  /**
   * Returns a string representation of this TrafficSignal.
   *
   * @return a string representation of this TrafficSignal
   */
  public String toString();
}
