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
    private String refNumber;
    private int borrowed;
    private boolean isCourseText;

    /**
     * Set the author, title and page fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages,
    boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
        refNumber = "";
        borrowed = 0;
        isCourseText = true;
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
        if (refNumber == "") {
            System.out.println("Title: " + bookTitle + ", written by: " + 
        bookAuthor + " with " + pages + " pages. Reference number ZZZ."
        + " This book has been borrowed " + borrowed + " times.");
        }
        else {
            System.out.println("Title: " + bookTitle + ", written by: " +
            bookAuthor + " with " + pages + " pages. Reference number " +
        refNumber + ". This book has been borrowed " + borrowed + " times.");
    }
    }
    
    public void setRefNumber(String ref)
    {
        if (refNumber.length() < 3) {
            System.out.println("Entry too short. Please enter a reference" 
            + " number with more than two characters.");
    }
     else
     {
         refNumber = ref;
        }
    }
    
    public void getRefNumber (String refNumber)
    {
        System.out.println(refNumber);
    }
    
    public void borrow ()
    {
        borrowed++;
    }
    
    public void isCourseText()
    {
        System.out.println(isCourseText);
        }
    }

