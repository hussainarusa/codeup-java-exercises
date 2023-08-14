import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] peopleArray = new Person[3];
        peopleArray[0] = new Person("Alice");
        peopleArray[1] = new Person("Bob");
        peopleArray[2] = new Person("Charlie");

        for (Person person : peopleArray) {
            System.out.println(person.getName());
        }

        Person newPerson = new Person("David");
        peopleArray = addPerson(peopleArray, newPerson);

        for (Person person : peopleArray) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
        newPeopleArray[newPeopleArray.length - 1] = newPerson;
        return newPeopleArray;
    }
}

