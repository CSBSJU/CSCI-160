/**
 * Program to test classes implementing the Light interface
 */
public class LightTester
{
  private Light light;


  /**
   * Constructor method
   */
  public LightTester()
  {
    this.light = new TextLight();
  }


  /**
   * Run the light tester
   */
  public void run()
  {
    System.out.println("Testing initial state");
    System.out.println("  " + this.light + "; should be OFF");
    System.out.println();
    
    System.out.println("Testing turnOn()");
    this.light.turnOn();
    System.out.println("  " + this.light + "; should be ON");
    System.out.println();
    
    System.out.println("Testing turnOff()");
    this.light.turnOff();
    System.out.println("  " + this.light + "; should be OFF");
    System.out.println();
    
    System.out.println("Testing turnFlashing()");
    this.light.turnFlashing();
    System.out.println("  " + this.light + "; should be FLASHING");
    System.out.println();
  }


  /**
   * Create LightTester and start it
   */
  public static void main(String [] args)
  {
    new LightTester().run();
  }
}
