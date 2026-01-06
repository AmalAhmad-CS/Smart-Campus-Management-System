// Lab Class Developer.java
// This class inherits from Classroom and checks if the number of students fits the computers count.

public class Lab extends Classroom {

    private int computersCount;

    public Lab(String roomNumber, int capacity, boolean needsMaintenance, int computersCount) {
        super(roomNumber, capacity); 
        setCurrentStudents(0); // Start with 0 students
        setNeedsMaintenance(needsMaintenance);
        this.computersCount = computersCount;
    }

    public int getComputersCount() {
        return computersCount;
    }

    public void setComputersCount(int computersCount) {
        this.computersCount = computersCount;
    }

    public boolean canFitStudents() {
        if (getCurrentStudents() <= computersCount) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getRoomType() {
        return "Laboratory";
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method first
        System.out.println("Computers Count: " + computersCount);
        System.out.println("Can Fit Current Students: " + (canFitStudents() ? "Yes" : "No"));
    }
}