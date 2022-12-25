/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Acer
 */

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JSONReader {
    static String dovizAlis = null;
    static String dovizSatis = null;
    static String degisimMiktari = null;
    static String jSONGuncelleme = null;
    
    
    public void showMe(String hangiVeri) {
        // JSON Tanımlaması :
        JSONParser jsonParser = new JSONParser();
        // Dosya Okuma:
        try {
            FileReader fileReader = new FileReader("C:/Users/Acer/mavenproject2/src/main/java/com/mycompany/mavenproject2/dovizVeri.JSON");
            Object obje = jsonParser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) obje;
            jSONGuncelleme = (String) jsonObject.get("Update_Date");
            // JSON Tablosunu Array olarak açma işlemi:
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(jsonObject.get(hangiVeri));
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject currency = (JSONObject) jsonArray.get(i);
                dovizAlis = (String) currency.get("Buying");
                dovizSatis = (String) currency.get("Selling");
                degisimMiktari = (String) currency.get("Change");
                
            }
            System.out.println("-> JSON Güncelleme Zamanı: " + jSONGuncelleme); // JSON Güncelleme Zamanını Yazdırtırıyoruz.
            System.out.println("-> Para birimi: "+ hangiVeri);
            System.out.println("-> Alış Miktarı: " + dovizAlis +
                    "\n-> Satış Miktarı: " + dovizSatis +
                    "\n-> Degişim Miktarı: " + degisimMiktari);
            // İşlemlerin Kapatılması:
            fileReader.close();
        } catch (IOException e) {
            System.out.println("IOException Hatası !\n" + e);
        } catch (ParseException e) {
            System.out.println("ParseException Hatası !\n" + e);
        }
    }

    
  
    
   
    
}

    

    

    
    

