package text;

import java.util.*;

public class Mucahid implements Processor {
    public String process(String input) {
        String[] a = input.toLowerCase().split("\\p{Space}|\\p{Punct}");//lower case and split
        TreeSet<String> h = new TreeSet<>();    
		for (String s : a) h.add(s+"\n");//sort them by adding to treeset
		h.pollFirst();
		String out="";
		int i=1;
		int maxlength=(h.size()+"").length();//longest index (number of digits)
		for (String s : h){
			String ind=padLeft(i+"",maxlength);//index of the word padded to left
			out+=ind+"-> "+s;
			i++;
		}
        return out;
    }
    public String description(String source) {
        return "set of lower case sorted distinct words in "+source;
    }
    public String author() {
        return "MUCAHID";
    }
	public static String padLeft(String s, int n) {
		return String.format("%1$" + n + "s", s);  
	}
}