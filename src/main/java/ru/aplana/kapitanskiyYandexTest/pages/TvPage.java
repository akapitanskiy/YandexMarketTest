package ru.aplana.kapitanskiyYandexTest.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AKapitanskiy on 07.10.2016 11:25.
 */

public class TvPage extends PageObject {

    @FindBy(linkText = "Расширенный поиск →")
    public WebElement TVsAdvancedSearchLink;

    public TvPage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(BaseTest.getDriver(), this);
    }

    /*public SearchAdvancedPage goToSearchAdvancedPage() {
        TVsAdvancedSearchLink.click();
        return new SearchAdvancedPage();
    }*/

}
