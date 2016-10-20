package stories.PageObjSerenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.aplana.kapitanskiyYandexTest.pages.*;
import ru.aplana.kapitanskiyYandexTest.steps.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by AKapitanskiy on 10.10.2016 16:41.
 */

@RunWith(SerenityRunner.class)
public class TestTvPO extends BaseTest {

    private final int elementsQuantity = 12;
    private final String tvsPrice = "20000";
    private final String[] brands = {"Samsung", "LG"};

    @Title("TC-01. Проверка раширенного поиска 'Телевизоры и плазменные панели' на Яндекс.маркет")
    @Test
    public void tvTest() throws Exception {

        user.yandexMainSteps.clickMarketLink();
        user.marketSteps.clickElectronicLink();
        user.electronicSteps.clickTVsLink();
        user.tvSteps.clickAdvancedSearchLink();
        user.searchAdvancedSteps.inputPrice(tvsPrice);
        //user.searchAdvancedSteps.selectCheckBoxes(brands);
        user.searchAdvancedSteps.clickApplyButton();
        assertTrue( "Неверное кол-во элементов", user.searchAdvancedSteps.checkElementsQuantity(elementsQuantity) );
        /*String firstElementString = user.searchAdvancedSteps.takeFirstElement();
        user.searchAdvancedSteps.inputToHeaderSearch(firstElementString);
        assertTrue( "Элементы не эквивалентны", user.searchAdvancedSteps.checkFoundElement(firstElementString) );*/
    }


}
