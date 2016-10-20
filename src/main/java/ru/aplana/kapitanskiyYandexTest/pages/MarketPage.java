package ru.aplana.kapitanskiyYandexTest.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alexey on 09.10.2016.
 */

public class MarketPage extends PageObject {

    @FindBy( linkText = "Электроника")
    public WebElement electronicLink;

    public MarketPage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(BaseTest.getDriver(), this);
    }

    /*public ElectronicPage goToElectronicPage() {
        electronicLink.click();
        return new ElectronicPage();
    }*/


}
