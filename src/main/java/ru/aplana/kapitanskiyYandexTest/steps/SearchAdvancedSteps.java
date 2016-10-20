package ru.aplana.kapitanskiyYandexTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ru.aplana.kapitanskiyYandexTest.pages.SearchAdvancedPage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AKapitanskiy on 12.10.2016 14:02.
 */

public class SearchAdvancedSteps extends ScenarioSteps {

    //public static Map<String, String> titleMap1 = new LinkedHashMap<>();

    public SearchAdvancedSteps(Pages pages) {
        super(pages);
    }

    private SearchAdvancedPage onSearchAdvPage() {
        return pages().get(SearchAdvancedPage.class);
    }

    @Step
    public void inputPrice(String price) {
        SearchAdvancedPage page = onSearchAdvPage();

        page.priceTextField.click();
        page.priceTextField.clear();
        page.priceTextField.sendKeys(price);
    }

    @Step
    public void selectCheckBoxes(List<String> checkBoxs) {
        String checkBoxTemplate = "//*[contains(@class, 'filter-block__body')]//span[contains(@class, 'checkbox')]/label[text()='%s']";

        for (String s : checkBoxs) {
            getDriver().findElement(By.xpath(String.format(checkBoxTemplate, s))).click();
        }
    }

    @Step
    public void clickApplyButton() {
        onSearchAdvPage().applyButton.click();
    }

    @Step
    public boolean checkElementsQuantity(int quantity) throws InterruptedException {
        Thread.sleep(2000);
        onSearchAdvPage().webElements.size();
        boolean b = ( quantity == (onSearchAdvPage().webElements.size()) );
        return b;
    }

    @Step
    public String takeFirstElement() {
        String s = onSearchAdvPage().firstElement.getText();
        //titleMap1.put("firstElementTitle", s);
        return s;
    }

    @Step
    public void inputToHeaderSearch(String str) {
        WebElement headerSearch = onSearchAdvPage().headerSearchField;

        // открываем новую вкладку
        String urlToOpen = getDriver().getCurrentUrl();
        onSearchAdvPage().body.sendKeys(Keys.CONTROL + "t");
        getDriver().get(urlToOpen);

        headerSearch.click();
        headerSearch.clear();
        headerSearch.sendKeys(str);
    }

    @Step
    public boolean checkFoundElement(String str) throws InterruptedException {
        onSearchAdvPage().submitButton.click();
        Thread.sleep(1500);
        String elementToCheckSting = onSearchAdvPage().elementToCheck.getText();
        return ( str.equals(elementToCheckSting) );
    }

    /*@StepGroup
    public void advancedSearchActions(String price, String searchStr, String checkStr, int quantity) throws InterruptedException {
        inputPrice(price);
        selectCheckBoxes();
        clickApplyButton();
        checkElementsQuantity(quantity);
        takeFirstElement();
        inputToHeaderSearch(searchStr);
        checkFoundElement(checkStr);
    }*/


}
