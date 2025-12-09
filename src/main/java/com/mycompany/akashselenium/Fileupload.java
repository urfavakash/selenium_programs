package com.mycompany.akashselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

void File() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/upload");
    WebElement chosefilebtn=driver.findElement(By.xpath("//input@id='file-upload']"));
    chosefilebtn.sendKeys("C:\\Users\\JAVA\\Pictures\\download1.png");
 
    try{
    Thread.sleep(3000);
}
    catch (InterruptedException ex){
    System.getLogger(Fileupload.class.getName()).log(System.Logger.Level.ERROR,(String)null,ex);
}
WebElement submitbtn=driver.findElement(By.xpath("//input[@id='file-submit']"));
submitbtn.click();
String check=driver.findElement(By.cssSelector("div[class='example']h3")).getText();
if(check.contains("File uploaded!")){
    System.out.println("the file has been uploaded successfully");
}
else
{
   System.out.println("the file has not been uploaded");
}
}
public static void main(String[] args) {
Fileupload obj=new Fileupload();
obj.File();
}
}


