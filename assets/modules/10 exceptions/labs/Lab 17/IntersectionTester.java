// Scanner
import java.util.Scanner;


/**
 * Program to test classes implementing the Intersection interface
 */
public class IntersectionTester
{
  
  private Intersection intersection;


  /**
   * Initialize the Intersection
   */
  public IntersectionTester()
  {
    this.intersection = new TextIntersection();
  }
 

  /**
   * Run the intersection tester
   */
  public void run()
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter the interval time in seconds: ");
    double intervalSec = Double.parseDouble(in.nextLine());
    System.out.print("Please enter the number of cycles: ");
    int numberOfCycles = Integer.parseInt(in.nextLine());

    System.out.println("Testing initial state");
    System.out.println("  " + this.intersection + "; should be OFF");
    System.out.println();

    System.out.println("Testing turnOn()");
    this.intersection.turnOn();
    System.out.println("  " + this.intersection + "; should be flashing red");
    System.out.println();
    
    System.out.println("Testing advance()");
    for (int i=0; i<numberOfCycles; i++) {
      try
      {
        this.intersection.advance();
        System.out.println("  " + this.intersection);
        System.out.println();
        Thread.sleep((long)(intervalSec * 1000.0));
      }
      catch (InterruptedException e)
      {
        // do nothing if the sleep was interrupted
      }
    }
    
    System.out.println("Testing turnOn() when intersection is already on");
    this.intersection.turnOn();
    System.out.println("  " + this.intersection + "; should be unchanged");
    System.out.println();

     System.out.println("Testing turnFlashing()");
    this.intersection.turnFlashing();
    System.out.println("  " + this.intersection + "; should be flashing red");
    System.out.println();
    
    System.out.println("Testing turnOff()");
    this.intersection.turnOff();
    System.out.println("  " + this.intersection + "; should be off");
    System.out.println();
  }
  
  /**
   * Create IntersectionTester and start it
   */
  public static void main(String [] args)
  {
    new IntersectionTester().run();
  }
}
