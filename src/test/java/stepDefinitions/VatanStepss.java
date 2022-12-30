package stepDefinitions;

import Pages.VatanPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class VatanStepss {
    WebDriver driver = DriverFactory.getDriver();
    VatanPages vatanPages = new VatanPages(driver);
    @Given("User is on homepage")
    public void userIsOnHomepage() {
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        VatanPages.clickAcceptCookies();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        VatanPages.clickTheSearchButton();
    }

    @When("Write product name")
    public void writeProductName() {
        VatanPages.writeProductName();
    }

    @When("Click search button")
    public void clickSearchButton() {
        VatanPages.clickSearchButton();
    }

    @When("Return the home page")
    public void returnTheHomePage() {
        VatanPages.returnTheHomePage();
    }

    @When("Select the first product")
    public void selectTheFirstProduct() {
        VatanPages.selectTheFirstProduct();
    }

    @When("Adding the cart")
    public void addingTheCart() {
        VatanPages.addingTheCart();
    }

    @When("Click the basket")
    public void clickTheBasket() {
        VatanPages.clickTheBasket();
    }


}
