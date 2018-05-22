package cit360.JsonHttpUrlConnection;

import cit360.JsonHttpUrlConnection.Launch.launches;
import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.*;
import java.io.BufferedReader;
import java.net.HttpURLConnection;

//import org.quickconnectfamily.json.*;

public class JsonGson {

	
    public static void main(String[] args) throws Exception {
        try {
            // Define the location from which we will get our JSON file
            URL url = new URL("https://launchlibrary.net/1.4/launch/next/1");
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
                System.out.println(" Raw JSON Data: " + completedJson);
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
    public static void jsonParse(String completedJson) throws Exception {

        // Create a new Gson object to convert our JSON string
        Gson gson = new Gson();
        // Parse the JSON string and create a Launch object
        Launch launchList = new Gson().fromJson(completedJson, Launch.class);
        // From our new Launch object, create our launches list, and pull the first one
        launches launchDetail = launchList.getlaunches().get(0);
        // From the details, get just the name of the launch
        String launchName = launchDetail.getname();
        // From the details, get just the date of the launch
        // If you check the Launch class, you'll see this does some parsing to take it from UTC to local time
        String launchDate = launchDetail.getnet();
        String launchDateFormatted = appcontrol.getDate(launchDate);
        // Go a couple layers deeper and get the description of the first mission
        String missionDescription = launchDetail.getmissions().get(0).getdescription();
        
        // Output the info we want to give to our user
        System.out.println();
        System.out.println(" Launch details for the next space launch worldwide: ");
        System.out.println(" Launch Date: " + launchDate);
        System.out.println(" Launch Name: " + launchName);
        System.out.println(" Mission: " + missionDescription);
        System.out.println();

    }
}
