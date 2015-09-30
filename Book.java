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
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,int bookPages,boolean courseUsed)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = courseUsed;
    }
    //Author getter
    public String getAuthor()
    {
        return author;
    }
    //Title  getter
    public String getTitle()
    {
         return title;
    }

    public int getPages()
    {
        return pages;
    }

    //print Author
    public void printAuthor()
    {
        System.out.println("Author : "+author);
    }
    //print Title
    public void printTitle()
    {
        System.out.println("Title : "+title);
    }
    public void setRefNumber(String ref)
    {
        if(ref.length()<3)
        {
            System.out.println("Invalid Entry Error"
                    +"\nReference Number too short"
                    +"\nReference Number Must be more than 3 Characters");
        }
        else{
            ref = refNumber;
        }
    }
    public String getRefNumber()
    {
        return refNumber;
    }
    public void borrowed()
    {
        borrowed ++;
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    public boolean isCourseText(){
        return courseText;
    }

    /**the book objects are immutable because strings
     *cannot be mutated.  A string is not like an
     * int boolean double long float char or byte
     * which are mutable values.
     * A string is not a value therfore it cannot be
     * mutated.
     */
    public void printDetails()
    {
        System.out.println("Title : " + title + ", ");
        System.out.print("Author :"+ author+", ");
        System.out.print("Pages : "+pages);
        if(refNumber.length()<1) {
            System.out.print("\nReference Number : " + "ZZZ");
        }
        else{
            System.out.print("\nReference Number : "+refNumber);
        }
        System.out.println("Number of Times Borrowed : " + borrowed);
        System.out.println("Used as Course Text: "+ courseText);
    }
    // Add the methods here ...
}
