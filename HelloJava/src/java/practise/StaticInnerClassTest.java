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
public class StaticInnerClassTest {
    public static void main(String [] args)
    {
        double[] d = new double[20];
        for(int i = 0; i < d.length; ++i)
        {
            d[i] = 100 * Math.random();
        }

        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());

    }
}

class ArrayAlg
{
    public static class Pair
    {
        private double first;
        private double second;

        public Pair(double f, double s)
        {
            first = f;
            second = s;
        }

        public double getFirst()
        {
            return first;
        }

        public double getSecond()
        {
            return second;
        }
    }

    public static Pair minmax(double[] values)//This is a static method so the Pair must be static
    {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for(double v: values)
        {
            if(min > v) min = v;
            if(max < v) max = v;
        }

        return new Pair(min, max);
    }
}
