package yandexTest5.at;

import org.jbehave.core.annotations.When;
import ru.aplana.kapitanskiyYandexTest.helpers.DbConnection;
import ru.aplana.kapitanskiyYandexTest.steps.bdd.BddSteps;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * Created by AKapitanskiy on 17.10.2016 13:26.
 */

public class EarphonesSteps extends BddSteps {

    private final String product = "Наушники";
    String[] dbRequest = DbConnection.takeProductPropertiesSqlRequest(product);
    List<String> brands = takeBrands(dbRequest);


    @When("переход в расширенный поиск Наушники")
    public void navigateToEarphonesAdvanced() {
        user.electronicSteps.clickEarphonesLink();
        user.earPhoneSteps.clickAdvancedSearchLink();
    }

    @When("вводим цену из базы в расширенном поиске")
    public void inputPriceBdd() {
        user.searchAdvancedSteps.inputPrice( dbRequest[0] );
    }

    @When("отмечаем чекбоксы с брендами уши")
    public void selectCheckBoxesBdd() {
        user.searchAdvancedSteps.selectCheckBoxes(brands);
    }

    @When("кликаем кнопку применить")
    public void clickApplyButtonBdd() {
        user.searchAdvancedSteps.clickApplyButton();
    }

    /*@Then("проверяем, что количество элементов на странице равно $elementsQuantity")
    public void checkElementsQuantityBdd(int elementsQuantity) throws InterruptedException {
        //user.searchAdvancedSteps.checkElementsQuantity(elementsQuantity);
        assertTrue( "Неверное кол-во элементов", user.searchAdvancedSteps.checkElementsQuantity(elementsQuantity) );
        //Thread.sleep(2000);
    }*/

    @When("запоминаем первый найденный элемент")
    public void takeFirstElementBdd() throws InterruptedException {
        Thread.sleep(1000);
        //user.searchAdvancedSteps.takeFirstElement();
        String s = user.searchAdvancedSteps.takeFirstElement();
        titleMap.put("firstElementTitle", s);
    }

    @When("вводим в строку поиска то, что запомнили")
    public void inputToHeaderSearchBdd() {
        user.searchAdvancedSteps.inputToHeaderSearch( titleMap.get("firstElementTitle") );
    }

    @When("берём найденный элемент и сравниваем c запомненным")
    public void checkFoundElementBdd() throws InterruptedException {
        assertTrue( "Элементы не эквивалентны", user.searchAdvancedSteps.checkFoundElement( titleMap.get("firstElementTitle") ) );
    }
}
