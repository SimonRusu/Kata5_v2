package kata5_v2.view;

import java.util.ArrayList;
import kata5_v2model.Mail;
import kata5_v2model.Histogram;

/**
 *
 * @author Simon
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> built(ArrayList<String> emails)
    {
        Histogram<String> histogram = new Histogram<>();
        for(int i = 0 ; i<emails.size();i++)
        {
            Mail mail = new Mail(emails.get(i));
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
   }       
}
