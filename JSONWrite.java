/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author Acer
 */
package com.mycompany.mavenproject2;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.util.Timer; Görev metodunu oluştururken kullanacağız.
//import java.util.TimerTask; Görev metodunu oluştururken kullanacağız.

public class JSONWrite {
    //static int saatBasi = 0; Görev metodunu oluştururken kullanacağız.
    public void baslat(){
        // JSON Dosyasındaki Verileri İnternet Sitesinden Çekerek "Veri.JSON" dosyasına yazdıracağız.
        try{
            URL url = new URL("https://finans.truncgil.com/v3/today.json"); // Veriyi Alacağımız URL Giriyoruz.
            HttpURLConnection hr = (HttpURLConnection) url.openConnection();
            //System.out.println(hr.getResponseCode()); //Bağlantı Cevap Numarasını öğreniyoruz.
            if(hr.getResponseCode() == 200){ // Eğerki bağlantı cevap numaramız bize lazım olan 200 ile aynı olduğu zaman işlemi gerçekleştiriyoruz.
                InputStream im = hr.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(im));
                File file = new File("C:/Users/Acer/mavenproject2/src/main/java/com/mycompany/mavenproject2/dovizVeri.JSON"); // Dosya Yolunu Değiştirmeyi Unutmayın.
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                String veri = (String) bufferedReader.readLine();
                while (veri!=null){
                    bufferedWriter.write(veri); // Okunan Veriyi Yazdırıyoruz.
                    bufferedWriter.newLine(); // Bir Aşağı Satıra Geçmesini İstiyoruz.
                    bufferedWriter.flush(); // Okunan verileri dosyada görmemiz için aktarım işlemini sağlıyor.
                    veri = bufferedReader.readLine(); // Yeni Veri Okutuyoruz.
                }
                // İşlemler Bitince Okuma ve Yazma İşlemlerini Kapatıyorum.
                bufferedWriter.close();
                bufferedReader.close();
                im.close();

            }
        }
        catch (Exception e){
            System.out.println("JSONWrite Sınıfı Exception Hatası.\n"+e);
        }
    }
    JSONWrite(){
        baslat(); // Main sınıfına tanımlama yaptıktan sonra ilk başta dosya oluşmasını istiyorum.
    }
    


}