package com.mycompany.akashselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Formsubmit{

    void drag() {
        WebDriverManager.chromedriver().setup();
        WebDriver mychrone = new ChromeDriver();
        mychrone.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions mouse = new Actions(mychrone);
        WebElement acol = mychrone.findElement(By.id("coloumn-a"));
        WebElement bcol = mychrone.findElement(By.id("coloumn-b"));
        mouse.dragAndDrop(bcol, acol).perform(); 
        mouse.dragAndDrop(acol, bcol).perform();
        
        System.out.println("drag and drop performed succesfully");
    }

    public static void main(String[] args) {
        Formsubmit obj = new Formsubmit();
        obj.drag();
    }

}
