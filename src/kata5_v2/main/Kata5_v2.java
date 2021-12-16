package kata5_v2.main;

import kata5_v2.model.Histogram;
import kata5_v2.view.HistogramDisplay;
import kata5_v2.view.MailHistogramBuilder;
import kata5_v2.view.MailListReaderBD;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */

public class Kata5_v2 {
    private static ArrayList<String> emails;
    private static Histogram<String> histogram;
  
    public static void main(String[] args) {
        input();
        process();
        output();
    }
    
     public static void input(){
        String fileName  = ".src\\kata5_v2\\view\\email.txt";
        MailListReaderBD x = new MailListReaderBD();
        emails = x.read(fileName);
    }
    public static void process(){
        histogram = MailHistogramBuilder.built(emails);
    }
    public static void output(){
        HistogramDisplay HistogramDisplay = new HistogramDisplay(histogram);
        HistogramDisplay.execute();
    }
}
    

