import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userImput = new Scanner(System.in);

        Insurance[] insuranceArray = new Insurance[2];

        System.out.print("Enter the monthly fee for Life Insurance: ");
        double lifeCost = userImput.nextDouble();
        insuranceArray[0] = new Life();
        insuranceArray[0].setInsuranceCost(lifeCost);

        System.out.print("Enter the monthly fee for Health Insurance: ");
        double healthCost = userImput.nextDouble();
        insuranceArray[1] = new Health();
        insuranceArray[1].setInsuranceCost(healthCost);

        System.out.println("\nInsurance Details:");
        for (Insurance insurance : insuranceArray)
        {
            insurance.displayInfo();
        }
    }
}
