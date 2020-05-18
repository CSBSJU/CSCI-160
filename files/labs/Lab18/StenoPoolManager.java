// GraphicsProgram
import acm.program.GraphicsProgram;
// GLabel
import acm.graphics.GLabel;
// Font, Color
import java.awt.*;
// ActionListener, ActionEvent
import java.awt.event.*;
// JButton, JTextField
import javax.swing.*;

/**
 * A program that manages a stenographer pool for a business.
 * 
 * @author <your names>
 */
public class StenoPoolManager extends GraphicsProgram implements ActionListener
{
  // The pool of available stenographers
  private StenoPool thePool;
  // The text box for the user to enter stenographer names
  private JTextField userEntry;
  // Buttons to indicate whether the user wants to add or assign/unassign
  private JButton addSteno, moveSteno;
  // The pool stenographers listed as "available" and "busy"
  private JTextArea availableStenoList, busyStenoList;
  
  // some standard spacing
  private static final double VERTICAL_SPACING = 30;
  // some useful fonts
  private static final Font PLAIN_FONT = new Font("TimesRoman", Font.PLAIN, 18);
  private static final Font BOLD_FONT = new Font("TimesRoman", Font.BOLD, 18);
  
  /**
   * Program entry point; creates the GUI.
   */
  public void init()
  {
    // create the steographer pool
    this.thePool = new StenoPool();
    
    // set size to a fixed size
    this.resize(700, 500);
    
    // add a text box, and buttons to add or assign/unassign stenographers
    this.userEntry = new JTextField(28);
    this.userEntry.setFont(StenoPoolManager.PLAIN_FONT);
    this.addSteno = new JButton("Add");
    this.moveSteno = new JButton("Assign/Unassign");
    this.add(this.userEntry, 0, 0);
    this.add(this.addSteno,
             this.userEntry.getWidth(), 0);
    this.add(this.moveSteno,
             this.addSteno.getX() + this.addSteno.getWidth(), 0);
    
    // create the text areas for listing all the stenographers,
    // and some labels to identify which is which
    this.availableStenoList = new JTextArea(15, 20);
    this.availableStenoList.setBackground(new Color(230, 230, 230));
    this.availableStenoList.setFont(StenoPoolManager.PLAIN_FONT);
    this.availableStenoList.setDisabledTextColor(Color.BLACK);
    this.busyStenoList = new JTextArea(15, 20);
    this.busyStenoList.setBackground(new Color(230, 230, 230));
    this.busyStenoList.setFont(StenoPoolManager.PLAIN_FONT);
    this.busyStenoList.setDisabledTextColor(Color.BLACK);
    GLabel availableLabel = new GLabel("Available");
    availableLabel.setFont(StenoPoolManager.BOLD_FONT);
    GLabel busyLabel = new GLabel("Busy");
    busyLabel.setFont(StenoPoolManager.BOLD_FONT);
    
    // make it so the user can't type into the display-only text areas
    this.availableStenoList.setEnabled(false);
    this.busyStenoList.setEnabled(false);
    
    // add the labels and the text areas
    double yLabelLoc = this.userEntry.getHeight() +
      StenoPoolManager.VERTICAL_SPACING;
    double yTextAreaLoc = yLabelLoc + busyLabel.getHeight();
    this.add(availableLabel, 0, yLabelLoc);
    this.add(busyLabel, this.getWidth() / 2, yLabelLoc);
    this.add(this.availableStenoList, 0, yTextAreaLoc);
    this.add(this.busyStenoList, this.getWidth() / 2, yTextAreaLoc);
    
    // set the text areas to show our initial lists of stenographers (empty)
    this.updatePoolData();
    
    // add listeners for the buttons
    this.addSteno.addActionListener(this);
    this.moveSteno.addActionListener(this);
  }
  
  /**
   * Update the text areas that list the available and busy stenographers,
   * based on the data in our steno pool (thePool).
   */
  private void updatePoolData()
  {
    this.availableStenoList.setText(this.thePool.listAvailable());
    this.busyStenoList.setText(this.thePool.listBusy());
  }
  
  /**
   * Handle button presses.
   * If add, add the new name to the Available pool.
   * If move, switch the named stenographer between the free/busy status.
   * 
   * @param event the click event, which should indicate one of the buttons
   */
  public void actionPerformed(ActionEvent event)
  {
    // *** Figure out which name was entered in the text box, userEntry
    // *** If the text box is empty, print the error message:
    //     "No name entered!"
    //     You can do so with either this.println(...) or as a
    //     pop-up via this.getDialog().println(...);
    
    // *** Otherwise, figure out which button triggered this click event.
    
    // *** If it was the add button...
    //    *** Add the stenographer to the pool.
    //    *** If the stenographer already exists in the pool (and cannot be
    //        added), then print the error message
    //        "<name> already exists in the steno pool."
    
    // *** If it was the move button...
    //    *** Move the entered stenographer from the busy pool to
    //        available (if stenographer is in busy pool) or vice-versa.
    //    *** If stenographer is not in either list, print the error message
    //        "This stenographer is not on either list."
    
    // update the names in each part of the pool
    // *** You should not change or delete this line!
    this.updatePoolData();
  }
}
