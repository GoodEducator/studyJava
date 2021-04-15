package practise;
import Inheritance.Manager;
import abstractClasses.*;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by leslie on 10/20/16.
 */
public class EnumTest {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGR) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        //equals just compare the content of two objects but == compare the address of the two objects
        if(size == Size.EXTRA_LARGE)
        {
            System.out.println("Good job--you paid attention to the _.");
        }
        else // size will have the same address of Size.xx
        {
            System.out.println("size hashcode is " + size.hashCode() + "Size.SMALL hashcode is" +
            Size.SMALL.hashCode());
        }

        Manager boss = new Manager(" Leslie Li ", 80000, 1987, 12, 15);
        boss.setBonus(50000);

        System.out.println(boss.getClass().getName() + " " + boss.getName());
        String className = "java.util.Date";
        //Class c1 = Class.forName(className);
        try
        {
            Object m = Class.forName(className).newInstance();
            Class c1 = boss.getClass();
            Field f = c1.getDeclaredField("bonus");
            f.setAccessible(true);
            Object v = f.get(boss);
        }
        catch (Exception e)
        {
            System.out.println("Class.forName exception");
            e.printStackTrace();
        }








    }



}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL"); //four instances for the class Size.

    private String abbreviation;

    private Size(String abbreviation)
    {
        System.out.println("Size(%s)" + abbreviation);
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation()
    {
        return abbreviation;
    }
}
