


// Amazon Kindle

class book
{
    private String bookID;
    private String bookTitle;
    private int lastPage;

    book()
    {
        bookID = bookTitle = "";
        lastPage = 0;
    }

    book(String bookID, String bookTitle)
    {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
    }

    public void setLastPage(int lastPage)
    {
        this.lastPage = lastPage;
    }

    public int getLastPage()
    {
        return (this.lastPage);
    }

    public void setBookID(String bookID)
    {
        this.bookID = bookID;
    }

    public String getBookID()
    {
        return (this.bookID);
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle()
    {
        return (this.bookTitle);
    }
}

class liabrary 
{

}


public class Kindle 
{
    
}
