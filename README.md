Smart Campus Management System

Object-Oriented Programming Final Project | Smart Campus Management System developed in Java | Led a team of 8 developers

A comprehensive classroom booking system that enables efficient management of university rooms and facilities through an interactive Java-based application.


📋 Project Overview:

This system automates the management of university classrooms, providing a comprehensive suite of services for efficient campus operations:

Key Services:
- Room Reports: View available rooms, booked rooms, smart classrooms, and rooms under maintenance
- Real-Time Availability: Check which rooms are currently available for booking
- Booking Management: Reserve rooms with automatic validation and capacity checking
- Booking Cancellation: Cancel reservations to free up rooms for other users
- Detailed Room Information: Access complete room specifications including type, ID, capacity, availability status, and maintenance information
- Administrative Data Entry: Configure room types (Lecture Rooms, Labs, Smart Classrooms) with their specific equipment and capacity

Target Users:

The system serves anyone who needs classroom space on campus, including students, faculty members, and administrative staff. It streamlines the booking process and eliminates scheduling conflicts through intelligent automation.

👥 Team & My Role:

Project Type: University Group Project (9 members total)

My Role: 

Team Lead & Main Developer

Leadership & Management:
- Task Distribution: Planned and assigned responsibilities to 8 team members based on their strengths
- Code Supervision: Reviewed, debugged, and optimized all team members' code contributions
- Quality Assurance: Ensured adherence to OOP principles and coding standards across the project

Technical Contributions:
- Core Development: Designed and implemented the Classroom abstract class (foundation of the system)
- UML coordination: designed my class structure; reviewed and finalized the coplete UML diagram after team members coplated their classes and relationship.
- Code Integration: Merged and coordinated all team members' modules into a cohesive system

Documentation & Presentation:
- Report Design: Compiled team contributions and designed the comprehensive project report
- Presentation Development: Created and structured the final project presentation
- Team Coordination: Organized practice sessions and coached team members for the final presentation
- Discussion Management: Led and coordinated the project defense and Q&A session


🛠️ Technologies & Concepts:

Language: Java

Programming Paradigm: Object-Oriented Programming (OOP)

Key OOP Concepts Implemented:
- Inheritance: Abstract Classroom parent class with specialized child classes (LectureRoom, Lab, SmartClassroom)
- Polymorphism: Method overriding in getRoomType() and displayInfo() across different room types
- Encapsulation: Private fields with public getters/setters to protect data integrity
- Abstraction: Abstract methods defining common behavior for all classroom types
- Composition: BookingSystem and College classes manage collections of Classroom objects

🏗️ System Architecture:

UML Class Diagram is included in the project files.

Core Classes:
| Class | Description | Type |

| Classroom | Abstract base class defining common properties and behaviors | Abstract Class |

| LectureRoom | Standard lecture halls with projectors and whiteboards | Concrete Class |

| Lab | Computer laboratories with PC count tracking and student-to-computer validation | Concrete Class |

| SmartClassroom | Modern classrooms equipped with smart screens and advanced projectors | Concrete Class |

| BookingSystem | Manages room reservations, availability checks, and booking operations | Service Class |

| College | Represents the institution and maintains the room inventory | Entity Class |

| ReportGenerator | Generates various room status reports and analytics | Utility Class |

| Main | Entry point with dual-mode interface (Admin & User) | Main Class |


✨ Key Features:
For Administrators:
- Data Entry Mode: Add and configure multiple room types with specifications
- Room Configuration: Set capacity, equipment (projectors, smart screens, computers), and maintenance status
- Flexible Setup: Support for three room types with customizable attributes
For Users:
- Intelligent Booking: Reserve rooms with automatic capacity validation
- Conflict Prevention: System prevents double-booking and maintenance conflicts
- Multiple Viewing Options:
  - All rooms with complete details
  - Available rooms only
  - Currently booked rooms
  - Rooms under maintenance
  - Smart classroom inventory
- Easy Cancellation: Free up rooms when no longer needed

System Intelligence:
- Capacity Validation: Prevents overbooking by checking student count against room capacity
- Equipment Tracking: Monitors projectors, smart screens, and computer availability
- Maintenance Management: Tracks and prevents booking of rooms under maintenance
- Real-Time Updates: Immediate reflection of booking status across all views

