package text;

public class MusabBozkurt implements Processor {
    public String process(String input) {
        return input.toUpperCase() + input.getBytes();
		
    }
    public String description(String source) {
        return source+" converted to upper case";
    }
    public String author() {
        return "Musab Bozkurt";
    }
}
