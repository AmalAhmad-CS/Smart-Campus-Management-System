import java.util.ArrayList;

class ReportGenerator {

    private ArrayList<Classroom> rooms;

    public ReportGenerator(ArrayList<Classroom> rooms) {
        this.rooms = rooms;
    }

    public void printAvailableRooms() {
        System.out.println("=== Available Rooms ===");
        for (Classroom r : rooms) {
            if (r.isAvailable() && !r.needsMaintenance()) {
                System.out.println(r.getRoomNumber() + " - " + r.getRoomType());
            }
        }
        System.out.println();
    }

    public void printOccupiedRooms() {
        System.out.println("=== Occupied Rooms ===");
        for (Classroom r : rooms) {
            if (!r.isAvailable() && !r.needsMaintenance()) {
                System.out.println(r.getRoomNumber() + " - " + r.getRoomType());
            }
        }
        System.out.println();
    }

    public void printSmartRooms() {
        System.out.println("=== Smart Rooms ===");
        for (Classroom r : rooms) {
            if (r instanceof SmartClassroom) {
                System.out.println(r.getRoomNumber() + " - Smart Classroom");
            }
        }
        System.out.println();
    }

    public void printMaintenanceRooms() {
        System.out.println("=== Rooms Under Maintenance ===");
        for (Classroom r : rooms) {
            if (r.needsMaintenance()) {
                System.out.println(r.getRoomNumber() + " - " + r.getRoomType());
            }
        }
        System.out.println();
    }
}