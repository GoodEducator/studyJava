package abstractClasses;

/**
 * Created by leslie on 10/18/16.
 */
public class Student extends Person {
    private String major;
    public Student(String n, String m)
    {
        super(n);
        major = m;
    }

    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
