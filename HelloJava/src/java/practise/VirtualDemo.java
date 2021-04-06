package practise;

/**
 * Created by leslie on 10/15/16.
 */
public class VirtualDemo {
    public static void main(String [] args)
    {
        Salary s = new Salary("Leslie", "beijing", 3, 3600.00);
        Employee e = new Salary("LeiLie", "Chengdu", 4, 9877.00);

        s.mailCheck();
        e.mailCheck();
    }
}
