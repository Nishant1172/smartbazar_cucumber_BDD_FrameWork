package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.loginPage;

public class Loginpage_back {

    @Then("Click on Login button link")
    public void clickOnLoginButtonLink() {
        loginPage.login_button();
    }
    @Then("enter the {string} and {string}")
    public void enter_the_and(String username, String password) {
        try {
            loginPage.sendData(username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @And("click on Login")
    public void clickOnLogin() {
        loginPage.click();
    }


}
