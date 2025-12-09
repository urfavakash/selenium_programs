package com.mycompany.akashselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Rightclick {

    void right() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement en = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(en).perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.getLogger(Rightclick.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        String alertmsg = driver.switchTo().alert().getText();
        System.out.println("the alert message is" + alertmsg);
        driver.quit();
    }

    public static void main(String[] args) {
        Rightclick obj = new Rightclick();

        obj.right();
    }

}
