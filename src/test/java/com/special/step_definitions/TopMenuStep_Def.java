package com.special.step_definitions;

import com.special.pages.DashboardPage;
import com.special.utilities.BrowserUtils;
import com.special.utilities.ConfigurationReader;
import com.special.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuStep_Def {


    DashboardPage dashboardPage=new DashboardPage();

    @Given("Midaxo Dashboard should be ready")
    public void midaxo_Dashboard_should_be_ready() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(3);

    }



    @When("the user click the Product TopMenu")
    public void the_user_click_the_Product_TopMenu() {
        dashboardPage.ProductTop.click();
        BrowserUtils.waitFor(5);
    }
    @Then("the user should see the product popupMenu")
    public void the_user_should_see_the_product_popupMenu() {
        String str=dashboardPage.OverviewHeader.getText();

        Assert.assertEquals(str,"Overview");
        System.out.println("Evet bu bir doğru "+str);
        Driver.closeDriver();

    }

}
