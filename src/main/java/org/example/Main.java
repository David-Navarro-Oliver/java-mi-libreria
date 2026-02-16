package org.example;

public class Main {

    static void main(String[] args) {

        Book book1 = new Book(
                "Clean Code",
                "A handbook of agile software craftsmanship",
                "9780132350884",
                "Robert C. Martin",
                35.99
        );

        Book book2 = new Book(
                "Effective Java",
                "Best practices for the Java platform",
                "9780134685991",
                "Joshua Bloch",
                42.50
        );

        Book book3 = new Book(
                "Design Patterns",
                "Elements of reusable object-oriented software",
                "9780201633610",
                "Erich Gamma",
                50.00
        );

        Book book4 = new Book(
                "Refactoring",
                "Improving the design of existing code",
                "9780201485677",
                "Martin Fowler",
                47.75
        );

        Book book5 = new Book(
                "The Pragmatic Programmer",
                "Your journey to mastery",
                "9780201616224",
                "Andrew Hunt",
                39.90
        );

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
    }
}
