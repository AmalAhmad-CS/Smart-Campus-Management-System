import java.util.ArrayList;

public class BookingSystem {

    private ArrayList<Classroom> rooms;

    // Constructor receives a list of rooms
    public BookingSystem(ArrayList<Classroom> rooms) {
        this.rooms = rooms;
    }

    // Empty constructor to create sample rooms
    public BookingSystem() {
        this.rooms = new ArrayList<>();
        // Add sample rooms
        rooms.add(new SmartClassroom("R1", 30, true, true));
        rooms.add(new SmartClassroom("R2", 40, true, false));
        rooms.add(new SmartClassroom("R3", 50, false, true));
        rooms.add(new Lab("L1", 25, false, 20));
        rooms.add(new Lab("L2", 30, true, 25));
        rooms.add(new LectureRoom("LC1", 100, true, true));
        rooms.add(new LectureRoom("LC2", 80, false, true));
    }

    // Add a new room
    public void addRoom(Classroom room) {
        rooms.add(room);
    }

    // Book a room
    public boolean bookRoom(String roomNumber, int students) {
        Classroom room = getRoomByNumber(roomNumber);

        if (room == null) {
            System.out.println("Room " + roomNumber + " not found.");
            return false;
        }

        if (!room.isAvailable()) {
            System.out.println("Room " + roomNumber + " is not available.");
            return false;
        }

        if (!room.canAccommodate(students)) {
            System.out.println("Room " + roomNumber + 
                               " cannot accommodate " + students + " students.");
            return false;
        }

        room.setBooked(true);
        room.setCurrentStudents(students);
        System.out.println("\n*** Room " + roomNumber + " successfully booked! ***");
        System.out.println("IMPORTANT REMINDERS:");
        System.out.println("- Maximum booking duration: 5 hours");
        System.out.println("- Please cancel your booking when you finish");
        System.out.println("- This allows other users to book the room");
        System.out.println("- Thank you for your cooperation!\n");
        return true;
    }

    // Cancel a booking
    public void cancelBooking(String roomNumber) {
        Classroom room = getRoomByNumber(roomNumber);

        if (room == null) {
            System.out.println("Room " + roomNumber + " not found.");
            return;
        }

        if (!room.isBooked()) {
            System.out.println("Room " + roomNumber + " is not currently booked.");
            return;
        }

        room.setBooked(false);
        room.setCurrentStudents(0);
        System.out.println("Booking for room " + roomNumber + " has been cancelled.");
    }

    // Display all rooms
    public void displayAllRooms() {
        System.out.println("\n=== All Rooms ===");
        for (Classroom room : rooms) {
            room.displayInfo();
            System.out.println("-----------------------------");
        }
    }

    // Display available rooms only
    public void displayAvailableRooms() {
        System.out.println("\n=== Available Rooms for Booking ===");
        boolean foundAvailable = false;
        for (Classroom room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room.getRoomNumber() + " - " + 
                                 room.getRoomType() + 
                                 " (Capacity: " + room.getCapacity() + ")");
                foundAvailable = true;
            }
        }
        if (!foundAvailable) {
            System.out.println("No rooms available at the moment.");
        }
    }

    // Display booked rooms
    public void displayBookedRooms() {
        System.out.println("\n=== Booked Rooms ===");
        boolean foundBooked = false;
        for (Classroom room : rooms) {
            if (room.isBooked()) {
                System.out.println(room.getRoomNumber() + " - " + 
                                 room.getRoomType() + 
                                 " (Students: " + room.getCurrentStudents() + ")");
                foundBooked = true;
            }
        }
        if (!foundBooked) {
            System.out.println("No rooms are currently booked.");
        }
    }

    // Search for a room by number
    private Classroom getRoomByNumber(String roomNumber) {
        for (Classroom room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room;
            }
        }
        return null;
    }

    // Get the list of rooms
    public ArrayList<Classroom> getRooms() {
        return rooms;
    }
}