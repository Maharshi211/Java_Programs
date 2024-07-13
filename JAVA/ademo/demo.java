package ademo;

class Person {
    private String name;  // Private field
    private int age;      // Private field

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {  // Public method to access private field
        return name;
    }
    
    public int getAge() {  // Public method to access private field
        return age;
    }

//    public void getAge(int newAge) {  // Public method to modify private field
//        if (newAge >= 0) {
//            this.age = newAge;
//        } else {
//            System.out.println("Invalid age.");
//        }
//    }
}

public class demo {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Accessing private fields using public methods:
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting direct access (error):
        // System.out.println(person.name);  // Compile-time error
        // person.age = 25;  // Compile-time error
    }
}
