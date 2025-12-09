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

public class GoogleSearch {
 
    void googleSearchProcess(){
        
            try{
                WebDriverManager.chromedriver().setup();
                WebDriver driver=new ChromeDriver();
                driver.get("https://www.google.com");
                WebElement searchBox=driver.findElement(By.name("q"));
                searchBox.sendKeys("Selenium WebDriver");
                searchBox.submit();
                System.out.println("page Title after search:"+driver.getTitle());
                
                driver.quit();
            }catch(Exception e){
                System.out.println(e);
            }
            
            }
    public static void main(String[] args) {
        GoogleSearch gs=new GoogleSearch();
        gs.googleSearchProcess();
        
        }
    }
