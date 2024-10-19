public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double mortgageAmount;
    protected double interestRate;
    protected int term;

     public Mortgage(String mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term)
     {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        if (mortgageAmount > MAX_MORTGAGE_AMOUNT)
        {
            System.out.println("Mortgage amount exceeds the maximum limit of $" + MAX_MORTGAGE_AMOUNT);
            this.mortgageAmount = MAX_MORTGAGE_AMOUNT;
        }
        else
        {
            this.mortgageAmount = mortgageAmount;
        }

        this.interestRate = interestRate;

        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM)
        {
            this.term = SHORT_TERM;
        }
        else
        {
            this.term = term;
        }
    }

    public double calculateTotalAmountOwed()
    {
        return mortgageAmount + (mortgageAmount * interestRate * term);
    }

    public String getMortgageInfo()
    {
        return "Mortgage Number: " + mortgageNumber + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Mortgage Amount: $" + mortgageAmount + "\n" +
                "Interest Rate: " + (interestRate * 100) + "%\n" +
                "Term: " + term + " years\n" +
                "Total Amount Owed: $" + calculateTotalAmountOwed();
    }
}
