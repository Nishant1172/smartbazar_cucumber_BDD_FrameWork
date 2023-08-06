package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search_item {

    public static WebDriver driver;
    public static void selectItem(String ProductName){


        String ex =" Laila Basmati Rice (1kg) " ;
        if (!ex.equals(ProductName)) {
            System.out.println("please check enter the data is correct or not");
        } else {
            WebElement productName = driver.findElement(By.xpath("//a[contains(text(),'Laila Basmati Rice (1kg)')]"));
            productName.sendKeys(Keys.ENTER);
        }
    }
//    public static void verify(String verify) {
//        String text = driver.getTitle();
//        int i = text.compareToIgnoreCase(verify);
//        System.out.println(text);
//    }

}
