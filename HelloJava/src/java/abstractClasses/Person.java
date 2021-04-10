package abstractClasses;

/**
 * Created by leslie on 10/18/16.
 */
public abstract class Person {
    public abstract String getDescription();

    private String name;
    public Person(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
}
