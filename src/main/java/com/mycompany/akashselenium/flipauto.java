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
/**
 *
 * @author JAVA
 */
public class flipauto {
    void flip(){
     WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement flipkart=driver.findElement(By.name("q"));
       // Thread.sleep(3000);
        flipkart.sendKeys("iphone");
        driver.quit();
    }
    public static void main(String[] args){
    flipauto obj=new flipauto();
    obj.flip();
    }
}
