package practise;

/**
 * Created by leslie on 10/8/16.
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class FreshJuice
{
    enum FreshJuiceSize {SMALL, MEDUIM, LARGE}
    FreshJuiceSize size;
}
public class FreshJuiceTest implements Runnable{
    private static int numInstance = 0;
    protected static int getCount()
    {
        return numInstance;
    }
    protected static void addInstance()
    {
        numInstance++;
    }
    private volatile boolean active;
    public void run()
    {
        active = true;
        while (active)
        {

        }
    }

    public void stop()
    {
        active = false;
    }


    Character ch = new Character('a');

    Integer canChangeInt = new Integer(10);

    public void changeInteger(Integer chInt)
    {
        chInt = 5;
    }

    public  static  void main(String []args)
    {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDUIM;
        System.out.println("Hello Java, I am from FreshJuiceTest");
        FreshJuiceTest.addInstance();
        System.out.println(FreshJuiceTest.getCount());
        System.out.println(getCount());

        String name = "Leslie";
        boolean result = name instanceof String;
        System.out.println(result);
        result = juice instanceof FreshJuice;
        System.out.println(result);

        char[] helloArray = {'h', 'e', 'l'};
        String helloString = new String(helloArray);//StringBuffer & StringBuilder 类。
        System.out.println(helloString + "" + helloString.length());

        StringBuffer sBuffer = new StringBuffer(" test");
        sBuffer.append(" String Buffer");
        System.out.println(sBuffer);

        Date date = new Date();
        System.out.println(date.toString());

        try
        {
            Thread.sleep(3*1000);
        }
        catch (Exception e)
        {
            System.out.println("Got an exception " + e.getMessage());
        }

        Calendar c = Calendar.getInstance();
        c.set(2009, 6 - 1, 12 );
        System.out.println(c.toString());

        GregorianCalendar c1 = new GregorianCalendar();
        int year = c1.get(Calendar.YEAR);

        if (c1.isLeapYear(year))
        {
            System.out.println("Is leap year");
        }
        else
        {
            System.out.println("is not lead year");
        }

        FreshJuiceTest fjT = new FreshJuiceTest();
        System.out.println(fjT.canChangeInt);
        fjT.changeInteger(fjT.canChangeInt);
        System.out.println(fjT.canChangeInt);












    }
}
