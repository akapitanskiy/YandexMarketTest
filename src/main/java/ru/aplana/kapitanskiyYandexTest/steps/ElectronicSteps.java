package ru.aplana.kapitanskiyYandexTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.kapitanskiyYandexTest.pages.ElectronicPage;

/**
 * Created by AKapitanskiy on 12.10.2016 14:03.
 */

public class ElectronicSteps extends ScenarioSteps {

    public ElectronicSteps(Pages pages) {
        super(pages);
    }

    private ElectronicPage onElectronicPage() {
        return pages().get(ElectronicPage.class);
    }

    @Step
    public void clickEarphonesLink() {
        onElectronicPage().earPhonesLink.click();
    }

    @Step
    public void clickTVsLink() {
        onElectronicPage().TVsLink.click();
    }


}
