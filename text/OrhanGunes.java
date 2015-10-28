package text;

public class OrhanGunes implements Processor {
    public String process(String input) {
        return input.toUpperCase();
    }
    public String description(String source) {
        return source+" converted to lower case";
    }
    public String author() {
        return "Orhan Gunes";
    }
}