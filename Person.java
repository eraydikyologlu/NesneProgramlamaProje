/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Acer
 */


    /**
     * @param args the command line arguments
     */
    
class Person {
    
    
    public double getInterestRate() {
      // Default implementation that returns 0.0
      return 0.0;
    }
}

class Student extends Person {
    @Override
    public double getInterestRate() {
      // Return the interest rate for students
      return 0.002;
    }
}

class Worker extends Person {
    @Override
    public double getInterestRate() {
      // Return the interest rate for workers
      return 0.005;
    }
}

class Teacher extends Person {
    @Override
    public double getInterestRate() {
      // Return the interest rate for teachers
      return 0.003;
    }
}

class Retired extends Person {
    @Override
    public double getInterestRate() {
      // Return the interest rate for retired people
      return 0.0025;
    }
}



