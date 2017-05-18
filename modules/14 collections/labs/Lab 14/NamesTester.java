// ConsoleProgram
import acm.program.ConsoleProgram;


/**
 * A program that displays a table of a cannon ball's travel from firing until it
 * hits the ground for a specified initial velocity and angle.
 */
public class NamesTester extends ConsoleProgram
{
  private HeadTailList<String> list;
  private String cmd, newname, nametofind, nametoremove;


  /**
   * Creat NamesTester and start it
   */
  public static void main(String [] args)
  {
     new NamesTester().start();
  }


  /**
   * Initializes the NamesTester
   */
  public void init()
  {
    list = HTLUtilities.readStringListSig(getConsole(), "quit", "Enter a string to add:  ");
  }


  /**
   * Run the NamesTester
   */
  public void run()
  {
    do {
      //read command from user
      cmd = readLine("\n\nAvailable commands:\tadd\n \t\tfind\n \t\tremove\n \t\tdisplay\n \t\tquit\n\n Enter a command: ");

      //TODO: if command cmd is add:
        //TODO: prompt user "Enter a name to add to the list:"
        //TODO: read in the user input
        //TODO: add user input as first element of new list
        //TODO: print the string "This is the list with your new name added:" followed by updated list

      //TODO: if command is find
        //TODO: prompt user "Enter a name to find in the list:"
        //TODO: read in the user input
        //TODO: if element is in the list print string "This name is in the list.", else print "This name is not in the list."

      //TODO: if command is remove
        //TODO: prompt user "Enter a name you would like to remove from the list:"
        //TODO: read in the user input
        //TODO: remove element specified by user from current list
        //TODO: print the string ""This is the list with your name removed:"" followed by updated list

      //TODO: if the command is display
        //TODO: print the current list
    } while(!cmd.equals("quit"));

    System.exit(0);
  }
}
