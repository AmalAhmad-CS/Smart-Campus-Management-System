// College.java
// This class represents a College, stores a list of classrooms,and provides methods to add rooms and list available rooms

import java.util.ArrayList;

public class College {

    //Instance Variables
    private String collegeName;          
    private ArrayList<Classroom> rooms;         

    // Constructor
    public College(String collegeName) {
        this.collegeName = collegeName;
        this.rooms = new ArrayList<>();
    }

    // Method to add a room
    public void addRoom(Classroom room) {
        rooms.add(room);
    }

    // Method to list available rooms
    public void listAvailableRooms() {
    System.out.println("Available Rooms:");
    boolean found = false;

    for (Classroom room : rooms) {
        if (room.isAvailable()) {
            System.out.println(room.getRoomNumber() + " - " + room.getRoomType());
            found = true;
        }
    }

    if (!found) {
        System.out.println("No rooms available.");
    }
}
}