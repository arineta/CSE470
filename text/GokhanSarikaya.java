package text;

import java.util.*;

public class GokhanSarikaya implements Processor {
    public String process(String input) {
       String[] a = input.split("\\p{Space}|\\p{Punct}");
		String j="";
		List<String> arrlist = new ArrayList<>();
		for (String f : a) {
			if (!f.equals(j)) {arrlist.add(f);}
		}
		String w="Number of total word: "+arrlist.size()+"\n";
		 	
		Set<String> h = new HashSet<>();
	    for (String f : a) {
	    	if(!f.equals(j)) h.add(f);}
	    String e="Number of difderent word: "+h.size()+"\n";    
	    return w+e;
    }
    public String description(String source) {
        return "Shows word statistics";
    }
    public String author() {
        return "GokhanSarikaya";
    }
}
