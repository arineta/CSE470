package text;

public class Arineta implements Processor {
    public String process(String input) {
        return input.toLowerCase();
    }
    public String description(String source) {
        return source+" converted to UPPERCASE case";
    }
    public String author() {
        return "ARINETA";
    }
}