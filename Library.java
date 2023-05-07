




public class Library 
{
    private String currentBookTitle;
    private String currentBookID;
    private String bookAuthor;
    
    // Default constructor.
    Library()
    {
        currentBookTitle = "The Complete Sherlock Holmes";
        bookAuthor = "Arthur Conan Doyle"; 
        currentBookID = "Res-2020-367";
    }

    // Method just for showing default values set by constructor.
    public void showCurrentBookInfo()
    {
        System.out.println("Book Title : " + this.currentBookTitle);
        System.out.println("Book Author : " + this.bookAuthor);
        System.out.println("Book ID : " + this.currentBookID);
    }

    public static void main(String[] args) 
    {
        var l1 = new Library();    
        l1.showCurrentBookInfo();
    }
}
