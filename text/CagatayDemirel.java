package text;

public class CagatayDemirel implements Processor {
    public String process(String input) {
		
		String newString="";
		for(int i=0; i<input.length(); i++)
       {
          newString = newString + input.substring(i,i+1)+'-';
       }
		
        return  newString+ "\nOldLength is : " + input.length()+"\nNewLength is :"+newString.length();
    }
    public String description(String source) {
        return source+" added '-' to each letter for determining each one and new&old lengths of strings";
    }
    public String author() {
        return "Çağatay Demirel";
    }
}