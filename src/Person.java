public class Person implements Comparable<Person> {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printName() {
        System.out.println(name + " " + surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    //compare by surname, then by name if surnames are equal
    @Override
    public int compareTo(Person other) {
        int surnameComparison = this.surname.compareTo(other.surname);
        if (surnameComparison != 0) {
            return surnameComparison;
        }
        return this.name.compareTo(other.name);
    }
}

