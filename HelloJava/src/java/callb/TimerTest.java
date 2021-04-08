package callb;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Created by leslie on 10/17/16.
 */
public class TimerTest {
    public static void main(String [] args)
    {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener);
        t.start();//if success, will call the listener's actionPerformed

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}

class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        Date now = new Date();
        System.out.println("At the tone, the time is " + now);
        Toolkit.getDefaultToolkit().beep();//Toolkit includes the GUI environement's info
    }
}