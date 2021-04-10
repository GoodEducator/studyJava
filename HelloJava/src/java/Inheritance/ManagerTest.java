package Inheritance;

/**
 * Created by leslie on 10/18/16.
 */
public class ManagerTest {
    public static void main(String [] args)
    {
        Manager boss = new Manager(" Leslie Li ", 80000, 1987, 12, 15);
        boss.setBonus(50000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 5000, 1989, 10 ,1 );
        staff[2] = new Employee("Tommy Tester", 4000, 1980, 20 ,1 );

        for (Employee e: staff)
        {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());

            if (e instanceof Manager)
            {
                System.out.println("name=" + e.getName() + "is a manager");
            }
        }

    }
}
