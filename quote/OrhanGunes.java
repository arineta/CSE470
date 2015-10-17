package quote;

public class OrhanGunes implements Quotation {
    public int year() {
        return 1936;
    }
    public String text() {
        String p = "AðIarým, aðIatamam, hissederim, söyIeyemem.\n";
        String s = "DiIi yok kaIbimin ondan ne kadar bizarým.";
        return p+s;
    }
    public String author() {
        return "Mehmet Akif Ersoy";
    }
    public String reference() {
        return "http://www.neguzelsozler.com/unlu-sozleri/mehmet-akif-ersoy-sozleri.html";
    }
}