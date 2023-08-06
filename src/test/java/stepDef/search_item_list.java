package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.search_item;
public class search_item_list {

    @Then("enter the {string} data")
    public void enter_the_data(String string) {
        HomePage.clickOnSearch();
    }
    @When("user select {string} from the someList")
    public void user_select_from_the_somelist(String productName) {
      search_item.selectItem(productName);
    }
    @Then("user verify the {string}")
    public void user_verify_the(String ItemName) {
//        search_item.verify(ItemName);
    }

}
