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
    private String uuid;
    private String displayName;
    private String description;
    private String displayIconSmall;
    private String fullPortrait;
    private String fullPortraitV2;
    private String background;
    //Abilties
    public Ability abilities[];
    //Roles
    public Role role;
    public boolean isPlayableCharacter;
    

    public Agent() {
    
    }
    
    public String getUUID()
    {
        return this.uuid;
    }
    
    public String getDisplayIconSmall(){
        return this.displayIconSmall;
    }
    public String getFullPortrait(int port)
    {   
        if(port == 1)
                return this.fullPortrait;
        else
            return this.fullPortraitV2;
        
    }
    
    
    
    public void role()
    {
       System.out.println(role.displayName);
    }
    public String getDescription()
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
