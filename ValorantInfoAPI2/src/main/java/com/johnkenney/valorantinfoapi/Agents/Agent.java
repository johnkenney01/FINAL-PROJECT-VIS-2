/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.Agents;

/**
 *
 * @author John
 */
public class Agent {
    //Data Fields 
    public String uuid;
    public String displayName;
    public String description;
    public String displayIconSmall;
    public String fullPortrait;
    public String fullPortraitV2;
    public String background;
    //Abilties
    public Ability abilities[];
    //Roles
    public Role role;
    public boolean isPlayableCharacter;
    

    public Agent() {
    
    }
    
    public void role()
    {
       System.out.println(role.displayName);
    }
    public String agentDesc()
    {
        return "Description: " + this.description;
    }
    
    @Override
    public String toString()
    {
        return displayName + ", " + ": " + uuid;
    }
    
    public String getName()
    {
        return this.displayName;
    }
      
    
}
