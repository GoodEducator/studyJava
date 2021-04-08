package practise;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Created by leslie on 10/17/16.
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        //ActionListener listener = new TimePrinter();
        //or
        //ActionListener listener = this.new TimePrinter();
        //we can use anonymous inner class
        ActionListener listener = new ActionListener() {
            @Override //this can be inogred
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("At the tone, the time is " + now);
                System.out.println(Double.MAX_VALUE);
                System.out.println(Double.MIN_VALUE);
                if(TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);

            if(TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
