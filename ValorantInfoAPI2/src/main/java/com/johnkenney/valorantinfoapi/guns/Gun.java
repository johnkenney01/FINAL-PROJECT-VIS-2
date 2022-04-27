/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johnkenney.valorantinfoapi.guns;

/**
 *
 * @author John
 */
public class Gun {
    private String uuid;
    private String displayName;
    private String category;
    private String displayIcon;
    private WeaponStats weaponStats;
    
    
    public Gun()
    {
        
    }
    
    public String getUuid()
    {
        return this.uuid;
        
    }
    
    public String getDisplayName()
    {
        return this.displayName;
    }
    
    public String getCategory()
    {
        return this.category;
    }
    
    public String getdisplayIcon()
    {
        return this.displayIcon;
    }
    
    public String getWeaponStats()
    {
        return "Gun Stats" + "\n"  + "\n" + 
                "Fire Rate: " + this.weaponStats.getFireRate() + " Bullets per Second" + "\n" + "\n" + 
                "Magazine Size: " + this.weaponStats.getMagSize() + " Bullets" + "\n" + "\n" +
                "Speed While Running: " + this.weaponStats.getRunSpeed() + "\n" + "\n" + 
                "Time to Equip: " + this.weaponStats.getEquipTimeSeconds() + " Seconds" + "\n" + "\n" +
                 "Time to Reload: " + this.weaponStats.getReloadTime() + " Seconds"  + "\n" + "\n" + 
                "First Bullet Accuracy : " + this.weaponStats.getFirstBulletAcc()*100  + "% ";
    }
    
    
    
}
