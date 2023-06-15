package corejava2;
import java.util.Scanner;
public class studentReportcard {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter student branch : ");
            String studentBranch = scanner.nextLine();

            System.out.print("Enter student semester: ");
            int semester = scanner.nextInt();

            // Taking input for subjects
            String[] subjects = {"Java", "Python", "C", "C++", "Ruby"};
            int[] marks = new int[subjects.length];

            System.out.println("Enter marks for each subject (out of 100):");
            for (int i = 0; i < subjects.length; i++) {
                System.out.print(subjects[i] + ": ");
                marks[i] = scanner.nextInt();
            }

            // Calculating total marks
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }

            // Calculating average marks
            double averageMarks = (double) totalMarks / subjects.length;

            // Calculating grade
            String grade;
            if (averageMarks >= 90) {
                grade = "A++";
            } else if (averageMarks >= 80) {
                grade = "A+";
            } else if (averageMarks >= 70) {
                grade = "B++";
            } else if (averageMarks >= 60) {
                grade = "B+";
            } else if (averageMarks >= 50) {
                grade = "C";
            } else {
                grade = "E";
            }
            System.out.println("\n---------------------------------------------------");
            System.out.println(" \n CIT                                   Report Card");
            System.out.println("------------------------------------------------------");
            System.out.print("Name: " + name);
            System.out.print("       ID: " + id);
            System.out.print("       Branch: " + studentBranch);
            System.out.println("       Semester: " + semester);
            System.out.println("------------------------------------------------------");
            System.out.println("Subject-wise Marks:");
            for (int i = 0; i < subjects.length; i++) {
                System.out.println(subjects[i] + ": " + marks[i]);
            }
            System.out.println("------------------------------------------------------");
            System.out.print("Total Marks: " + totalMarks);
            System.out.print("      Average Marks: " + averageMarks);
            System.out.println("      Grade: " + grade);
            System.out.println("------------------------------------------------------");
        }
    }


