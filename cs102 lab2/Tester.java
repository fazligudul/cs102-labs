import java.io.IOException;
import java.util.ArrayList;

import cs1.SimpleURLReader;

public class Tester {
    public static void main(String[] args) throws IOException {
        //Part A
        String text = "http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt";
        SimpleURLReader obj = new SimpleURLReader(text);
        System.out.println(obj.getPageContents());
        System.out.println("Number of lines in text is "+obj.getLineCount());
        System.out.println();

        //PART B
        MySimpleURLReader urlReader=new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        int numOfCSSLinks = urlReader.getNumberOfCSSLinks();
        System.out.println("the url is  "+ urlReader.getURL());

        //PART C    
        System.out.println("Number of CSS links :"+ numOfCSSLinks);

        //PART D
        HTMLFilteredReader htmlFilteredReader = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html ");
        System.out.println(htmlFilteredReader.getPageContents());

        //PART E
        ArrayList<String>words=new ArrayList<String>();
        words.add("Turkey");
        urlReader.searchWords("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html",words);
    }
}
