public class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to say hello
    public void sayHello() {
        System.out.println("Hello, my name is " + name + "!");
    }

    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("Arusa Hussain");

        // Test the methods
        System.out.println("Initial name: " + person.getName());
        person.sayHello();

        // Change the name and test again
        person.setName("Arusa Styles");
        System.out.println("Updated name: " + person.getName());
        person.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//
//
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}


