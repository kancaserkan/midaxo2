package com.special.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DemoPage extends DashboardPage{
    WebDriver driver;
    @FindBy(xpath = "//input[@name='firstname']")
    public  WebElement firstName;
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='company']")
    public WebElement companyName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement companyEmail;
    @FindBy(xpath = "//select[@name='numemployees']")
    public WebElement companySize;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement companyPhone;
    @FindBy(xpath = "//select[@name='how_would_you_describe_your_position_']")
    public WebElement yourRole;
    @FindBy(xpath = "//input[@value='Pipeline Management']")
    public WebElement pipelineManagement;
    @FindBy(xpath = "//input[@value='Due Dilligence']")
    public WebElement dueDilligence;
    @FindBy(xpath = "//input[@value='Post-Merger Integration']")
    public WebElement postMergerIntegration;
    @FindBy(xpath = "//input[@value='VDR']")
    public WebElement vdr;
    @FindBy(xpath = "//input[@value='Other']")
    public WebElement other;
    @FindBy(xpath = "//input[@class='hs-button primary large']")
    public WebElement schedule;




}
