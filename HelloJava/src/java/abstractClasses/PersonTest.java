package abstractClasses;

import java.util.*;
/**
 * Created by leslie on 10/18/16.
 */
public class PersonTest {
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        people[0] = new Employee("Leslie Li", 5000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "Computer science");

        for (Person p: people)
        {
            System.out.println(p.getName() +"," + p.getDescription());
        }

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("A", 5000, 1988, 10, 1));
        staff.add(new Employee("B", 7000, 1988, 10, 2));

        for (Employee e: staff)
        {
            e.raiseSalary(5);
        }

        for (Employee e: staff)
        {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }

    }
}
