package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Windows 10\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");


        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com/");

        String googleTitle = webDriver.getTitle();
        System.out.println(googleTitle);

        webDriver.navigate().to("https://www.youtube.com/");
        String youtubeTitle = webDriver.getTitle();
        String youtubeUrl = webDriver.getCurrentUrl();
        System.out.println(youtubeTitle);
        System.out.println(youtubeUrl);

        webDriver.navigate().forward();
        String googleUrl = webDriver.getCurrentUrl();
        System.out.println(googleUrl);
        webDriver.quit();

    }
}
