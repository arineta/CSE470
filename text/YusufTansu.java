package text;

public class YusufTansu implements Processor {
    public String process(String input) {
		
StringBuilder builder=new StringBuilder();
		builder.append(input);
			input=builder.reverse().toString();
	return input;
    }
    public String description(String source) {
        return source+" it shows the reverse of the string";
    }
    public String author() {
        return "YusufTansu";
    }
}
