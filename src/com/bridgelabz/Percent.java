package com.bridgelabz;

import java.util.Scanner;

/*Grade A -80% ,Grade B -60% , Grade C -50% So on
Compute Total , overall Percentage and grade of a Students Physics ,Chemistry &Maths Marks
Grade A -80% ,Grade B -60% , Grade C -50% So on

 */
public class Percent {
    Scanner sc = new Scanner(System.in);
    void calculatePercentage(){
        int totalMarks = 300;
        String grade = null;
        System.out.print("Enter the marks for math: ");
        double mathMark = sc.nextInt();
        System.out.print("Enter the marks for physics: ");
        double physicsMark = sc.nextInt();
        System.out.print("Enter the marks for chemistry: ");
        double chemistryMark = sc.nextInt();

        double totalMarkByStudent = mathMark + physicsMark + chemistryMark;
        System.out.println("Total mark obtained by student in Physics, Chemistry and Math is: " + totalMarkByStudent);

        double percentage = (totalMarkByStudent / totalMarks)*100;
        System.out.println("Percentage: " + percentage);


        if (percentage>=80){
            grade = "A";
        } else if ((percentage>=60) && (percentage<80)) {
            grade = "B";
        } else if ((percentage>=50) && (percentage<60)) {
            grade = "C";
        }else if ((percentage>=40) && (percentage<50)){
            grade = "D";
        }else {
            grade = "E";
        }
        System.out.println("Grade = " + grade);
    }


}
