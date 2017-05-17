// Scanner
import java.util.Scanner;


/**
 * Program to test classes implementing the TrafficSignal interface
 */
public class TrafficSignalTester
{
  
  private TrafficSignal trafficSignal;


  /**
   * Initialize the TrafficSignal
   */
  public TrafficSignalTester()
  {
    this.trafficSignal = new TextTrafficSignal();
  }
 

  /**
   * Run the signal tester
   */
  public void run()
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter the interval time in seconds: ");
    double intervalSec = Double.parseDouble(in.nextLine());
    System.out.print("Please enter the number of cycles: ");
    int numberOfCycles = Integer.parseInt(in.nextLine());

    System.out.println("Testing initial state");
    System.out.println("  " + this.trafficSignal + "; should be OFF");
    System.out.println();
    
    System.out.println("Testing turnOn()");
    this.trafficSignal.turnOn();
    System.out.println("  " + this.trafficSignal + "; should be FLASHING_RED");
    System.out.println();
    
    System.out.println("Testing advance()");
    for (int i=0; i<numberOfCycles; i++) {
      try
      {
        this.trafficSignal.advance();
        System.out.println("  " + this.trafficSignal);
        Thread.sleep((long)(intervalSec * 1000.0));
      }
      catch (InterruptedException e)
      {
        // do nothing if the sleep was interrupted
      }
    }
    System.out.println();
    
    System.out.println("Testing turnOn() when traffic signal is already on");
    this.trafficSignal.turnOn();
    System.out.println("  " + this.trafficSignal + "; should be unchanged");
    System.out.println();
    
    System.out.println("Testing turnFlashing()");
    this.trafficSignal.turnFlashing();
    System.out.println("  " + this.trafficSignal + "; should be FLASHING_RED");
    System.out.println();
    
    System.out.println("Testing turnOff()");
    this.trafficSignal.turnOff();
    System.out.println("  " + this.trafficSignal + "; should be OFF");
    System.out.println();
  }
  
  /**
   * Create TrafficSignalTester and start it
   */
  public static void main(String [] args)
  {
    new TrafficSignalTester().run();
  }
}
