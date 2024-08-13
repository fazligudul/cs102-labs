import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.STRING;

import cs1.SimpleURLReader;
public class MySimpleURLReader extends SimpleURLReader {

    //properties
    private static String text;
    //"http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt"
    public MySimpleURLReader(String url) {
        super(url);
        this.text=url;
    }

    public String getURL(){
        return text;  
    }

    public  String getContentFromUrl() throws IOException{
        StringBuilder content = new StringBuilder();
        URL urlObj = new URL(text);
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlObj.openStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        reader.close();
        return content.toString();
         
    }
    public int getNumberOfCSSLinks() {
        int count = 0;

        for (int i = 0; i < getPageContents().length()-4; i++) {
            if(getPageContents().substring(i, i+4).equals(".css"))
                count++;
        }

        return count;
    }
    
    public  String getName(){
        String[] pieces = text.split("/");
        return pieces[pieces.length-1];
    }
    public void showOccurenceOfWords(){

    }
    public void searchWords(String url,ArrayList<String> words) {
        ArrayList<String> foundWords = new ArrayList<String>();
        HTMLFilteredReader reader= new HTMLFilteredReader(url);
        String filteredText = reader.getPageContents();
        
        
        for (int i = 0; i < words.size(); i++) {
            Scanner scan = new Scanner(filteredText);
            System.out.println(scan.nextLine());
        
            int lineC = 0;
            

            while(scan.hasNextLine()){

                lineC++;
                int row = 0;
                
                while(scan.hasNext()){

                    row++;
                    if(words.get(i).equalsIgnoreCase(scan.next())){
                            System.out.println(i);
                            for (int j = 0; j < words.size(); j++) {
                                System.out.println(words.get(j)+ " row: " + row);
                            }
                    }
                }
            }
        }
        

        //for (int i = 0; i < foundWords.size() ; i++) {
        //    System.out.println("word "+foundWords.get(i)+"is at index "+ i);
    

    }
}
