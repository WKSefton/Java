/** 
 *  Name: William Sefton
 *  Instructor: Laurie Werner 
 *  Partner: None 
 *  CSE 271 HA 
 *  CounterGUI creates a window with two buttons, one to increase the count and another to reset the count.
 */

//import swing, events and layout
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

//class that extends JFrame so we can add a panel
public class CounterGUI extends JFrame
{
  //variables and ojbects used by the panel and listener
  private int count = 0;
  private JLabel counter = new JLabel("Count: " + count);
  private JButton click = new JButton("Click!");
  private JButton clear = new JButton("Clear");
  
  //constructor that adds JButtons and JLabel to the JPanel
  //adds ActionListeners to the JButtons
  //adds the JPanel to the JFrame
  public CounterGUI()
  {
    //set JFrame title, size and close action
    super("Counter");
    setSize(300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //create panel and the layout
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(1,30,55));
    
    //add buttons and actionlisteners
    click.addActionListener(new ClickListener());
    buttonPanel.add(click);
    
    clear.addActionListener(new ClearListener());
    buttonPanel.add(clear);
    
    buttonPanel.add(counter);
    
    getContentPane().add(buttonPanel);
  }
  
  //subclass that implements an ActionListener and changes the 
  //text on the JLabel
  private class ClickListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      count++;
      counter.setText("Count: " + count);
    } 
  }
  
  //subclass that implements the ActionListener to
  //set the JLabel back to 0
  private class ClearListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      count = 0;
      counter.setText("Count: " + count);
    }
  }
  
  //main method that creates the GUI and sets the JFrame to visible
  public static void main(String[] args)
  {
    CounterGUI counterGUI = new CounterGUI(); 
    counterGUI.setVisible(true);
  }
}

