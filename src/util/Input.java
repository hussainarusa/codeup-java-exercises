package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        int number;
        do {
            System.out.print("Please enter an integer between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < min || number > max);
        scanner.nextLine(); // Consume newline
        return number;
    }

    public int getInt() {
        System.out.print("Please enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return number;
    }

    public double getDouble(double min, double max) {
        double number;
        do {
            System.out.print("Please enter a decimal number between " + min + " and " + max + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number < min || number > max);
        scanner.nextLine(); // Consume newline
        return number;
    }

    public double getDouble() {
        System.out.print("Please enter a decimal number: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        double number = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        return number;
    }
}



//public class Input {
//    private Scanner scanner;
//
//    public Input() {
//        scanner = new Scanner(System.in);
//    }
//
//    public String getString() {
//        System.out.print("Enter a value: ");
//        return scanner.nextLine();
//    }
//
//    public int getInt() {
//        while (true) {
//            try {
//                String input = getString();
//                return Integer.valueOf(input);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter an integer.");
//            }
//        }
//    }
//
//    public double getDouble() {
//        while (true) {
//            try {
//                String input = getString();
//                return Double.valueOf(input);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a double.");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Input input = new Input();
//
//        int intValue = input.getInt();
//        System.out.println("You entered an integer: " + intValue);
//
//        double doubleValue = input.getDouble();
//        System.out.println("You entered a double: " + doubleValue);
//    }
//}