📊 Room Types & Specifications:

| Room Type | Special Attributes | Validation |

| Lecture Room | Projector availability, Whiteboard availability | Capacity-based |

| Lab | Computer count, PC-to-student ratio | Computers ≥ Students |

| Smart Classroom | Smart screen, Advanced projector | Capacity-based |

🚀 How to Run:
Prerequisites:
- Java Development Kit (JDK) 8 or higher
- Command line / Terminal access

Compilation:

`bash

javac *.java

Execution:

java Main

User Flow:

Main Menu:
1. Data Entry (Administrator) - Configure rooms
2. Book a Room (User) - Access booking system
3. Exit Program

Administrator Mode:
Enter college name
Add rooms with specifications
System validates and stores data

User Booking Mode:
View room reports
Check availability
Book rooms with student count
Cancel bookings
View detailed room information

Sample Demo:
The system includes pre-configured sample data for immediate testing without manual data entry.

💡 Sample Usage Example:

=== Classroom Management System ===

Choose: 2. Book a Room

--- Booking Menu ---

1. View Room Reports
   
   → Available: R1 (Smart, 30), L1 (Lab, 25)
   
   → Booked: R2 (Smart, 40)
   

4. Book a Room

   Enter room: R1
   
   Enter students: 25
   
   ✓ Room R1 successfully booked!

📝 Code Structure:

Smart-Campus-Management-System/

├── Classroom.java          # Abstract parent class (core foundation)

├── LectureRoom.java        # Lecture hall implementation

├── Lab.java                # Laboratory implementation

├── SmartClassroom.java     # Smart classroom implementation

├── BookingSystem.java      # Booking logic and room management

├── College.java            # Institution and room inventory

├── ReportGenerator.java    # Report generation module

└── Main.java               # User interface and program flow

🎓 Academic Context:

Course: Object-Oriented Programming (OOP)

Project Type: Final/Capstone Project

Academic Supervisor: Dr. Elaf Islam

Institution: Taif University | Saudi arabia

Semester: 5

🔑 Learning Outcomes Demonstrated:

✅ Class Hierarchy Design: Created a well-structured inheritance tree with abstract base class

✅ Polymorphic Behavior: Implemented method overriding for flexible room type handling

✅ Data Encapsulation: Protected class data with proper access modifiers

✅ Abstract Classes & Methods: Defined common contracts for all room types

✅ Collection Management: Used ArrayList for dynamic room storage

✅ Input Validation: Implemented comprehensive checking for capacity and availability

✅ Multi-User System Design: Created separate workflows for administrators and users

✅ Team Collaboration: Coordinated distributed development across multiple developers

📌 Development Notes:

Current Implementation:

The system uses Classroom as the abstract parent class with specialized room types (LectureRoom, Lab, SmartClassroom) inheriting from it.

The BookingSystem class manages operations on these room objects.

Planned Architecture Refinement:

Based on instructor doctor, the system architecture will be refactored to use BookingSystem as the parent class, with room management modules inheriting from it. 

This restructuring will:

Better align with advanced OOP design patterns

Provide a more modular booking-centric architecture

Enhance scalability for future feature additions

This refactoring demonstrates understanding of evolving design requirements and adaptability in software architecture.

📄 Full Documentation:

For comprehensive project documentation including:

Detailed UML diagrams

System screenshots

Vision 2030 alignment analysis

Complete source code snapshots

See: Project Report (PDF)

🌟 Project Highlights:

✅ Comprehensive OOP Implementation: All four pillars demonstrated

✅ Real-World Application: Solves actual campus management challenges

✅ Scalable Architecture: Easy to extend with new room types or features

✅ User-Friendly Interface: Intuitive console-based interaction

✅ Robust Validation: Multiple layers of input checking and error prevention

✅ Team Leadership: Successfully coordinated 8 developers to project completion

📞 Contact & Feedback:

For questions, suggestions, or collaboration opportunities, feel free to reach out via GitHub.

This project demonstrates practical application of Object-Oriented Programming principles in solving real-world campus management challenges. 

Developed with attention to code quality, system design, and user experience.

⭐ If you find this project helpful, please consider giving it a star!
