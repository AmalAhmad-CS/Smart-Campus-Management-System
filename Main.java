// Main.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Classroom> allRooms = new ArrayList<>();
        College myCollege = null;
        BookingSystem bookingSystem = null;

        boolean continueProgram = true;
        
        while (continueProgram) {
            // Main Menu
            System.out.println("\n=== Classroom Management System ===");
            System.out.println("Welcome! Choose your role:");
            System.out.println("1. Data Entry (Administrator)");
            System.out.println("2. Book a Room (User)");
            System.out.println("3. Exit Program");
            System.out.print("Enter choice (1, 2, or 3): ");
            int userRole = input.nextInt();
            input.nextLine();

            if (userRole == 1) {
                // ==== Data Entry Mode ====
                System.out.print("\nEnter College Name: ");
                String collegeName = input.nextLine();
                myCollege = new College(collegeName);
                
                // Clear previous rooms
                allRooms.clear();

                System.out.print("How many rooms do you want to add? ");
                int totalRooms = input.nextInt();
                input.nextLine();

                for (int i = 1; i <= totalRooms; i++) {
                    System.out.println("\nRoom #" + i);
                    System.out.println("Choose room type:");
                    System.out.println("1. Lecture Room");
                    System.out.println("2. Lab");
                    System.out.println("3. Smart Classroom");
                    System.out.print("Enter choice: ");
                    int choice = input.nextInt();
                    input.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter Lecture Room ID: ");
                            String lecId = input.nextLine();
                            System.out.print("Enter capacity: ");
                            int lecCap = input.nextInt();
                            System.out.print("Has projector? (true/false): ");
                            boolean lecProj = input.nextBoolean();
                            System.out.print("Has whiteboard? (true/false): ");
                            boolean white = input.nextBoolean();
                            input.nextLine();
                            LectureRoom lr = new LectureRoom(lecId, lecCap, lecProj, white);
                            allRooms.add(lr);
                            myCollege.addRoom(lr);
                            break;

                        case 2:
                            System.out.print("Enter Lab Room ID: ");
                            String labId = input.nextLine();
                            System.out.print("Enter capacity: ");
                            int labCap = input.nextInt();
                            System.out.print("Needs maintenance? (true/false): ");
                            boolean needM = input.nextBoolean();
                            System.out.print("Computers count: ");
                            int comps = input.nextInt();
                            input.nextLine();
                            Lab lab = new Lab(labId, labCap, needM, comps);
                            allRooms.add(lab);
                            myCollege.addRoom(lab);
                            break;

                        case 3:
                            System.out.print("Enter Smart Room ID: ");
                            String smartId = input.nextLine();
                            System.out.print("Enter capacity: ");
                            int smartCap = input.nextInt();
                            System.out.print("Has smart screen? (true/false): ");
                            boolean smartScreen = input.nextBoolean();
                            System.out.print("Has projector? (true/false): ");
                            boolean smartProj = input.nextBoolean();
                            input.nextLine();
                            SmartClassroom sc = new SmartClassroom(smartId, smartCap, smartScreen, smartProj);
                            allRooms.add(sc);
                            myCollege.addRoom(sc);
                            break;

                        default:
                            System.out.println("Invalid choice – try again.");
                            i--; // repeat
                    }
                }

                // Create BookingSystem with the entered rooms
                bookingSystem = new BookingSystem(allRooms);
                
                System.out.println("\n*** Data saved successfully! ***");
                System.out.println("Total rooms added: " + allRooms.size());
                System.out.println("\nRedirecting to Booking Menu...");
                
                // Fall through to booking mode
            }
            
            if (userRole == 2) {
                // ==== Booking Mode ====
                
                // Check if coming from data entry or direct booking
                if (bookingSystem != null && !allRooms.isEmpty()) {
                    // Coming from data entry - use entered data
                    System.out.println("\n=== Room Booking System ===");
                    System.out.println("Using your entered room data.");
                } else {
                    // Direct booking - offer sample data
                    System.out.println("\n=== Room Booking System ===");
                    System.out.println("\nNo room data found!");
                    System.out.println("Choose an option:");
                    System.out.println("1. Use sample rooms (demo data)");
                    System.out.println("2. Go back to enter room data first");
                    System.out.print("Enter choice: ");
                    int dataChoice = input.nextInt();
                    input.nextLine();
                    
                    if (dataChoice == 1) {
                        // Use sample rooms
                        bookingSystem = new BookingSystem();
                        allRooms = bookingSystem.getRooms();
                        System.out.println("Using sample room data for demonstration.");
                    } else {
                        continue; // Go back to main menu
                    }
                }
                
                if (myCollege == null) {
                    System.out.print("\nEnter College Name: ");
                    String collegeName = input.nextLine();
                    myCollege = new College(collegeName);
                    
                    // Add rooms to college
                    for (Classroom room : bookingSystem.getRooms()) {
                        myCollege.addRoom(room);
                    }
                }

                boolean continueBooking = true;
                while (continueBooking) {
                    System.out.println("\n--- Booking Menu ---");
                    System.out.println("1. View Room Reports");
                    System.out.println("2. View Available Rooms");
                    System.out.println("3. View Booked Rooms");
                    System.out.println("4. Book a Room");
                    System.out.println("5. Cancel a Booking");
                    System.out.println("6. View All Room Details");
                    System.out.println("7. Return to Main Menu");
                    System.out.print("Enter choice: ");
                    int bookingChoice = input.nextInt();
                    input.nextLine();

                    switch (bookingChoice) {
                        case 1:
                            // View complete report
                            ReportGenerator report = new ReportGenerator(bookingSystem.getRooms());
                            report.printAvailableRooms();
                            report.printOccupiedRooms();
                            report.printSmartRooms();
                            report.printMaintenanceRooms();
                            break;

                        case 2:
                            // View available rooms
                            bookingSystem.displayAvailableRooms();
                            break;

                        case 3:
                            // View booked rooms
                            bookingSystem.displayBookedRooms();
                            break;

                        case 4:
                            // Book a room
                            System.out.print("\nEnter room number to book: ");
                            String roomToBook = input.nextLine();
                            System.out.print("Enter number of students: ");
                            int studentsCount = input.nextInt();
                            input.nextLine();
                            bookingSystem.bookRoom(roomToBook, studentsCount);
                            break;

                        case 5:
                            // Cancel booking
                            System.out.print("\nEnter room number to cancel booking: ");
                            String roomToCancel = input.nextLine();
                            bookingSystem.cancelBooking(roomToCancel);
                            break;

                        case 6:
                            // View all room details
                            bookingSystem.displayAllRooms();
                            break;

                        case 7:
                            // Return to main menu
                            continueBooking = false;
                            break;

                        default:
                            System.out.println("Invalid choice!");
                    }
                }

            } else if (userRole == 3) {
                // Exit program
                continueProgram = false;
                System.out.println("\nThank you for using the Classroom Management System!");
                System.out.println("Goodbye!");
                
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        input.close();
    }
}