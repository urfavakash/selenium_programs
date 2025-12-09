/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akashselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest{

    void callDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.python.org/");
        System.out.println("page title:" + driver.getTitle());
        System.out.println("page Url:" + driver.getCurrentUrl());
        System.out.println("page Source:" + driver.getPageSource());
        System.out.println("Unique identifier (ID) of the current browser window:" + driver.getWindowHandles());
        driver.quit();
    }

    public static void main(String[] args) {
        GoogleTest obj=new GoogleTest();
        obj.callDriver();
    }
}

