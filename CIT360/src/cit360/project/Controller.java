/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cit360.project;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Kirk Brown
 */

public class Controller {
    
    public void jsonParse(String completedJson) throws Exception {

        // Create a new Gson object to convert our JSON string
        Gson gson = new Gson();
        // Parse the JSON string and create a Launch object
        Launch launchList = new Gson().fromJson(completedJson, Launch.class);
        // From our new Launch object, create our launches list, and pull the first one
        Launch.launches launchDetail = launchList.getlaunches().get(0);
        // From the details, get just the name of the launch
        String launchName = launchDetail.getname();
        // From the details, get just the date of the launch
        // If you check the Launch class, you'll see this does some parsing to take it from UTC to local time
        String launchDate = launchDetail.getnet();
        String launchDateFormatted = getDate(launchDate);
        // Go a couple layers deeper and get the description of the first mission
        String missionDescription = launchDetail.getmissions().get(0).getdescription();
        
        // Output the info we want to give to our user
        JSON json = new JSON();
        json.init();
        json.jsonOutput(" Launch details for the next space launch worldwide: ");
        json.jsonOutput(" Launch Date: " + launchDate);
        json.jsonOutput(" Launch Name: " + launchName);
        json.jsonOutput(" Mission: " + missionDescription);
        
    }
    
    public void getJSON( String sourceURL ) throws Exception {
        try {
            // Define the location from which we will get our JSON file
            URL url = new URL(sourceURL);
            // Create the HttpURLConnection object
            HttpURLConnection urlConnection = null;
            try {
                // Open a connection to the URL specified above
                urlConnection = (HttpURLConnection) url.openConnection();
                // Create a reader to capture the data from the URL above
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                //Create a new string buffer to hold the data captured
                StringBuffer jsonBuffer = new StringBuffer();
                // Create an empty string variable to be used below
                String jsonString = "";
                // Append each line caught by the reader into jsonString
                // If the line is not null, then append it to the jsonBuffer variable
                while ((jsonString = reader.readLine()) != null) {
                    jsonBuffer.append(jsonString);
                };
                // Convert the buffer to into a string variable - this is our completed JSON file
                String completedJson = jsonBuffer.toString();
                //Take our JSON string and run it through the jsonParse function
                JSON json = new JSON();
                json.init();
                json.jsonOutput(" Raw JSON Data: " + completedJson);
                jsonParse(completedJson);
            } catch (Exception e) {
                // If there are any exception, show the stack trace
                e.printStackTrace();
            } finally {
                // Don't forget to close the connection!
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }    
            }
        } catch (Exception ex) {
            // Again, if any exceptions, catch them
            ex.printStackTrace();
        }

    }
    public static String getDate( String net ) throws Exception {
        SimpleDateFormat inputFormat = new SimpleDateFormat("MMMM d, yyyy HH:mm:ss z", Locale.ENGLISH);
        Date inputDate = inputFormat.parse(net);
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM d, yyyy h:m:s a z");
        String outputDate = outputFormat.format(inputDate);
        return outputDate;
    }
}
