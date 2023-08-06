package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    public static WebDriver driver;
    public static void login_button() {

        WebElement login = driver.findElement(By.xpath("//div[@class='account-user']/a"));  //for login
        login.sendKeys(Keys.ENTER);

       WebElement accountLink = driver.findElement(By.xpath("//ul[@class='af-my-account-menu prime-color']/li/a[@class='af-my-account-admin']"));
       //for click login or register
        accountLink.sendKeys(Keys.ENTER);
    }
    public static void sendData(String UserName,String PassWord) throws Exception {
        WebElement username =driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys(UserName); //username or email address

        WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(PassWord);//password
        Thread.sleep(5000);
    }
    public static void click(){
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    }

}
