package Person;

public class Person {
    private static int id;
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        Person.id++;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
