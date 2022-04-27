/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi;
import com.google.gson.Gson;
import com.johnkenney.valorantinfoapi.Agents.Agent;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public final class ValorantAgentAPI  {
    
    public ArrayList <Agent> agents;
    
    private static ValorantAgentAPI inst = null;
    public static ValorantAgentAPI getInstance()
    {
        if(inst == null)
        {
            inst = new ValorantAgentAPI();
            System.out.println("NEW");
        }
        return inst;
    }
    private  ValorantAgentAPI()
    {
        agents = new ArrayList();
        this.addAgents();
    }

    
    public ArrayList<Agent> getAgents()
    {
        return agents;
    }
   
    
    public Agent getAgentByName(String name)
    {
        for(int i = 0; i < agents.size(); i++)
        {
              if(agents.get(i).getName() == null ? name == null : agents.get(i).getName().equals(name))
                  return agents.get(i);
        }
        return null;
    }
    public void addAgents()
    {
        try
        {
            Gson gson = new Gson();
            //API Agent Endpoint https://valorant-api.com/v1/agents
            
            URL agentURL = new URL("https://valorant-api.com/v1/agents");
            HttpURLConnection conn = (HttpURLConnection) agentURL.openConnection();
            
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
                Scanner scanner = new Scanner(agentURL.openStream());
                
                while(scanner.hasNext())
                {
                    informationString.append(scanner.nextLine());
                }
                
                scanner.close();
                
                //System.out.println(informationString);
                String content = informationString.toString();
                Response test = gson.fromJson(content, Response.class);
                
                Agent[] a = test.data; 
                for(Agent a1 : a)
                {
                    if(a1.isPlayableCharacter)
                     agents.add(a1);
                }
            }
             
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  
       
    }
    
    
}
