import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner  sc= new Scanner(System.in);
            while (true) {
                System.out.println("\n===== 🏫 Student Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Remove Student");
                System.out.println("4. Update Student");
                System.out.println("5. Exit");
                System.out.print("👉 Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // flush

                switch (choice) {
                    case 1 -> sm.addStudent();
                    case 2 -> sm.viewAllStudents();
                    case 3 -> {
                        System.out.print("Enter Roll Number or Name to delete: ");
                        String identifier = sc.nextLine();
                        sm.removeStudent(identifier);
                    }
                    case 4 -> {
                        System.out.print("Enter Roll Number of student to update: ");
                        int roll = sc.nextInt();
                        sm.updateStudent(roll);
                    }
                    case 5 -> {
                        System.out.println("👋 Exiting... Thank you!");
                        return;
                    }
                    default -> System.out.println("❌ Invalid choice. Try again.");
                }
        }
    }
}
