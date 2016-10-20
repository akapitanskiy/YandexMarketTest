package ru.aplana.kapitanskiyYandexTest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alexey on 09.10.2016.
 */

@DefaultUrl("https://www.yandex.ru/")
public class YandexMainPage extends PageObject {

    @FindBy(linkText = "Маркет")
    public WebElement marketLink;

    public WebElement getMarketLink() {
        return marketLink;
    }

    //constructor
    public YandexMainPage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(BaseTest.getDriver(), this);
    }


}
