/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        JSONWrite write = new JSONWrite();
        write.baslat();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Currency: ");
        String currency = input.next();
        
        
        
        JSONReader read = new JSONReader();
        read.showMe(currency);
        
        
        
    }
}
