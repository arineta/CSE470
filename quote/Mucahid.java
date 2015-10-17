package quote;

public class Mucahid implements Quotation {
    public int year() {
        return 1947;
    }
    public String text() {
        String p = "You don't have to burn books to destroy a culture. \n";
        String s = "Just get people to stop reading them.  ";
        return p+s;
    }
    public String author() {
        return "Ray Bradbury";
    }
    public String reference() {
        return "http://www.goodreads.com/quotes/4959-you-don-t-have-to-burn-books-to-destroy-a-culture";
    }
}