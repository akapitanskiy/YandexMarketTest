package ru.aplana.kapitanskiyYandexTest.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AKapitanskiy on 07.10.2016 11:26.
 */

public class EarPhonePage extends PageObject {

    @FindBy(linkText = "Расширенный поиск →")
    public WebElement earPhonesAdvancedSearchLink;

    public EarPhonePage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(BaseTest.getDriver(), this);
    }

    /*public SearchAdvancedPage goToSearchAdvancedPage() {
        earPhonesAdvancedSearchLink.click();
        return new SearchAdvancedPage();
    }*/

}
