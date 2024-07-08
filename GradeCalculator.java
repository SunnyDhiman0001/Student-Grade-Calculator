
// Task 2 Completed....

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int Subjects;
        int TotalMarks = 0;
        int Marks;
        double Avg;
        String Grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Subjects: ");
        Subjects = scanner.nextInt();

        if (Subjects<=0) {
            System.out.println("Invalid Number of Subjects, "+Subjects+" <= 0 Please Try Again");
            return;
        }
        for(int i=1; i<=Subjects; i++){
            System.out.println("Enter Marks in Subject " + i);
            Marks = scanner.nextInt();

            if (Marks < 0 || Marks > 100) {
                System.out.println("Invalid Marks, Please Enter Marks Between 1-100");
                return;
            }
            TotalMarks = TotalMarks + Marks;
        }

         Avg = TotalMarks / Subjects;
        
        if (Avg >= 90) {
            Grade = "A+";
        }
        else if (Avg >= 80) {
            Grade = "A";
        }
        else if (Avg >= 70) {
            Grade = "B+";
        }
        else if (Avg >= 60) {
            Grade = "B";
        }
        else if (Avg >= 50) {
            Grade = "C";
        }
        else {
            Grade = "D";
        }

        System.out.println("Total Marks: "+ 100*Subjects);
        System.out.println("Total Marks Gain :"+TotalMarks);
        System.out.println("Average Persentage: "+ Avg);
        System.out.println("Grade: "+Grade);
        scanner.close();
    }
}
