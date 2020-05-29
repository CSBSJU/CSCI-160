import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

/**
 * Program that tests classes implementing the Face interface; currently, only
 * the Face class is tested.
 *
 * @author  J. Andrew Holey, from another program by Lynn Ziegler
 * @version 2011/09/20
 */
public class FaceTest extends GraphicsProgram
{
  private Face face1, face2;

  /**
   * Set up a canvas with two faces
   */
  public void init()
  {
    this.addMouseListeners();

    this.face1 = new Face();
    this.face1.frown();
    this.add(this.face1, 50.0, 50.0);

    this.face2 = new Face();
    this.face2.smile();
    this.face2.closeEyes();
    this.add(this.face2, 300.0, 300.0);
  }

  /**
   * Action to take when the mouse is pressed; behavior depends on where the
   * press occurred
   *
   * @param e the associated mouse event
   */
  public void mousePressed(MouseEvent e)
  {
    if (this.face1.contains(e.getX(), e.getY()))
    {
      this.face1.move(10.0, 10.0);
    }
    else if (this.face2.contains(e.getX(), e.getY()))
    {
      this.face2.move(-10.0, -10.0);
    }
    else
    {
      this.face1.smile();
      this.face1.closeEyes();
      this.face2.frown();
      this.face2.openEyes();
    }
  }

  /**
   * Action to take when the mouse is released behavior depends on where the
   * press occurred
   *
   * @param e the associated mouse event
   */
  public void mouseReleased(MouseEvent e)
  {
    if (this.face1.contains(e.getX(), e.getY()))
    {
      this.face1.frown();
      this.face2.closeEyes();
    }
    else if (this.face2.contains(e.getX(), e.getY()))
    {
      this.face2.smile();
      this.face1.openEyes();
    }
    else
    {
      this.face1.smile();
      this.face2.frown();
    }
  }
}
