package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Windows 10\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        String amazonTitle = driver.getTitle(); // Car

        if( amazonTitle.contains("Car") ){

            System.out.println("book kelimesi geciyor:");


        }else{
            System.out.println("book kelimesini icermiyor: " );

        }
        driver.quit();
;
    }

}
