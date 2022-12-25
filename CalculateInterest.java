/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Casper
 */
public class CalculateInterest extends Person{
    
    private double interest;
    private double paymentMoney;
    private double eachMonth;
    private double interestRate;
    
    public void setInterest(String job,int salary,int installment,int demandingMoney){
        
       if(job.equals("Student")){
            Person student = new Student();
            interest = 1+(installment*student.getInterestRate());
            
            }
        else if(job.equals("Worker")){
            Person worker = new Worker();
            interest = 1+(installment*worker.getInterestRate());  
            
            }
        else if(job.equals("Teacher")){
            Person teacher = new Teacher();
            interest = 1+(installment*teacher.getInterestRate());
           
            }
        else if(job.equals("Retired")){
            Person retired = new Retired();
            interest = 1+(installment*retired.getInterestRate());
            
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
