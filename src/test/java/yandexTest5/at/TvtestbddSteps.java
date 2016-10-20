package yandexTest5.at;

import org.jbehave.core.annotations.When;
import ru.aplana.kapitanskiyYandexTest.helpers.JDBCExample;
import ru.aplana.kapitanskiyYandexTest.steps.bdd.BddSteps;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * Created by AKapitanskiy on 17.10.2016 17:34.
 */

public class TvtestbddSteps extends BddSteps {

    private final String product = "Телевизоры";
    String[] dbRequest = JDBCExample.sqlRequest(product);
    List<String> brands = takeBrands(dbRequest);

    @When("переход в расширенный поиск Телевизоры")
    public void navigateToTvsAdvanced() {
        user.electronicSteps.clickTVsLink();
        user.tvSteps.clickAdvancedSearchLink();
    }

    @When("вводим цену тв в расширенном поиске")
    public void inputPriceBdd() {
        user.searchAdvancedSteps.inputPrice(dbRequest[0]);
    }

    @When("отмечаем чекбоксы с брендами Tv")
    public void selectCheckBoxesBdd() {
        user.searchAdvancedSteps.selectCheckBoxes(brands);
    }

    /*@When("кликаем кнопку применить")
    public void clickApplyButtonBdd() {
        user.searchAdvancedSteps.clickApplyButton();
    }*/

    /*@Then("проверяем, что количество элементов на странице равно $elementsQuantityTv")
    public void checkElementsQuantityBdd(int elementsQuantityTv) throws InterruptedException {
        //user.searchAdvancedSteps.checkElementsQuantity(elementsQuantity);
        assertTrue( "Неверное кол-во элементов", user.searchAdvancedSteps.checkElementsQuantity(elementsQuantityTv) );
        //Thread.sleep(2000);
    }*/

    @When("запоминаем ТВ первый найденный элемент")
    public void takeFirstElementBdd() throws InterruptedException {
        Thread.sleep(1000);
        //user.searchAdvancedSteps.takeFirstElement();
        String s = user.searchAdvancedSteps.takeFirstElement();
        titleMap.put("firstTvElementTitle", s);
    }

    @When("вводим в строку поиска ТВ то, что запомнили")
    public void inputToHeaderSearchBdd() throws InterruptedException {
        Thread.sleep(1000);
        user.searchAdvancedSteps.inputToHeaderSearch( titleMap.get("firstTvElementTitle") );
    }

    @When("берём найденный ТВ элемент и сравниваем два элемента на равенство")
    public void checkFoundElementBdd() throws InterruptedException {
        assertTrue( "Элементы не эквивалентны", user.searchAdvancedSteps.checkFoundElement( titleMap.get("firstTvElementTitle") ) );
    }

}
