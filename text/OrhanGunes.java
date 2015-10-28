package text;

public class OrhanGunes implements Processor {
    public String process(String input) {
        return input.toUpperCase();
    }
    public String description(String source) {
        return source+" converted to upper case";
    }
    public String author() {
        return "Orhan Gunes";
    }
}