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
public class WeaponStats {
    private double fireRate;
    private int magazineSize;
    private double runSpeedMultiplier;
    private double equipTimeSeconds;
    private double reloadTimeSeconds;
    private double firstBulletAccuracy;
    
    
    
    public double getFireRate()
    {
        return this.fireRate;
    }
    
    public int getMagSize()
    {
        return this.magazineSize;
    }
    
    public double getRunSpeed()
    {
        return this.runSpeedMultiplier;
    }
    public double getEquipTimeSeconds()
    {
        return this.equipTimeSeconds;
    }
    public double getReloadTime()
    {
        return this.reloadTimeSeconds;
    }
    public double getFirstBulletAcc()
    {
        return this.firstBulletAccuracy;
    }
    
    
    
    
}
