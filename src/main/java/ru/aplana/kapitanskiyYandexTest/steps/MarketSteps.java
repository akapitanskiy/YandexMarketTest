package ru.aplana.kapitanskiyYandexTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.kapitanskiyYandexTest.pages.MarketPage;
import ru.aplana.kapitanskiyYandexTest.pages.YandexMainPage;

/**
 * Created by AKapitanskiy on 12.10.2016 14:03.
 */

public class MarketSteps extends ScenarioSteps {

    public MarketSteps(Pages pages) {
        super(pages);
    }

    private MarketPage onMarketPage() {
        return pages().get(MarketPage.class);
    }

    @Step
    public void clickElectronicLink() {
        onMarketPage().electronicLink.click();
    }

}
