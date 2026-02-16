package org.example;

class Main {

    static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Argumentos recibidos: " + args.length);
        }

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

        printBook(book1);
        printBook(book2);
        printBook(book3);
        printBook(book4);
        printBook(book5);

        System.out.println("---- MODIFYING BOOK1 ----");

        book1.setTitle("Clean Code 2");
        book1.setDescription("Second edition updated");
        book1.setIsbn("1111111111111");
        book1.setWriter("Robert Martin Updated");
        book1.setPrice(40.00);

        printBook(book1);
    }

    private static void printBook(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Description: " + book.getDescription());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Writer: " + book.getWriter());
        System.out.println("Price: " + book.getPrice());
        System.out.println("--------------------------");
    }
}
