/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.guns;

import com.google.gson.Gson;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ValorantGunAPI extends Thread {
    
    public ArrayList<Gun> guns;
    
    private static ValorantGunAPI inst = null;
    public static ValorantGunAPI getInstance()
    {
        if(inst == null)
        {
            inst = new ValorantGunAPI();
        }
        return inst;
    }
    
    private ValorantGunAPI()
    {
        guns = new ArrayList();
        addGuns();
    }
    
    public void addGuns()
    {
       try
        {
            Gson gson = new Gson();
           
            
            URL gunURL = new URL("https://valorant-api.com/v1/weapons");
            HttpURLConnection conn = (HttpURLConnection) gunURL.openConnection();
            
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
                Scanner scanner = new Scanner(gunURL.openStream());
                
                while(scanner.hasNext())
                {
                    informationString.append(scanner.nextLine());
                }
                
                scanner.close();
               
                String content = informationString.toString();
                GunResponse test = gson.fromJson(content, GunResponse.class);
                
                
                Gun[] g = test.data; 
                for (Gun g1 : g) {
                    
                    guns.add(g1);
                    
                            }
                
            }
             
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  
}

}