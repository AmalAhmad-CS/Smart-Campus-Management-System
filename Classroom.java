// This is the base class for all types of classrooms

public abstract class Classroom {
    // Instance variables
    private String roomNumber;
    private int capacity;
    private int currentStudents;
    private boolean needsMaintenance;
    private boolean isBooked;
    
    // Constructor
    public Classroom(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.currentStudents = 0;
        this.needsMaintenance = false;
        this.isBooked = false;
    }
    
    // Getter and Setter methods
    public String getRoomNumber() {
        return roomNumber;
    }
    
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public int getCurrentStudents() {
        return currentStudents;
    }
    
    public void setCurrentStudents(int currentStudents) {
        this.currentStudents = currentStudents;
    }
    
    public boolean needsMaintenance() {
        return needsMaintenance;
    }
    
    public void setNeedsMaintenance(boolean needsMaintenance) {
        this.needsMaintenance = needsMaintenance;
    }
    
    public boolean isBooked() {
        return isBooked;
    }
    
    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }
    
    // Check if room is available for booking
    public boolean isAvailable() {
        return !isBooked && !needsMaintenance;
    }
    
    // Abstract method - must be implemented by all child classes
    public abstract String getRoomType();
    
    // Display room information
    public void displayInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + getRoomType());
        System.out.println("Capacity: " + capacity + " students");
        System.out.println("Status: " + (isAvailable() ? "Available" : "Not Available"));
        if (needsMaintenance) {
            System.out.println("Under Maintenance");
        }
        if (isBooked) {
            System.out.println("Currently Booked");
        }
    }
    
    // Check if room can accommodate the required number of students
    public boolean canAccommodate(int requiredCapacity) {
        return this.capacity >= requiredCapacity;
    }
}
