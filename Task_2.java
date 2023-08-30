import java.util.Scanner;
//Task_2 student's result calculator for CodSoft
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student's result calculator!");
        System.out.println("-------------------------------");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
    // For loop to enter marks in each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        String grade = calculateGrade(averagePercentage);
    // final result
        System.out.println("\nResults");
        System.out.println("-------");
        System.out.println("Total Marks Obtained: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
     // function for calculate the grades in result.
    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 65) {
            return "B";
        } else if (averagePercentage >= 50) {
            return "C";
        } else if (averagePercentage >= 33) {
            return "D";
        } else {
            return "F";
        }
    }
}
