// Scanner
import java.util.Scanner;

/**
 * A program to manage a list of names.
 * 
 * @author <Your Name>
 */
public class NamesListManager
{
  /**
   * Program entry point.
   * 
   * @param args the command-line arguments to the program (there should be none).
   */
  public static void main(String [] args)
  {
    String cmd, nameToAdd;
    Scanner in = new Scanner(System.in);
    NamesList list = new NamesList();
    
    do
    {
      System.out.print("Available commands:\tadd\n\t\t\tfind\n\t\t\tfind*\n\t\t\treplace\n\t\t\tremove\n\t\t\tdisplay\n\t\t\tquit\nEnter a command: ");
      cmd = in.nextLine();
      
      switch (cmd)
      {
        case "add":
          System.out.print("Enter a name to add to the list: ");
          nameToAdd = in.nextLine();
          list.add(nameToAdd);
          System.out.println("The list with " + nameToAdd + " added:");
          System.out.println(list);
          break;
          
          //TODO: if the command is find
          //TODO: prompt the user "Enter a name to find in the list: "
          //TODO: read in the user input
          //TODO: if the name is in the list, then print the string "<name> is
          //      in the list.", otherwise, print the string "<name> is not in
          //      the list."
          
          //TODO: if the command is remove
          //TODO: prompt the user "Enter a name you would like to remove from
          //      the list: "
          //TODO: read in the user input
          //TODO: remove all occurrences of the name specified by user from the
          //      list
          //TODO: print the string "The list with <name> removed:", followed by
          //      the updated list
          
          //TODO: if the command is replace
          //TODO: prompt the user "Enter a name to replace in the list: "
          //TODO: read in the user input
          //TODO: prompt the user "Enter a name to replace with in the list: "
          //TODO: read in the user input
          //TODO: replace all occurrences of the first name, with the second
          //      name
          //TODO: print the string "The list with <firstName> replaced with
          //      <secondName>:", followed by the list.
          
          //TODO: if the command is find*
          //TODO: prompt the user "Enter a prefix to search for in the list: "
          //TODO: read in the user input
          //TODO: print the string "The list of names that start with
          //      <prefix>:", followed by the appropriate list.
          
        case "display":
          System.out.println(list);
          break;
          
        case "quit":
          break;
          
          //TODO: if the command is anything else
          //TODO: print a suitable error message
      }
    } while(!cmd.equals("quit"));
    
    in.close();
  }
}
