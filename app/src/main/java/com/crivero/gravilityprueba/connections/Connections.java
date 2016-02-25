package com.crivero.gravilityprueba.connections;

import com.crivero.gravilityprueba.objects.Author;
import com.crivero.gravilityprueba.objects.Entry;
import com.crivero.gravilityprueba.objects.Feed;
import com.crivero.gravilityprueba.objects.JsonObject;
import com.crivero.gravilityprueba.objects.Uri;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by crivero on 22/02/2016.
 */
public class Connections {

    public static JsonObject baseConnection(String url){
        //Creating new JSON Parser
        JSONParser jParser = new JSONParser();
        // Getting JSON from URL
        JSONObject json = jParser.getJSONFromUrl(url);
        String s = json.toString();
        JsonObject jsonObject = new JsonObject();

        Gson gson = new Gson();
        jsonObject= gson.fromJson(s, JsonObject.class);

        Feed feed = jsonObject.getFeed();
        Author author = feed.getAuthor();
        List<Entry> entry = feed.getEntry();
        Uri uri = author.getUri();
        return jsonObject;
    }
}
