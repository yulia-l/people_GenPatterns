import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
    }

    public boolean hasAge() {
        return age >= 0;
    }


    public boolean hasAddress() {
        return address != null;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "по имени " + name
                + ", с фамилией " + surname
                + ", возрастом =>" + age
                + "<=, который проживает в городе " + address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}