package ru.aplana.kapitanskiyYandexTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;
import ru.aplana.kapitanskiyYandexTest.pages.EarPhonePage;

/**
 * Created by AKapitanskiy on 12.10.2016 14:05.
 */

public class EarPhoneSteps extends ScenarioSteps {

    public EarPhoneSteps(Pages pages) {
        super(pages);
    }

    private EarPhonePage onEarPhonePage() {
        return pages().get(EarPhonePage.class);
    }

    @Step
    public void clickAdvancedSearchLink() {
        onEarPhonePage().earPhonesAdvancedSearchLink.click();
    }
}
