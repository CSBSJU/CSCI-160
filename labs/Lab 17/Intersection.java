/**
 * Interface for an intersection with traffic signals in four directions
 */
public interface Intersection
{
  /**
   * enum for the intersection states
   */
  public enum State
  {
    OFF,
    FLASHING_RED,
    NS_GREEN,
    NS_YELLOW,
    EW_GREEN,
    EW_YELLOW
  }


  /**
   * Turn this Intersection ON with an initial state of FLASHING_RED
   * in all directions
   */
  public void turnOn();


  /**
   * Turn OFF all four traffic signals in this Intersection
   */
  public void turnOff();


  /**
   * Turn FLASHING all four traffic signals in this Intersection
   */
  public void turnFlashing();


  /**
   * Advance this Intersection to its next state (N, E, S, W):
   *  R, G, R, G   -> R, Y, R, Y;
   *  R, Y, R, Y   -> G, R, G, R;
   *  G, R, G, R   -> Y, R, Y, R;
   *  Y, R, Y, R   -> R, G, R, G;
   *  FR, FR, FR, FR -> R, G, R, G;
   *  OFF     -> OFF;
   */
  public void advance();


  /**
   * Returns a string representation of this Intersection.
   *
   * @return a string representation of this Intersection
   */
  public String toString();
}
