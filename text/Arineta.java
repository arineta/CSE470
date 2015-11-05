package text;

public class Arineta implements Ari_processor {
    public String process(String input) {
        return input.toLowerCase();
    }
    public String description(String source) {
        return source+" converted to lower case";
    }
    public String author() {
        return "arineta";
    }
}