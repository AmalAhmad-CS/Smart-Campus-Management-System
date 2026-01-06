//lectureRoom.java 
// This class extends Classroom and represent a lectureRoom.
//So here I inherit from the superclass(Classroom) to the subclass(LectureRoom).
public class LectureRoom extends Classroom {
 //This make LectureRoom  more specialized type of Classroom.
 //these are extra attributes.
 private boolean hasProjector;
    private boolean hasWhiteBoard;
    
    //three-argument constructor.
 public LectureRoom(String roomNumber, int capacity, boolean hasProjector, boolean hasWhiteBoard) {
  //call superclass constructor;
  super(roomNumber, capacity);
  //use 'this' command to assign value to the current object's instance variables.
  this.hasProjector = hasProjector;
  this.hasWhiteBoard = hasWhiteBoard;
 }
 
 //Getter:return true if the room has a projector.

 public boolean hasProjector() {
	  return hasProjector;
 }
 //setter:allows changing projector availability later if needed.
 public void sethasProjector(boolean hasProjector) {
		this.hasProjector = hasProjector;
	}
 
 //Getter for whiteboard.
 public boolean hasWhiteBoard() {
  return hasWhiteBoard;
 }
 //setter for whiteboard .
 public void sethasWhiteBoard(boolean hasWhiteBoard) {
  this.hasWhiteBoard = hasWhiteBoard;
 }
 //override method from Classroom to return specific room type.
 @Override
 public String getRoomType() {
  return "Lecture Room";
 }
 
		public void displayInfo() {
			super.displayInfo(); // Call parent method first
			System.out.println("Has Projector: " + (hasProjector ? "Yes" : "No"));
			System.out.println("Has Whiteboard: " + (hasWhiteBoard ? "Yes" : "No"));
		}
}