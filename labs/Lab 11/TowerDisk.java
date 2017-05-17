// Color
import java.awt.Color;

// GCompound, GRect
import acm.graphics.*;


/**
 * TowerDisk is the class that creates a rectangle to represent a disk from the
 * Towers of Hanoi game. A TowerDisk is a recursive structure in that it
 * contains a reference to the next disk below it, if such a disk exists.
 */
public class TowerDisk extends GCompound
{
  // The visual representation of the disk
  private GRect disk;

  // The next disk (structural recursion)
  private TowerDisk nextDisk;


  /**
   * Makes a new TowerDisk at the specified coordinates, with the specified
   * width, height, and color.
   *
   * If count is less than numberOfDisks - 1, then it makes a new TowerDisk of
   * the same color and height, but with a width of width + deltaWidth. It adds
   * this next disk -(deltaWidth / 2.0) to the left and height + diskSpacing
   * below this disk.
   *
   * @param width       the width of this disk
   * @param height      the height of this disk
   * @param deltaWidth  the difference in width between this disk and the next
   * @param diskSpacing the amount of vertical space between disks
   * @param color       the color of this disk
   * @param capacity    the capacity (i.e. number of disks) in the associated tower
   * @param numberAbove the number of disks above this disk
   */
  public TowerDisk(double width, double height, double deltaWidth, double diskSpacing, Color color, int capacity, int numberAbove)
  {
    //*** Complete this method
  }


  /**
   * Return the width of this TowerDisk
   *
   * @return the width of the TowerDisk
   */
  public double getWidth()
  {
    //*** Complete this method
    return 0.0; //***!!!&&& REMOVE THIS LINE AFTER YOU HAVE COMPLETED THE METHOD &&&!!!***//
  }


  /**
   * Return the value of the nextDisk private instance variable and remove the
   * reference to the next disk from this object.
   *
   * @return the next disk after this one
   */
  public TowerDisk removeNextDisk()
  {
    //*** Complete this method
    return null; //***!!!&&& REMOVE THIS LINE AFTER YOU HAVE COMPLETED THE METHOD &&&!!!***//
  }


  /**
   * Set the value of the nextDisk private instance variable and add a reference
   * to it to this object.
   *
   * @param nextDisk the value which is assigned to the nextDisk private
   *                 instance variable
   * @param deltaX   the difference in x coordinates between this disk and
   *                 nextDisk
   * @param deltaY   the difference in y coordinates between this disk and
   *                 nextDisk
   */
  public void addNextDisk(TowerDisk nextDisk, double deltaX, double deltaY)
  {
    //*** Complete this method
  }
}
