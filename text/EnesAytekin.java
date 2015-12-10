package text;

public class EnesAytekin implements Processor {
    public String process(String input) {
		
		String newString="";
		String newStringBigger="";
		for(int i=0; i<input.length(); i++)
       {
          newString = newString + input.substring(i,i+1)+'*';
	  newStringBigger = newString.UpperCase();
       }	
        return  newStringBigger+ "\nOldLength is : " + input.length()+"\nNewLength is :"+newStringBigger.length();
    }
    public String description(String source) {
        return source+" added '*' all words at the end and transformed bigger version of input.";
    }
    public String author() {
        return "EnesAytekin";
    }
}