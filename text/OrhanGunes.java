package text;

public class OrhanGunes implements Processor {
    public String process(String input) {
        return input.toUpperCase() + "\nLength is : " + input.length();
    }
    public String description(String source) {
        return source+" converted to upper case and get length of text";
    }
    public String author() {
        return "Orhan Gunes ";
    }
}