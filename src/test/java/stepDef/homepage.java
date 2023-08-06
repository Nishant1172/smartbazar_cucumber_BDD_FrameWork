package stepDef;

import browser.openBrowser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class homepage {

    WebDriver driver;
    @Given("open the browser") //open browser
    public void open_the_browser() {
       openBrowser.open();
    }
    @Then("enter the {string}") // Enter URL
    public void enter_the(String url) throws InterruptedException {
        openBrowser.URL(url);
    }

    @And("Enter {} data")
    public void enterData(String search) {
      HomePage.searchbar(search);

    }
    @When("click on search icon")
    public void click_on_search_icon() {
       HomePage.clickOnSearch();
    }

   @Then("verification the data is correct")
    public void verificationTheDataIsCorrect() throws InterruptedException {
        HomePage.verificationTitle();
    }

    @And("close browser")
    public void close_browser() {
        openBrowser.Close();
    }
}
