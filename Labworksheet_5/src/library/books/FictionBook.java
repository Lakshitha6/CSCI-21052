package library.books;

public class FictionBook {
     String title;
     String author;
     String genre;

    public FictionBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void displayInfo(){
        System.out.println("Fiction Book Details: \n");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}