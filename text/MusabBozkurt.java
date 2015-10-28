package text;

public class MusabBozkurt implements Processor {
    public String process(String input) {
		//convert to uppercase and getting the hashcode of the string 
        return input.toUpperCase() + "\nHash code is : "  +input.hashCode();
		
    }
    public String description(String source) {
        return source+" converted to upper case and get hash code of the string ";
    }
    public String author() {
        return "Musab Bozkurt";
    }
}
