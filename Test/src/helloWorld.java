import Person.Person;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Person person1 =  new Person("Juan", "Gimenez");
        System.out.println("person1 = " + person1);
        Person person2 =  new Person("Maria", "Sanchez");
        System.out.println("person2 = " + person2);
    }
}
