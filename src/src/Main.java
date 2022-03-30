package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        classWork();

    }

    static void task1() {
        //Task 1

        //Pseudo code
        /*
        Read number1
        Read number2
        Read number3

        if  number 1 < number2
        smallest = number1
        else
        smallest = number2

        if number3 < smallest
        smallest = number3

        print smallest
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        int number1 = scanner.nextInt();

        System.out.println("Input the 2nd number: ");
        int number2 = scanner.nextInt();

        System.out.println("Input the 3rd number: ");
        int number3 = scanner.nextInt();

        int smallest;

        if (number1 < number2) {
            smallest = number1;
        } else {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }
        System.out.println("The smallest number is: " + smallest);
    }

    static void task2() {
        /*
        Task 2: Pseudo code (David)
        Read percentage;
        if percentage > 90
        grade = A
        else if percentage > 75
        Grade = B
        Else if percentage >65
        Grade = C
        else
        Grade = D
        Print grade
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the grade: ");
        int percentage = scanner.nextInt();

        char grade;
        if (percentage >=90) {
            grade = 'A';
        }
        else if (percentage>=75) {
            grade = 'B';
        }
        else if (percentage>=65){
            grade = 'C';
        }
        else {
            grade = 'D';
        }
        System.out.println(grade);
    }

    static void classWork() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the temperature in F: ");
        int temp = scanner.nextInt();


        if (temp >95 || temp < 20) {
            System.out.println("Visit our shops!");
        }

        String activity;
        if (temp >= 80) {
            activity = "swimming";
        }
        else if (temp >= 60) {
            activity = "tennis";
        }
        else if (temp >= 40) {
            activity = "golf";
        }
        else {
            activity = "skiing";
        }

        System.out.println("Your recommended activity for today is " + activity + ".");
    }
}

