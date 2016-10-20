package stories.PageObjSerenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.aplana.kapitanskiyYandexTest.pages.BaseTest;
import ru.aplana.kapitanskiyYandexTest.steps.UserSteps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by AKapitanskiy on 10.10.2016 13:17.
 */

@RunWith(SerenityRunner.class)
public class TestEarphonePO extends BaseTest {

    @ManagedPages
    public Pages pages;

    @Steps
    public UserSteps user;

    private final int elementsQuantity = 12;
    private final String earPhonesPrice = "5000";
    //private final List<String> brands = "Beats";

    @Before
    public void openYandexMainPage() {
        user.navigateTo(baseUrl);
        user.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Title("TC-02. Проверка раширенного поиска 'Наушники и Bluetooth-гарнитуры' на Яндекс.маркет")
    @Test
    public void earPhoneTest() throws InterruptedException {

        user.yandexMainSteps.clickMarketLink();
        user.marketSteps.clickElectronicLink();
        user.electronicSteps.clickEarphonesLink();
        user.earPhoneSteps.clickAdvancedSearchLink();
        user.searchAdvancedSteps.inputPrice(earPhonesPrice);
        //user.searchAdvancedSteps.selectCheckBoxes(brands);
        user.searchAdvancedSteps.clickApplyButton();
        assertTrue( "Неверное кол-во элементов", user.searchAdvancedSteps.checkElementsQuantity(elementsQuantity) );
        //String firstElementString = user.searchAdvancedSteps.takeFirstElement();
        //user.searchAdvancedSteps.inputToHeaderSearch(firstElementString);
        //assertTrue( "Элементы не эквивалентны", user.searchAdvancedSteps.checkFoundElement(firstElementString) );
    }

}
