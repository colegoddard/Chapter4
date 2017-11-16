public class Library
{
    // instance variables - replace the example below with your own
    private Book[] books;
    private String name;
    
    public void addBook(int location, Book b) {
        books[location] = b;
    }

    public Library(int size, String nm)
    {
        // initialise instance variables
        this.books = new Book[size];
        this.name = nm;
    }

    public String toString() {
        String output = "The library " + name + " has the following: \n";
        for(Book b : books) {
            output += b + "\n";
        }
        return output;
    }
}
