package practise;

/**
 * Created by leslie on 10/8/16.
 */
class FreshJuice
{
    enum FreshJuiceSize {SMALL, MEDUIM, LARGE}
    FreshJuiceSize size;
}
public class FreshJuiceTest {
    public  static  void main(String []args)
    {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDUIM;
        System.out.println("Hello Java, I am from FreshJuiceTest");
    }
}
