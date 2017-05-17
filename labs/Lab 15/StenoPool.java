// *Set
import java.util.*;


/**
 * A program that manages a stenographer pool for a business.
 */
public class StenoPool
{
  // TODO: declare 2 Sets available and busy
   
  
  /**
   * Initializes the StenoPool
   */
  public StenoPool()
  {
    // TODO: initialize available set and busy set
  }
  
  
  /**
   * Run the StenoPool
   */
  public void run() 
  {
    String cmd;
    Scanner scanner = new Scanner(System.in);

    do
    {
      System.out.println("Available commands include:");
      System.out.println("  addToAvailable (+)");
      System.out.println("  removeFromAvailable (-)");
      System.out.println("  listAvailable (a)");
      System.out.println("  listBusy (b)");
      System.out.println("  moveToOtherSet (m)");
      System.out.println("  quit (q)");
      System.out.print("Enter a command: ");
      cmd = scanner.nextLine();

      switch (cmd)
      {
        case "addToAvailable":
        case "+": // fall-through
        // TODO: prompt user to enter a stenographer and add it to the available pool
        break;

        case "removeFromAvailable":
        case "-": // fall-through
        // TODO: prompt the user to enter a stenographer and remove it from available pool if exists.
        break;
      
        case "listAvailable":
        case "a": // fall-through
        // TODO: print available stenographers each in a new line
        break;
      
        case "listBusy": 
        case "b": // fall-through
        // TODO: print all busy stenographers each in a new line
        break;
      
        case "moveToOtherSet":
        case "m": // fall-through
        // TODO: Prompt user to enter a stenographer, move from the busy pool to available (if stenographer is in busy pool) or vice-versa.
        // TODO: If stenographer is not in either list print error message "This stenographer is not on either list."
        break;

        default:
        System.out.println("That is not a valid command");
        case "quit": // fall-through
        case "q": // fall-through
        break;
      }
    }
    while(!(cmd.equals("quit") || cmd.equals("q")));

    scanner.close();
  }


  /**
   * Entry point for program
   */
  public static void main(String [] args)
  {
    new StenoPool().run();
  }
}
