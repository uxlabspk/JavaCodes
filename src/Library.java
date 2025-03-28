package src;


public class Library {
    private final String currentBookTitle;
    private final String currentBookID;
    private final String bookAuthor;

    // Default src.constructor.
    Library() {
        currentBookTitle = "The Complete Sherlock Holmes";
        bookAuthor = "Arthur Conan Doyle";
        currentBookID = "Res-2020-367";
    }

    // Method just for showing default values set by src.constructor.
    public void showCurrentBookInfo() {
        System.out.println("Book Title : " + this.currentBookTitle);
        System.out.println("Book Author : " + this.bookAuthor);
        System.out.println("Book ID : " + this.currentBookID);
    }

    public static void main(String[] args) {
        var l1 = new Library();
        l1.showCurrentBookInfo();
    }
}
