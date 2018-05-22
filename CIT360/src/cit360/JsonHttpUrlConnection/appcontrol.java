/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.JsonHttpUrlConnection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 *
 * @author reddo
 */
public class appcontrol {
    
    public static String getDate( String net ) throws Exception {
        SimpleDateFormat inputFormat = new SimpleDateFormat("MMMM d, yyyy HH:mm:ss z", Locale.ENGLISH);
        Date inputDate = inputFormat.parse(net);
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM d, yyyy h:m:s a z");
        String outputDate = outputFormat.format(inputDate);
        return outputDate;
    }
}
