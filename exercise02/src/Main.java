import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the game tester:");
        String name = scanner.nextLine();

        System.out.println("Enter the type of game tester (1 for Full-Time, 2 for Part-Time):");
        int testerType = scanner.nextInt();

        GameTester tester;

        if (testerType == 1)
        {
            tester = new FullTimeGameTester(name);
            System.out.println("Full-Time Game Tester created.");
        } else if (testerType == 2)
        {
            System.out.println("Enter the number of hours worked:");
            int hoursWorked = scanner.nextInt();
            tester = new PartTimeGameTester(name);
            System.out.println("Part-Time Game Tester created.");
            System.out.println(tester.getName() + "'s salary is $" + tester.determineSalary(hoursWorked));
            return;
        }
        else
        {
            System.out.println("Invalid tester type selected.");
            return;
        }

         System.out.println(tester.getName() + "'s salary is $" + tester.determineSalary(0));

    }
}
