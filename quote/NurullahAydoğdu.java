package quote;


public class NurullahAydogdu implements Quotation {

    public int year() {

        return 1860;
    }
  
  public String text() {

        String p = " What we think, or what we know, or what we believe is, in the end, of little consequence.\n";

        String s = " The only consequence is what we do.";

        return p+s;
    }

    public String author() {

        return "Jhon Ruskin";
    }

    public String reference() {

        return "https://litemind.com/best-famous-quotes/";
    }

}
