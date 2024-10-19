import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current prime interest rate (as a decimal, e.g., 0.03 for 3%): ");
        double primeRate = scanner.nextDouble();

        Mortgage[] mortgages = new Mortgage[3];

        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Enter the type of mortgage (1 for Business, 2 for Personal): ");
            int type = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter the mortgage number:");
            String mortgageNumber = scanner.nextLine();

            System.out.println("Enter the customer name:");
            String customerName = scanner.nextLine();

            System.out.println("Enter the mortgage amount:");
            double mortgageAmount = scanner.nextDouble();

            System.out.println("Enter the mortgage term (1 for Short, 3 for Medium, 5 for Long):");
            int term = scanner.nextInt();

            if (type == 1) {
                 mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else if (type == 2) {
                 mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, primeRate, term);
            } else {
                System.out.println("Invalid mortgage type selected.");
                i--;
            }
        }

         System.out.println("\nAll Mortgage Information:");
        for (Mortgage mortgage : mortgages) {
            System.out.println(mortgage.getMortgageInfo());
            System.out.println("----------------------------------------");
        }

     }
}
