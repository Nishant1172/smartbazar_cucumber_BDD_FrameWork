package pages;

import browser.openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class HomePage extends openBrowser {

    public static void searchbar(String searchInput){

        driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();

        WebElement search = driver.findElement(By.xpath("//input[@class='aws-search-field']"));
        search.sendKeys(searchInput);

    }
    public static void clickOnSearch(){
        WebElement search = driver.findElement(By.xpath("//input[@class='aws-search-field']"));
        search.sendKeys(Keys.ENTER);
    }

    public static void verificationTitle(){
            String title =  driver.getTitle();
            System.out.println(title);

            String exp = "Shop - Smartbazaar";

            AssertJUnit.assertEquals(exp,title);
    }

    public void select_product(){
        WebElement product_list = driver.findElement(By.xpath("//a[contains(text(),'Humza Vegetable Samosas (20 pcs)')]"));
        product_list.getText();
        System.out.println(product_list);

    }
}
