/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Casper
 */
public class CalculateInterest {
    
    private double interest;
    private double paymentMoney;
    private double eachMonth;
    
    public void setInterest(String job,int salary,int installment,int demandingMoney){
        
       if(job.equals("Student")){
        
            interest = 1+(installment*0.0020);
          
            }
        else if(job.equals("Worker")){
            interest = 1+(installment*0.005);  
            
            }
        else if(job.equals("Teacher")){

            interest = 1+(installment*0.0030);
           
            }
        else if(job.equals("Retired")){

            interest = 1+(installment*0.0025);
            
            }
           
            paymentMoney = demandingMoney*interest;
            eachMonth = paymentMoney/installment;      
    }
    
    
    public double getInterest(){
        return interest;
    }
     public double getPaymentMoney(){
        return paymentMoney;
    }
     public double getEachMonth(){
        return eachMonth;
    }
}
