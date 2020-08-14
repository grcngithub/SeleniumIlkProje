package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Windows 10\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        // selenium ile ilgili ilk kodumuz.
        // webDriver nesnesi olusturarak, chrome driveri kullanabilir hale getirdik.

        //Driverimiza google.coma gitmesini soyledik.
        webDriver.get("http://google.com");

        //driverimizla acik olan pencereyi kapatir
        //webDriver.close();

        //driverimizi komple kapatiyor
        //webDriver.quit();




















    }
}