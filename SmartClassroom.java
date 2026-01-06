// SmartClassroom.java
// This class extends Classroom and adds smart-room features.

public class SmartClassroom extends Classroom {
    private boolean hasSmartScreen;
    private boolean hasProjector;

    public SmartClassroom(String roomNumber, int capacity, boolean hasSmartScreen, boolean hasProjector) {
        super(roomNumber, capacity);
        this.hasSmartScreen = hasSmartScreen;
        this.hasProjector = hasProjector;
    }

    public boolean hasSmartScreen() {
        return this.hasSmartScreen;
    }

    public void setHasSmartScreen(boolean hasSmartScreen) {
        this.hasSmartScreen = hasSmartScreen;
    }

    public boolean hasProjector() {
        return this.hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }
    @Override
    public String getRoomType() {
        return "Smart Classroom";
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method first
        System.out.println("Has Smart Screen: " + (hasSmartScreen ? "Yes" : "No"));
        System.out.println("Has Projector: " + (hasProjector ? "Yes" : "No"));
    }
}