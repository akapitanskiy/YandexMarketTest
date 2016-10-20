package ru.aplana.kapitanskiyYandexTest.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Alexey on 10.10.2016.
 */

public class SearchAdvancedPage extends PageObject {

    @FindBy(id = "glf-pricefrom-var")
    public WebElement priceTextField;

    @FindBy(id = "header-search")
    public WebElement headerSearchField;

    @FindBy(css = "span.snippet-card__header-text")
    public WebElement firstElement;

    @FindBy(css = "body")
    public WebElement body;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(css = "h1.title.title_size_22")
    public WebElement elementToCheck;

    @FindBy(xpath = "//button[./span[text()='Применить']]")
    public WebElement applyButton;

    @FindBys(@FindBy(xpath = "//span[@class='snippet-card__header-text']"))
    public List<WebElement> webElements;


    public SearchAdvancedPage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(BaseTest.getDriver(), this);
    }

    /*public SearchAdvancedPage setPrice(String price) {
        priceTextField.click();
        priceTextField.clear();
        priceTextField.sendKeys(price);
        return this;
    }*/

    /*public SearchAdvancedPage selectCheckBoxes(String... checkBoxs) {
        String checkBoxTemplate = "/*//*[contains(@class, 'filter-block__body')]//span[contains(@class, 'checkbox')]/label[text()='%s']";
        for (String s : checkBoxs) {
            BaseTest.getDriver().findElement(By.xpath(String.format(checkBoxTemplate, s))).click();
        }

        return this;
    }*/

    /*public boolean checkElementsQuantity(int quantity) throws Exception {
        // TODO сюда можно передавать вторым аргументом xpath, чтобы сделать метод универсальнее
        applyButton.click();
        Thread.sleep(2000);
        return (quantity == webElements.size());
    }*/

    /*public boolean checkFirstElement() throws Exception {

        String firstElementString = firstElement.getText();
        //Thread.sleep(3000);
        String urlToOpen = BaseTest.getDriver().getCurrentUrl();
        body.sendKeys(Keys.CONTROL + "t");
        BaseTest.getDriver().get(urlToOpen);

        headerSearchField.click();
        headerSearchField.clear();
        headerSearchField.sendKeys(firstElementString);
        submitButton.click();
        String elementToCheckString = elementToCheck.getText();
        return firstElementString.equals(elementToCheckString);
    }*/

}
