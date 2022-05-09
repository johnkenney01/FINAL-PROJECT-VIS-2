/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.ranks;

import com.google.gson.Gson;
import com.johnkenney.valorantinfoapi.maps.Map;
import com.johnkenney.valorantinfoapi.maps.MapResponse;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ValorantRanksAPI {
    public ArrayList <Rank> ranks;
    
    private static ValorantRanksAPI inst = null;
    public static ValorantRanksAPI getInstance()
    {
        if(inst == null)
        {
         inst = new ValorantRanksAPI();   
        }
        return inst;
    }
    
    private ValorantRanksAPI()
    {
        ranks = new ArrayList();
        addRanks();
    }
    
    
    private void addRanks()
    {
        
         try
        {
            Gson gson = new Gson();
           
            
            URL rankURL = new URL("https://valorant-api.com/v1/competitivetiers");
            HttpURLConnection conn = (HttpURLConnection) rankURL.openConnection();
            
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
                Scanner scanner = new Scanner(rankURL.openStream());
                
                while(scanner.hasNext())
                {
                    informationString.append(scanner.nextLine());
                }
                
                scanner.close();
               
                String content = informationString.toString();
                RankResponse test = gson.fromJson(content, RankResponse.class);
                RankResponse test2 = gson.fromJson(content, RankResponse.class);
                
                
                Rank[] r = test.data; 
                Rank[] t = test2.tiers;
                for (Rank r1 : r) {
                      
                        ranks.add(r1);
                    
                            }
                
//                    for(int j = 3; j < ranks.get(1).getTiers().length;j++){
//                        System.out.println(ranks.get(1).getTiers()[j].getTierName());
//                    }
                
                   
                
            }
             
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  
        
    }
}
