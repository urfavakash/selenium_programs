/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akashselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtractTest {

    void getText() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        String heading = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Page Heading:" + heading);
        String para = driver.findElement(By.tagName("p")).getText();
        System.out.println("Page Paragraph :" + para);
        driver.quit();
    }

    public static void main(String[] args) {
        ExtractTest et = new ExtractTest();
        et.getText();

    }

}
