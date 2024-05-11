import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for grade thresholds
        final double A_GRADE_THRESHOLD = 90.0;
        final double B_GRADE_THRESHOLD = 80.0;
        final double C_GRADE_THRESHOLD = 70.0;
        final double D_GRADE_THRESHOLD = 60.0;

        // Input marks for each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3;

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / 3;

        // Assign grades
        char grade;
        if (averagePercentage >= A_GRADE_THRESHOLD) {
            grade = 'A';
        } else if (averagePercentage >= B_GRADE_THRESHOLD) {
            grade = 'B';
        } else if (averagePercentage >= C_GRADE_THRESHOLD) {
            grade = 'C';
        } else if (averagePercentage >= D_GRADE_THRESHOLD) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
