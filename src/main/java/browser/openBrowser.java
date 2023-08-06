package browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class openBrowser {

    public static WebDriver driver;
    //open the browser
    public static void open(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    //open the url link
    public static  void URL(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='sgpb-popup-close-button-2']")).click();
    }
    public static void Close(){
        driver.quit();
    }
}
