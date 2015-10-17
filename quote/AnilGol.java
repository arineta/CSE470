package quote;

/**
 * Created by Eugene on 17.10.2015.
 */

public class AnilGol implements Quotation {
    public int year() {
        return 1936;
    }
    public String text() {
        String p = "Live as if you were to die tomorrow. Learn as if you were to live forever.";
        return p;
    }
    public String author() {
        return "Mahatma Gandhi";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/quotes/m/mahatmagan133995.html";
    }
}
