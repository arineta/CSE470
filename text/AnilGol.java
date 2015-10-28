package text;

import java.util.*;

/**
 * Created by Eugene on 28.10.2015.
 */
public class AnilGol implements Processor {

    public String process(String input) {
//        this is the string we are searching for in our text
        String i = "AnilGol";
//        we split by new line escape character for UNIX and Windows
        String lines[] = input.split("\\r?\\n");
        List<String> lineList = Arrays.asList(lines);
        Boolean ifContains = lineList.contains(i);
        int lineNumber = lineList.indexOf(i) + 1;
        int lineCount = lineList.size();
        String returnValue = "";
        if(ifContains)
            returnValue += "Given text contains \"" + i + "\" line.\n"
                + "This line first occurs on " + lineNumber + ". line number.\n";
        else
            returnValue += "Given text doesn't contain " + i + ".\n";
        returnValue +=  "There are " + lineCount + " lines in the text.";
        return returnValue;
    }

    public String description(String source) {
        return "Checks if the text contains a line which is defined in the program, returns it's line number and how many lines are there in the text.";
    }

    public String author() {
        return "Anil Gol";
    }
}
