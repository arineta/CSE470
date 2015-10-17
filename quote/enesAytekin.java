package quote;

public class enesAytekin implements Quotation {
    public int year() {
        return 1637;
    }
    public String text() {
        String p = "I think, therefore I am.\n";
        String s = "-In original text: Cogito ergo sum.-";
        return p+s;
    }
    public String author() {
        return "Rene Descartes";
    }
    public String reference() {
        return "https://en.wikipedia.org/wiki/Cogito_ergo_sum#cite_note-formatting-4";
    }
}
