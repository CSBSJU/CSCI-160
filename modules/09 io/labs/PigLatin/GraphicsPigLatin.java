// GridLayout, JPanel
import java.awt.*;

// ActionListener, ActionEvent
import java.awt.event.*;

// JButton, JTextField
import javax.swing.*;


/**
 *  This program  uses the PigLatin class to convert a line of text to pig
 *  latin; it displays all text in a graphics window.
 *
 *  @author  Jim Schnepf, modified by J. Andrew Whitford Holey
 *  @version October 31, 2013
 */
public class GraphicsPigLatin extends JFrame implements ActionListener
{
  /** Text field where the user can input the text to translated. */
  private JTextField original;
  /** Text field where the translated text will appear. */
  private JTextField translated;
 
  /**
   * Initialize the program layout
   */
  public GraphicsPigLatin()
  {
    this.original   = new JTextField(50);
    this.translated = new JTextField(50);

    this.original.addActionListener(this);
    this.translated.setEditable(false);

    JPanel p = new JPanel();
    p.setLayout(new GridLayout(4, 1));
    p.add(new JLabel("Original:"));
    p.add(this.original);
    p.add(new JLabel("Pig Latin:"));
    p.add(this.translated);

    //Add the number panel north
    this.add(p, BorderLayout.NORTH);

    //set the size and make the JFrame visible
    this.setSize(500,500);
    this.setVisible(true);

    // make it close on x
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  /**
   * Display the pig latin text in the translated field when you press Enter on
   * the keyboard.
   *
   * @param event the event the triggered the method to be called
   */
  public void actionPerformed(ActionEvent event)
  {
    this.translated.setText(new PigLatinString(this.original.getText()).translate());
  }

  /**
   * Program entry point.
   *
   * @param args Array of command-line arguments
   */
  public static void main(String [] args)
  {
    new GraphicsPigLatin();
  }
}
