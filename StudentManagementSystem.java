import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String gender;
    String semester;
    String department;
    String batch;
    int lastStudyYear;
    String email;
    String contactNumber;
    String address;

    Student(int id, String name, String gender, String semester, String department,
            String batch, int lastStudyYear, String email, String contactNumber, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.semester = semester;
        this.department = department;
        this.batch = batch;
        this.lastStudyYear = lastStudyYear;
        this.email = email;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("\n==============================");
        System.out.println("ID                     : " + id);
        System.out.println("Name                   : " + name);
        System.out.println("Gender                 : " + gender);
        System.out.println("Semester               : " + semester);
        System.out.println("Department             : " + department);
        System.out.println("Batch                  : " + batch);
        System.out.println("Last Study Passing Year: " + lastStudyYear);
        System.out.println("Email                  : " + email);
        System.out.println("Contact Number         : " + contactNumber);
        System.out.println("Address                : " + address);
        System.out.println("==============================");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();

                    System.out.print("Enter Semester: ");
                    String semester = scanner.nextLine();

                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();

                    System.out.print("Enter Batch: ");
                    String batch = scanner.nextLine();

                    System.out.print("Enter Last Study Passing Year: ");
                    int lastStudyYear = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Contact Number: ");
                    String contactNumber = scanner.nextLine();

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    studentList.add(new Student(id, name, gender, semester, department,
                            batch, lastStudyYear, email, contactNumber, address));

                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n         Student List:");
                    if (studentList.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : studentList) {
                            s.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.name.equalsIgnoreCase(searchName)) {
                            s.displayInfo();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("❌ Student not found.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("          Exiting... Thank you!");
                    break;

                default:
                    System.out.println("    Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
