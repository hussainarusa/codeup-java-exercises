import java.util.Scanner;

public class MethodsExercises {

    public static int modulus(int a, int b){
        if ( b != 0){
            return a % b;
        } else {
            throw new IllegalArgumentException("Modulus by zero is not allowed.");
        }
    }
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    } // an error happens when you divide by 0 so this is error handling


// 2.
    public static int loopMultiplication(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        int result = 0;
        boolean isNegative = (a < 0) ^ (b < 0); // Check if the result will be negative

        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return isNegative ? -result : result;
    }


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        do {
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a valid number: ");
                scanner.next();
            }
            userInput = scanner.nextInt();

            if (userInput < min || userInput > max) {
                System.out.println("Number out of range. Please try again.");
            }
        } while (userInput < min || userInput > max);

        return userInput;
    }
// 3.

//    public static long calculateFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            long factorial = 1;
//            for (int i = 2; i <= n; i++) {
//                factorial *= i;
//            }
//            return factorial;
//        }
//    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 10;
        int num2 = 5;

        int minRange = 1;
        int maxRange = 10;

        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));
        System.out.println("Modulus: " + modulus(num1, num2));
        System.out.println("No * multiplication: " + loopMultiplication(num1, num2));

        System.out.print("Enter a number between " + minRange + " and " + maxRange + ": ");


        int userInput = getInteger(minRange, maxRange);

//        int userInput = 0;
//        System.out.println("You entered: " + userInput);
//        do {
//            System.out.print("Enter an integer between 1 and 10: ");
//            userInput = scanner.nextInt();
//
//            if (userInput >= 1 && userInput <= 10) {
//                long factorial = calculateFactorial(userInput);
//                System.out.println("Factorial of " + userInput + " is: " + factorial);
//            } else {
//                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
//            }
//
//            System.out.print("Do you want to continue? (y/n): ");
//            char choice = scanner.next().charAt(0);
//
//            if (choice != 'y' && choice != 'Y') {
//                break;
//            }
//        } while (true);
//
//        System.out.println("Thank you for using the factorial calculator!");
    }
}



