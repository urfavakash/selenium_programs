/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.akashselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
//import org.openqa.selenium.support.ui.select;

public class Dropdown {

    void hov1(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/hovers");
    Actions actions =new Actions(driver);
    List<WebElement> profiles=driver.findElements(By.cssSelector(".figure"));
    for(int i=0;i<profiles.size();i++){
    WebElement profile=profiles.get(i).findElement(By.tagName("img"));
   
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.getLogger(Dropdown.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
     actions.moveToElement(profile).perform();
    WebElement caption=profiles.get(i).findElement(By.className("figcaption"));
    System.out.println("Caption "+(i+1)+": "+caption.getText());
    }
    driver.quit();
}
   

    public static void main(String[] args){
        Dropdown obj=new Dropdown();
        //obj.hov();
        obj.hov1();
    }
}    

