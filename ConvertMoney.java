/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Casper
 */
public class ConvertMoney {
    
    double converted=0;
    
    
    public void setUSD(int turkishLira,double USD){
        
        converted = Math.round(turkishLira/USD);
      
    }
     public double getUSD(){
       
        return converted;
    }
     public void setEUR(int turkishLira,double EUR){
        
        converted = Math.round(turkishLira/EUR);
      
    }
     public double getEUR(){
       
        return converted;
    }
     public void setGBP(int turkishLira,double GBP){
        
        converted = Math.round(turkishLira/GBP);
      
    }
     public double getGBP(){
       
        return converted;
    }
     public void setTA(int turkishLira,double TA){
     
         converted = Math.round(turkishLira/TA);
           
    }
     public double getTA(){
       
        return converted;
    }
     public void setYA(int turkishLira,double YA){
        
        converted = Math.round(turkishLira/YA);
      
    }
     public double getYA(){
       
        return converted;
    }
      public void setGA(int turkishLira,double GA){
        
        converted = Math.round(turkishLira/GA);
    }
     public double getGA(){
       
        return converted;
    }
      public void setGU(int turkishLira,double GU){
        
        converted = Math.round(turkishLira/GU);
      
    }
     public double getGU(){
       
        return converted;
    }
}
