package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // youtube.com'a gidelim.
        driver.get ("http://youtube.com");
        // sayfanın title(yani başlığını) alalım.
        String sayfaBasligi = driver.getTitle();
        if(sayfaBasligi.contains("Video")){
            System.out.println("Var : " + sayfaBasligi);
        }else{
            System.out.println("Yok : " + sayfaBasligi);
        }
        // driver'ı kapattık.
        driver.quit();


    }

}


