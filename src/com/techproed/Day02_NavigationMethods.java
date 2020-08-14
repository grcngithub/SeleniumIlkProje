package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Windows 10\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        //driverin tum ekrani kaplamasini sagliyor
        webDriver.manage().window().maximize();

        // driver"a google.com"a gitmesini soyledik.
        webDriver.get("http://google.com");

        //get komutu ile ayni komuttur navigate to
        webDriver.navigate().to("http://amazon.com");

        //navigate().back() komutu bir onceki sayfaya geri donmeye yariyor
        webDriver.navigate().back();

        //navigate().forward() komutu geri geldigimiz sayfaya donmemizi sagliyor.
        webDriver.navigate().forward();

        //navgate.refresh metodu sayfayi yenilemeye yariyor
        webDriver.navigate().refresh();






    }
}
