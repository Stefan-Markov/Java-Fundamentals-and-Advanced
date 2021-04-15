package ComparableBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Book[] books = {bookOne,bookTwo,bookThree};

        Library library = new Library(books);
        for (Book book: library) {
            System.out.println(book.getAuthors());
        }
    }
}
