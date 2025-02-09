/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author, title and page fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
    }

    public String getTitle (String bookTitle)
    {
        return title;
    }
    
    public String getAuthor (String bookAuthor)
    {
        return author;
    }
    
    public void printTitle (String bookTitle)
    {
        System.out.println(bookTitle);
    }
    
    public void printAuthor (String bookAuthor)
    {
        System.out.println(bookAuthor);
    }
    
    public void printDetails (String bookAuthor, String bookTitle, int pages)
    {
        System.out.println("Title: " + bookTitle + ", written by: " + 
        bookAuthor + " with " + pages + "pages");
    }
    
}
