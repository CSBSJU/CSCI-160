import java.util.Set;
import java.util.HashSet;

/**
 * A class that represents a stenographer pool, with available and busy sets of
 * stenographer names.
 * 
 * @author <your names>
 */
public class StenoPool
{
  // !!! TODO: add sets for available and busy stenographers here.
  
  /**
   * Default constructor.
   */
  public StenoPool()
  {
    // *** Initialize the available and busy sets here.
  }

  /**
   * !!! FILL IN YOUR JAVADOC HERE
   */
  public boolean add(String name)
  {
    // *** This method should return false if the stenographer already exists in
    // *** either the available set or the busy set. Otherwise, add the
    // *** stenographer to the available set and return true.

    // !!! REMOVE THE FOLLOWING LINE WHEN YOU HAVE FINISHED THIS METHOD
    return false;
  }

  /**
   * !!! FILL IN YOUR JAVADOC HERE
   */
  public boolean move(String name)
  {
    // *** This method should return false if the stenographer does not exist in
    // *** either the available set or the busy set. Otherwise, move the
    // *** stenographer from whichever set that it is in to the other and return
    // *** true.

    // !!! REMOVE THE FOLLOWING LINE WHEN YOU HAVE FINISHED THIS METHOD
    return false;
  }

  /**
   * !!! FILL IN YOUR JAVADOC HERE
   */
  public String listAvailable()
  {
    // !!! REMOVE THE FOLLOWING LINE WHEN YOU HAVE FINISHED THIS METHOD
    return "YOU HAVE NOT FINISHED THE\nlistAvailable() METHOD\nIN StenoPool.java YET!";
  }

  /**
   * !!! FILL IN YOUR JAVADOC HERE
   */
  public String listBusy()
  {
    // !!! REMOVE THE FOLLOWING LINE WHEN YOU HAVE FINISHED THIS METHOD
    return "YOU HAVE NOT FINISHED THE\nlistBusy() METHOD\nIN StenoPool.java YET!";
  }
}
