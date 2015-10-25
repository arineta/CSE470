package quote;

public class MusabBozkurt implements Quotation {
    public int year() {
        return 1992;
    }
    public String text() {
        String p = "You learn more from failure than from success;\n";
        String s = "do not let it stop you.Failure builds character.";
        return p+s;
    }
    public String author() {
        return "UNKNOWN";
    }
    public String reference() {
        return "http://boardofwisdom.com/togo/Quotes/ShowQuote?msgid=551059";
    }
}
