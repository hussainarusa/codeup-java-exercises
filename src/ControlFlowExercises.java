import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        While

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        Do While
//    int count = 0;
//      do {
//          System.out.println(count);
//          count += 2;
//      }while (count <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.
//    int count = 100;
//      do {
//          System.out.println(count);
//          count -= 5;
//      }while (count >= -10);

//        Create a do-while loop that starts at 2, and displays the number
//        squared on each line while the number is less than 1,000,000. Output should equal:
//            long count = 2;
//      do {
//          System.out.println(count);
//          count *= count;
//      } while (count <= 1000000);

////        Refactor the previous two exercises to use a for loop instead.
//        for (int count = 100; count >= -10; count -= 5) {
//            System.out.println(count);
//        }
//
//        for (int count = 2; count < 1000000; count *= count) {
//            System.out.println(count);
//        }

//        for (long number = 2; number < 1000000; number = number * number) {
//            System.out.println(number);
//        }

//        Fizzbuzz

//        Write a program that prints the numbers from 1 to 100.

//            int i = 1;
//            while (i <= 100){
//                System.out.println(i);
//                i++;
//            }

//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        int i = 1;
//        while (i <= 100) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("Fizz-Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        }

//        Display a table of powers.

        System.out.printf("enter an integer");
        int userInt = scanner.nextInt();
//        Display a table of squares and cubes from 1 to the value entered.
        // loop through value entered
        // display each number squared
        // display each number cubed
        System.out.println("Number\tSquare\tCube");
        System.out.println("------\t------\t----");

        for (int i = 1; i <= userInt; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("   %d\t   %d\t   %d%n", i, square, cube);
        }




//        Convert given number grades into letter grades.

//        System.out.println("Enter your Numerical Grade");
//
//        int numericalGrade = scanner.nextInt();
//
//        char letterGrade= 0;
//
//        if ( numericalGrade >= 88 && numericalGrade <= 100){
//            letterGrade = 'A';
//        } else if (numericalGrade >= 80 && numericalGrade <= 87) {
//            letterGrade = 'B';
//        }else if (numericalGrade >= 67 && numericalGrade <= 79) {
//            letterGrade = 'C';
//        }else if (numericalGrade >= 60 && numericalGrade <= 66) {
//            letterGrade = 'D';
//        }else if (numericalGrade >= 0 && numericalGrade <= 59) {
//            letterGrade = 'F';
//        }
//
//        System.out.println("Your grade is an " + letterGrade+ "!");
//
    }
}

