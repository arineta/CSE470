package text;

public class MusabBozkurt implements Processor {
    public String process(String input) {
        return input.toUpperCase() + "\nHash code is : "  +input.hashCode();
		
    }
    public String description(String source) {
        return source+" converted to upper case and get hash code of the string ";
    }
    public String author() {
        return "Musab Bozkurt";
    }
}
