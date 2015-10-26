package quote;

public class GokhanSarikaya implements Quotation {
    public int year() {
        return 1929;
    }
    public String text() {
        String p = "Imagination is more important than knowledge.\n";
        return p;
    }
    public String author() {
        return "Albert Einstein";
    }
    public String reference() {
        return "http://quoteinvestigator.com/2013/01/01/einstein-imagination/";
    }
}
