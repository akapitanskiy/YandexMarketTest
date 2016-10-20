package ru.aplana.kapitanskiyYandexTest.steps.bdd;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.BeforeClass;
import ru.aplana.kapitanskiyYandexTest.steps.UserSteps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by AKapitanskiy on 13.10.2016 18:35.
 */

public class BddSteps {

    protected final String baseUrl = "https://www.yandex.ru/";

    public static Map<String, String> titleMap = new LinkedHashMap<>();

    @Steps
    protected UserSteps user;

    public List<String> takeBrands(String[] dbRequest) {
        String[] brands = dbRequest[1].split(",");
        List<String> brandsList = new ArrayList<>();
        for (String s : brands) {
            brandsList.add(s);
        }
        return brandsList;
    }

    @When("открываем главную страницу Яндекс")
    public void openYandexMainPage() {
        user.navigateTo(baseUrl);
        user.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("заходим в Яндекс.Маркет")
    public void navigateToYandexMarket() {
        user.yandexMainSteps.clickMarketLink();
    }

    @When("кликаем ссылку Электроника")
    public void navigateToElectronic() {
        user.marketSteps.clickElectronicLink();
    }

    /*@When("отмечаем чекбоксы с брендами")
    public void selectCheckBoxesBdd(List<String> checkBoxesTv) {
        user.searchAdvancedSteps.selectCheckBoxes(checkBoxesTv);
    }*/

    @Then("проверяем, что количество элементов на странице равно $elementsQuantityTv")
    public void checkElementsQuantityBdd(int elementsQuantityTv) throws InterruptedException {
        //user.searchAdvancedSteps.checkElementsQuantity(elementsQuantity);
        assertTrue( "Неверное кол-во элементов", user.searchAdvancedSteps.checkElementsQuantity(elementsQuantityTv) );
        //Thread.sleep(2000);
    }


    // здесь надо сделать методы и дать им аннотации человеческие, которые вызывают методы степов

}
