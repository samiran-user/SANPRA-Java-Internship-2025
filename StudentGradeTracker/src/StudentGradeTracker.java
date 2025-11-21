import java.util.*;

public class StudentGradeTracker {

    private static final HashMap<String, Double> studentGrades = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("=== -:Student Grade Tracker:- ===");
            System.out.println("1. Add Student Name and Grade ?");
            System.out.println("2. Display All Students ?");
            System.out.println("3. Calculate Class Average ?");
            System.out.println("4. Show Highest and Lowest Scores ?");
            System.out.println("5. Exit ?");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 ->
                            addStudent();
                    case 2 ->
                            displayAllStudents();
                    case 3 ->
                            calculateAverage();
                    case 4 ->
                            showHighLow();
                    case 5 ->
                            System.out.println("Exiting program...");
                    default ->
                            System.out.println("Invalid choice ! Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
                choice = 0; // Reset choice
            }

        } while (choice != 5);
    }

    // Add student and grade
    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();//.trim();

        if (name == null || name.trim().isEmpty() || !name.matches("[a-zA-Z ]+")) {
            System.out.println("Error: Student name cannot be empty & must name only letters.");
            return;
        }

        try {
            System.out.print("Enter grade (0 - 100): ");
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }

            studentGrades.put(name, grade);
            System.out.println("Student added successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Grade must be a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Display all student grades
    private static void displayAllStudents() {
        if (studentGrades.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n--- Student Records ---");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " | Grade: " + entry.getValue());
        }
    }

    // Calculate class average
    private static void calculateAverage() {
        if (studentGrades.isEmpty()) {
            System.out.println("No grades available to calculate average.");
            return;
        }

        double total = 0;
        for (double grade : studentGrades.values()) {
            total += grade;
        }

        double average = total / studentGrades.size();
        System.out.printf("Class Average: %.2f%n", average);
    }

    // Show highest and lowest scores
    private static void showHighLow() {
        if (studentGrades.isEmpty()) {
            System.out.println("No grades available.");
            return;
        }

        double highest = Collections.max(studentGrades.values());
        double lowest = Collections.min(studentGrades.values());

        // Find names associated with those scores
        List<String> topStudents = new ArrayList<>();
        List<String> lowStudents = new ArrayList<>();

        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() == highest) {
                topStudents.add(entry.getKey());
            }
            if (entry.getValue() == lowest) {
                lowStudents.add(entry.getKey());
            }
        }

        System.out.println("Highest Score: " + highest + " - " + topStudents);
        System.out.println("Lowest Score: " + lowest + " - " + lowStudents);
    }
}