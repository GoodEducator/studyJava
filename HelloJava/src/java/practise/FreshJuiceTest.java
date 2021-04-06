package practise;

/**
 * Created by leslie on 10/8/16.
 */
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.lang.Throwable;
import java.io.File;
import java.util.Scanner;

class FreshJuice
{
    enum FreshJuiceSize {SMALL, MEDUIM, LARGE}
    FreshJuiceSize size;
}

interface It_1
{
    int i = 10;
    void print();
}

class It_class1 implements It_1
{
    void f()
    {

    }

    public void print()//override the abstract method
    {
        System.out.println("Coming from print()");

    }
}

//从某种意义上说，interface是一种特殊形式的 abstract class。
//在abstract class的定义中，我们可以赋予方法的默认行为。但是在interface的定义中，方法却不能拥有默认行为
abstract class Demo
{
    abstract void method1();
    abstract void method2();
}

abstract class Animal
{
//    public void move()
//    {
//        System.out.println("Animal can move");
//    }
    abstract void eat();
}

class Dog extends Animal
{
//    public void move()
//    {
//        super.move();
//        System.out.println("Dog can move");
//    }
//
//    public void bark()
//    {
//        System.out.println("Dog can bark");
//    }

    public void eat()
    {
        System.out.println("Eat bone");
    }
    public void work()
    {
        System.out.println("watch the home");
    }
}

class Cat extends Animal
{
    public void eat()
    {
        System.out.println("Eat Fish");
    }

    public void work()
    {
        System.out.println("Catch the mouse");
    }
}

//Demonstrate the 多态

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
            //Thread.sleep(3*1000);
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


        char ch;
        String strFromConsole;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        try{
//            do {
//                //ch = (char)br.read();
//                strFromConsole = br.readLine();
//                System.out.println(strFromConsole);
//            }//while (ch != 'q');
//            while (!strFromConsole.equals("end"));
//
//        }catch (Exception e){
//            System.out.println("Exception is " + e.getLocalizedMessage());
//        }

        try{
            byte bWrite[] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("./resouces/test.txt");
            for(int x = 0; x < bWrite.length; ++x) {
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("./resouces/test.txt");
            int size = is.available();
            for(int i = 0; i < size; ++i)
            {
                System.out.println((char)is.read() + " ");
            }
            is.close();
        }catch (IOException e)
        {
            System.out.println("Exception " + e.getLocalizedMessage());
        }

        //create a folder
//        String dirname = "./testFolder";
//        File d = new File(dirname);
//        d.mkdirs();

        String dirname = "/tmp";
        File f1 = new File(dirname);

        if (f1.isDirectory())
        {
            System.out.println("Directory of " + dirname);
            String s[] = f1.list();
            for (int i = 0 ; i < s.length; ++i)
            {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory())
                {
                    System.out.println(s[i] + " is a directory");
                }
                else
                {
                    System.out.println(s[i] + " is a file");
                }
            }
        }
        else
        {
            System.out.println(dirname + " is not a directory");
        }

        //Scanner class
        System.out.println("Please enter the data:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Next style to receive: ");
        if (scan.hasNextLine()) // scan.hasNext()
        {
            String str1 = scan.nextLine();
            System.out.println("Input data is " + str1);
        }

        It_1 a = new It_class1();
        a.print();

//        Animal animal = new Animal();
        Dog dog = new Dog();

        Animal aDog = new Dog();
//        animal.move();
//        dog.move();
//        aDog.move();//dog can move, just don't like c++ there is no need virtual keyword
        //aDog.bark();

        show(new Cat());
        show(new Dog());

        Animal aAnimal = new Cat();
        aAnimal.eat();


















        System.gc();

    }
    protected void finalize() throws Throwable
    {
        System.out.println("[finalize...]");
    }

    public static void show(Animal a)
    {
        a.eat();

        if (a instanceof Cat)
        {
            Cat c= (Cat)a;
            c.work();
        }
        else if (a instanceof Dog)
        {
            Dog d = (Dog)a;
            d.work();
        }
    }
}
