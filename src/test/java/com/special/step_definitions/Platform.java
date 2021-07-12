package com.special.step_definitions;

import com.special.pages.DashboardPage;
import com.special.utilities.BrowserUtils;
import com.special.utilities.ConfigurationReader;
import com.special.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Platform {
    DashboardPage dashboardPage=new DashboardPage();
    @Given("PlatformOverview Page should be ready")
    public void platformoverviewPageShouldBeReady() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(3);
    }


    @When("the user click the Platform Overview")
    public void theUserClickThePlatformOverview() {
        dashboardPage.ProductTop.click();
        BrowserUtils.waitFor(3);

        dashboardPage.PlatformOverview.click();
        BrowserUtils.waitFor(2);
        dashboardPage.Watchvideo.click();
        BrowserUtils.waitFor(10);
        Driver.closeDriver();
    }
        @Then("the user should see the product Platform Page")
        public void theUserShouldSeeTheProductPlatformPage() {


        }

    }





