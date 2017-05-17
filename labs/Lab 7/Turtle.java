// File: Turtle.example.java

import java.awt.*;
import acm.graphics.*;

/**
 * A class to represent a racing turtle
 */

public class Turtle extends GCompound
{
  /**
   * Our turtle needs a body, a head, a tail, 2 eyes, and 4 legs
   */
  private GOval body, head, tail, leg1, leg2, leg3, leg4, eye1, eye2;
  /**
   * We save the scale of our turtle.
   */
  double currentScale=1.0;

  /**
   * Our constructor recieves a size and creates turtle of that size.
   *
   * @param size the desired size of bounding-square around the turtle
   */
  public Turtle(double size)
  {
    this.head = this.createOval(70, 40, 30, 20, Color.GREEN);
    this.eye1 = this.createOval(90, 45, 3, 3, Color.BLACK);
    this.eye2 = this.createOval(90, 52, 3, 3, Color.BLACK);
    this.tail = this.createOval(5, 45, 30, 10, Color.GREEN);
    this.leg1 = this.createOval(30, 5, 10, 30, Color.GREEN);
    this.leg2 = this.createOval(60, 5, 10, 30, Color.GREEN);
    this.leg3 = this.createOval(30, 65, 10, 30, Color.GREEN);
    this.leg4 = this.createOval(60, 65, 10, 30, Color.GREEN);
    this.body = this.createOval(20, 20, 60, 60, Color.GREEN);

    this.scale(size/100.0);
  }
 

  /**
   * Construct a new GOval object and add it to this GCompound object
   *
   * @param x      x-coordinate (relative to this) where new GOval should be added
   * @param y      y-coordinate (relative to this) where new GOval should be added
   * @param width  width of new GOval
   * @param height height of new GOval
   * @param color  color of new GOval
   *
   * @return a reference to the new GOval
   */ 
  private GOval createAndAddOval(double x, double y, double width, double height, Color color)
  {
    // create a new oval with specified width and height
    GOval oval = new GOval(width, height);
    oval.setFilled(true);
    oval.setFillColor(color);

    // add the newly created oval to this GCompound object at the coordinates x,y
    this.add(oval, x, y);

    // return a reference to the newly created GOval
    return oval;
  }
 

  /**
   * Resizes the turtle to a size factor times its original size (which is
   * stored in scale). Thus if factor is 2 it will be twice as big.
   *
   * @param factor the factor by which the Turtle should be scaled
   */
  public void resize(double factor)
  {
    this.scale(factor / this.currentScale);
    this.currentScale = factor;
  }
}
