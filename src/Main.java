public class Main {
     public static void main(String[] args) {
        // Create an array of persons
        Person[] persons = {
                new Person("Niina", "Bennet"),
                new Person("Maria", "Santos"),
                new Person("Juan", "López"),
                new Person("Jim","Smith"),
                new Person("Maya","Bennet")
        };

        Sorter sorter = new Sorter();
        // Sort the persons array
        sorter.sort(persons);

        // Print the sorted persons
        System.out.println("Sorted persons :");
        for (Person person : persons) {
            person.printName();
        }

        // Create an array of rectangles
        Rectangle[] rectangles = {
                new Rectangle(3, 4),
                new Rectangle(2, 5),
                new Rectangle(1, 2),
                new Rectangle(6, 3),
                new Rectangle(4, 4)
        };

         sorter.sort(rectangles);

        // Print the rectangles sorted by area
        System.out.println("\nSorted rectangles by area:");
            for (Rectangle rect : rectangles) {
            System.out.println("Area: " + rect.calculateArea());
        }
    }
}
