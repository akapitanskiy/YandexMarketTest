/*
package ru.aplana.kapitanskiyYandexTest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

*/
/**
 * Created by Alexey on 10.10.2016.
 *//*


public class SearchAdvancedPage {

    @FindBy(id = "glf-pricefrom-var")
    WebElement priceTextField;

    @FindBy(id = "glf-1801946-8455647")
    WebElement beatsCheckBox;

    @FindBy(xpath = "//button[./span[text()='Применить']]")
    WebElement applyButton;

    @FindBys(@FindBy(xpath = "//span[@class='snippet-card__header-text']"))
    List<WebElement> webElements;

    @FindBy(css = "span.snippet-card__header-text")
    WebElement firstElement;

    @FindBy(id = "header-search")
    WebElement headerSearchField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    @FindBy(css = "h1.title.title_size_22")
    WebElement elementToCheck;

    @FindBy(css = "body")
    WebElement body;




    public EarPhoneAdvancedPage() {
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    public EarPhoneAdvancedPage setPrice(String price) {
        priceTextField.click();
        priceTextField.clear();
        priceTextField.sendKeys(price);
        return this;
    }

    public EarPhoneAdvancedPage selectCheckBoxes(String... checkBoxs) {

        for (String s : checkBoxs) {
            if (s.equals("Beats")) {
                beatsCheckBox.click();
            }
        }
        //TODO проверка webElem является ли checkBox'ом
        return this;
    }

    public boolean checkElementsQuantity(int quantity) throws Exception {

        applyButton.click();
        Thread.sleep(2000);
        return ( quantity == webElements.size() );
    }

    public boolean checkFirstElement() throws Exception {

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
    }


}
*/
