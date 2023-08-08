// TODO: Create a new class called MethodPractice and add main method to test these methods...
// TODO: Write a method, returnName, that returns the string of your name.
// TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
// TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
// TODO: !! Complete math exercises from the curriculum !!


public class MethodPractice {

    public static String returnName() {
        return "Arusa Hussain";
    }

    public static String returnLongerString(String str1, String str2) {
        return str1.length() >= str2.length() ? str1 : str2;
    }

    public static boolean canBeHalved(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        // Test returnName method
        String myName = returnName();
        System.out.println("My name is: " + myName);

        // Test returnLongerString method
        String string1 = "Hello";
        String string2 = "World";
        String longerString = returnLongerString(string1, string2);
        System.out.println("Longer string: " + longerString);

        // Test canBeHalved method
        int num = 10;
        boolean isHalvable = canBeHalved(num);
        System.out.println("Is " + num + " evenly divisible by two? " + isHalvable);
    }
}



