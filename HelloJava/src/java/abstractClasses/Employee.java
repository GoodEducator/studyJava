package abstractClasses;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by leslie on 10/18/16.
 */
public class Employee extends Person{

    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

//    public String getName()
//    {
//        return name;
//    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getDescription()
    {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public int hashCode()
    {
//        return 7 * Objects.hashCode(getName())
//                + 11 * new Double(getSalary()).hashCode()
//                + 13 * Objects.hashCode(getHireDay());
        return Objects.hash(getName(), getSalary(), getHireDay());
    }

    public String toString()
    {
        return getClass().getName() + "[name=" + getName()
                + ",salary=" + getSalary()
                + ",hireDay=" + getHireDay()
                + "]";
    }
}
