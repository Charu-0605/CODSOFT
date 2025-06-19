package org.example;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input subjects

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        // Input marks
        int totalMarks = 0;
        int marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        // Average percentage
        double avgPercentage = (double) totalMarks / n; // Cast to double for accurate division

        // Grade calculation
        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F'; // Added grade for below 60
        }

        // Display result
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercentage);
        System.out.println("Grade: " + grade);

        // Close the scanner
        sc.close();
    }
}
