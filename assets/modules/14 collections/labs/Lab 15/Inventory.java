// PrintWriter
import java.io.PrintWriter;

// *Map, Scanner
import java.util.*;

// FileChooser
import fileChooser.FileChooser;


/**
 * A program that manages an inventories.
 */
public class Inventory
{
  /* A map variable which maps a part number to the part uniquely identified by
   * said part number. */
  Map<Integer, Part> partsMap;


  /**
   * Initializes the Inventory
   */
  public Inventory()
  {
    // TODO initialize parts map
  }


  /**
   * Run the Inventory
   */
  public void run()
  {
    int partNumber, partInStock;
    String partName, cmd;
    Scanner scanner = new Scanner(System.in);

    do
    {
      System.out.println("Available commands include:");
      System.out.println("  addItem (a)");
      System.out.println("  removeItem (r)");
      System.out.println("  lookUpItem (l)");
      System.out.println("  addStock (+)");
      System.out.println("  removeStock (-)");
      System.out.println("  displayInventory (d)");
      System.out.println("  saveToFile (s)");
      System.out.println("  loadFromFile (o)");
      System.out.println("  quit (q)");
      System.out.print("Enter a command: ");
      cmd = scanner.nextLine();

      switch (cmd)
      {
        case "addItem":
        case "a": // fall-through
        // TODO: get part number and part name from user and add it to the parts
        //       map if it is not in inventory already.
        // TODO: if part number already exist in inventory, print error message
        //       "Your item was not added because this part number is already in
        //       use."
        break;

        case "removeItem":
        case "r": // fall-through
        // TODO: get part number from user and remove it from inventory
        break;

        case "lookUpItem":
        case "l": // fall-through
        // TODO: get part number from user and print item name and stock number
        //       if it is in inventory
        // TODO: if part number is not in inventory print error message "The
        //       part number does not exist."
        break;

        case "addStock":
        case "+": // fall-through
        // TODO: get part number and stock number from user and update the
        //       current stock if part number is already in inventory
        // TODO:   if stock number was negative, print error message "Cannot add
        //         negative stock." and keep inventory unchanged
        // TODO:   if part number is not in inventory, print error message "This
        //         part number does not exist."
        break;

        case "removeStock":
        case "-": // fall-through
        // TODO: get part number and stock number from user and update the
        //       current stock if part number is already in inventory
        // TODO:  if stock number is greater than current stock, remove all
        //         current stock and print error message "This number is
        //         greater than the number available. Removed <currentStock>
        //         from stock. Stock is now zero."
        // TODO:   if stock number was negative, print error message "Cannot
        //         remove negative stock." and keep inventory unchanged
        // TODO:   if part number is not in inventory, print error message "This
        //         part number does not exist."
        break;

        case "displayInventory":
        case "d": // fall-through
        // Print each part -- number, name and stock -- on separate lines
        for (Map.Entry<Integer, Part> e : this.partsMap.entrySet())
        {
          System.out.println(e.getValue());
        }
        break;

        case "saveToFile":
        case "s": // fall-through
        // TODO write map to file where each entry is written in following
        // format: <part number> <part name> <stock number><NEWLINE>
        // You CAN use FileChooser to open a PrintWriter associated with a file
        break;

        case "loadFromFile":
        case "o": // fall-through
        // TODO populate map by data read from file written in above step -- be
        // sure to clear the map first, in case it is not empty
        // You CAN use FileChooser to open another scanner associated with a
        // file
        break;

        default:
        System.out.println("'" + cmd + "' is not a valid command");
        case "quit": // fall-through
        case "q": // fall-through
        break;
      }
    }
    while(!(cmd.equals("quit") || cmd.equals("q")));

    scanner.close();
  }


  /**
   * Create Inventory and start it
   */
  public static void main(String [] args)
  {
    new Inventory().run();
  }
}
