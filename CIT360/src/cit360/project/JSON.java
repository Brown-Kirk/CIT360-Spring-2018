/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.project;
    import com.google.gson.*;
    import java.util.HashMap;
    import java.util.Map;
public class JSON {
    public static void main(String[] args){
        Gson jsonGson = new Gson();
        Map<String, String> jsonHashmap = new HashMap<>();
        jsonHashmap.put("Rilie", "21");
        jsonHashmap.put("Sarah", "20");
        jsonHashmap.put("Zachary", "19");
        String jsonStr = jsonGson.toJson(jsonHashmap);
        System.out.println("HashMap output: " + jsonHashmap);
        System.out.println("JSON output: " + jsonStr);
        Map<String,String> newHashMap = new HashMap();
        newHashMap = jsonGson.fromJson(jsonStr, newHashMap.getClass());
        System.out.println("New Hashmap output: " + newHashMap);
    }
}

