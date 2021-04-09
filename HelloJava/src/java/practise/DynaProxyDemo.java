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
interface Subject
{
    public String say(String name, int age);
}

class RealSubject implements Subject
{
    public String say(String name, int age)
    {
        return "name:" + name + "age:" + age;
    }
}

class ProxySubject implements Subject
{
    private Subject sub;
    ProxySubject(Subject sub)
    {
        this.sub = sub;
    }
    public String say(String name, int age)
    {
        return this.sub.say(name, age);
    }
}

public class DynaProxyDemo {
    public static void main(String [] args)
    {
        Subject sub = new ProxySubject(new RealSubject());//Just like a bridge
        String info = sub.say("clin", 20);//Actually call the RealSubject
        System.out.println(info);
    }
}
