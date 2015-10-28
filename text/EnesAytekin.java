package text;

public class EnesAytekin implements Processor {
	 public String process(String input) {
        return input.trim();
    }
    public String description(String source) {
        return source+" converted to no blank space in the text.";
    }
    public String author() {
        return "EnesAytekin";
    }
}
