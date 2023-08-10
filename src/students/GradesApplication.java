package students;

import java.util.*;

public class GradesApplication {

    public static void outputStudentInfo(String userInput, HashMap<String, Student> students){
        if (students.containsKey(userInput)){
            Student student = students.get(userInput);
            System.out.printf("Name: %s, Github Username: %s%nCurrent Average: %.1f%n", student.getName(), userInput, student.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the Github username of \"%s\"%n", userInput);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student joe = new Student("Joe");
        joe.addGrades(new ArrayList<>(List.of(75, 85, 95)));
        Student olivia = new Student("Olivia");
        olivia.addGrades(new ArrayList<>(List.of(100, 78, 84)));
        Student mateo = new Student("Mateo");
        mateo.addGrades(new ArrayList<>(List.of(94, 68, 90)));
        Student emma = new Student("Emma");
        emma.addGrades(new ArrayList<>(List.of(79, 84, 89)));

        students.put("JoeLEAN", joe);
        students.put("Oddilivia", olivia);
        students.put("MattyO", mateo);
        students.put("EmmaNAur", emma);

        Set<String> gitHubUserNames = students.keySet();
        for (String gitHubUserName : gitHubUserNames){
            System.out.printf("|%s| ", gitHubUserName);
        }
        System.out.println("");
        System.out.println("What student would you like to see more information on?");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        outputStudentInfo(userInput, students);
        while (true){
            System.out.println("Would you like to see another student? (yes/no)");
            System.out.println("");
            String userChoice = sc.nextLine().toLowerCase();
            if (userChoice.equals("no") || userChoice.equals("n")){
                System.out.println("Goodbye, and have a wonderful day!");
                System.out.println("");
                break;
            } else {
                System.out.println("What student would you like to see  more information on?");
                System.out.println("");
                userInput = sc.nextLine();
                outputStudentInfo(userInput, students);
            }
        }
    }
}

