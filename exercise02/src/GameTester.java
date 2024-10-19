abstract class GameTester {
    public String name;
    public boolean isFullTime;

    // Constructor
    public GameTester(String name, boolean isFullTime) {
        this.name = name;
        this.isFullTime = isFullTime;
    }

    // Getters
    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

     public abstract double determineSalary(int hoursWorked);
}
