class FullTimeGameTester extends GameTester {

    // Constructor
    public FullTimeGameTester(String name) {
        super(name, true);
    }

    // Implementing the abstract method
    @Override
    public double determineSalary(int hoursWorked) {
        return 3000;
    }
}
