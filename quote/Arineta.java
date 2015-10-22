package quote;

public class Arineta implements Quotation {
    public int year() {
        return 1955;
    }
    public String text() {
        String p = "Nothing will work unless you do.\n";
 	String s = "Nothing can dim the light which shines from within.";
        return p+s;
       
    }
    public String author() {
        return "Maya Angelou";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/quotes/m/mayaangelo120197.html";
    }
}
