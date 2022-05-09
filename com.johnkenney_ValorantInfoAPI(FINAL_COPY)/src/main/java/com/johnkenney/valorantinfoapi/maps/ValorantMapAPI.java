/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.maps;

import com.google.gson.Gson;
import com.johnkenney.valorantinfoapi.guns.Gun;
import com.johnkenney.valorantinfoapi.guns.GunResponse;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ValorantMapAPI {
    public ArrayList <Map> maps;
    private static ValorantMapAPI inst = null;
    public static ValorantMapAPI getInstance()
    {
        if(inst == null)
        {
            inst = new ValorantMapAPI();
        }
        return inst;
    }
    
    
    
    
    private ValorantMapAPI()
    {
        maps = new ArrayList();
        addMaps();
    }
    
    
    
    private void addMaps()
    {
        try
        {
            Gson gson = new Gson();
           
            
            URL mapURL = new URL("https://valorant-api.com/v1/maps");
            HttpURLConnection conn = (HttpURLConnection) mapURL.openConnection();
            
            conn.setRequestMethod("GET");
            
            conn.connect();
            int responseCode = conn.getResponseCode();
            
            if(responseCode != 200)
            {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            }
            else
            {
                
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(mapURL.openStream());
                
                while(scanner.hasNext())
                {
                    informationString.append(scanner.nextLine());
                }
                
                scanner.close();
               
                String content = informationString.toString();
                MapResponse test = gson.fromJson(content, MapResponse.class);
                
                
                Map[] m = test.data; 
                for (Map m1 : m) {
                    if(!"The Range".equals(m1.getDisplayName()))
                    {   
                        maps.add(m1);
                    }
                            }
            }
             
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  
    }
}
