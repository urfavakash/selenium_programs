package com.mycompany.akashselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    void checkLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String message = driver.findElement(By.id("flash")).getText();
        System.out.println("Login Message:" + message);
        driver.quit();
    }

    public static void main(String[] args) {
        LoginTest lg = new LoginTest();
        lg.checkLogin();

    }
}
