class PartTimeGameTester extends GameTester {

    // Constructor
    public PartTimeGameTester(String name) {
        super(name, false);
    }

     @Override
    public double determineSalary(int hoursWorked) {
        return 20 * hoursWorked;
    }
}
