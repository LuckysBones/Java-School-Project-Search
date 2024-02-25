package dataminer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static edu.frontrange.csc240.a10.text.Text.TEXT;

/**
 * The Find class grabs a class containing information that
 * will be received at a string and use that with a 
 * enumeration class to find information using the pattern class
 *
 * @author		Luc Gremillion, S02597411
 * @version		2022-4-17, CSC-240 Assignment 10
 */
public class Find {
 
/**
 * Pattern Class used to compile a pattern from a regex string
 */
private Pattern pattern;

/**
 * Matcher Class used to match by finding information based on the pattern class
 */
private Matcher matcher;

/**
 * Method controls the majority of the program, by utilizing 
 * other classes to provide the pattern and matcher class 
 */
public void findItems() {

    for(Information as : Information.values()) {

        int itemCount = 0;

        pattern = Pattern.compile(as.getRegexPattern());
        matcher = pattern.matcher(TEXT);

        if(as.getSearch().equals("websites")){
            while(matcher.find()){
                itemCount += 1;
                System.out.printf("(%d)  Found web page reference: %3s%n",itemCount, matcher.group());
            }
            System.out.println();
        }else{
            while(matcher.find()){
                itemCount += 1;
            }
        }
        System.out.printf("Counted: %2d %2s %n",itemCount, as.getSearch());
    }
}
}
