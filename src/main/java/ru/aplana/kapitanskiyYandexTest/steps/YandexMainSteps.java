package ru.aplana.kapitanskiyYandexTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;
import ru.aplana.kapitanskiyYandexTest.pages.MarketPage;
import ru.aplana.kapitanskiyYandexTest.pages.YandexMainPage;

/**
 * Created by AKapitanskiy on 10.10.2016 18:01.
 */

public class YandexMainSteps extends ScenarioSteps {

    public YandexMainSteps(Pages pages) {
        super(pages);
    }

    private YandexMainPage onYandexMainPage() {
        return pages().get(YandexMainPage.class);
    }

    @Step
    public void clickMarketLink() {
        onYandexMainPage().marketLink.click();
    }
}
