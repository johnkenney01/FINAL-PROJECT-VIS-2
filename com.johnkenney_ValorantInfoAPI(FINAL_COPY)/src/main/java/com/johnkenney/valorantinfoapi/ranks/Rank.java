/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.ranks;

/**
 *
 * @author John
 */
public class Rank {
    private String tierName;
    private String divisionName;
    private String largeIcon;
    private Tiers tiers[];
    
   
    
    
    public String getTierName() {
        return tierName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public String getLargeIcon() {
        return largeIcon;
    }
    
    public Tiers[] getTiers()
    {
        return tiers;
    }
    
}
