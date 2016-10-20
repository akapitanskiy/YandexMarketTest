package ru.aplana.kapitanskiyYandexTest.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alexey on 10.10.2016.
 */
public class ElectronicPage extends PageObject {

    @FindBy( linkText = "Наушники и Bluetooth-гарнитуры" )
    public WebElement earPhonesLink;

    @FindBy(linkText = "Телевизоры")
    public WebElement TVsLink;

    public ElectronicPage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(BaseTest.getDriver(), this);
    }

    /*public TvPage goToTvPage() {
        TVsLink.click();
        return new TvPage();
    }*/

    /*public EarPhonePage goToEarPhonePage() {
        earPhonesLink.click();
        return new EarPhonePage();
    }*/

}
