/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantgamestats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;




//HTTP REQUEST PARSING TUT: https://www.youtube.com/watch?v=qzRKa8I36Ww

/**
 *
 * @author John
 */
public class Main {
    private static HttpURLConnection connection;
    public static String URL = "https://valorant-api.com/v1/agents";
       public static void main(String[] args) throws IOException, InterruptedException {
         
           BufferedReader reader;
           String line;
           StringBuffer content = new StringBuffer();
           
           try {
             URL url = new URL("https://valorant-api.com/v1/agents");
             connection = (HttpURLConnection) url.openConnection();
             connection.setRequestMethod("GET");
             connection.setConnectTimeout(5000);
             connection.setReadTimeout(5000);
             
             int status = connection.getResponseCode();
//             System.out.println(status);
            if(status > 299)
            {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine())!= null)
                {
                    content.append(line);
                }
                reader.close();
            }
            else
            {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine())!= null)
                {
                    content.append(line);
                }
                reader.close();
            }
            System.out.println(content.toString());
         } catch(MalformedURLException e){
             e.printStackTrace();
         } catch(IOException e){
             e.printStackTrace();
         }finally{
               connection.disconnect();
           }
             
          
          
       }
       
//        public static String parse(String responseBody){
//            JSONArray info = new JSONArray();
//            for(int i = 0; i < responseBody.length(); i++)
//            {
//                JSONObject infoObj = info.get;
//            }
//            
//            
//            return null;
//        }
    
}
