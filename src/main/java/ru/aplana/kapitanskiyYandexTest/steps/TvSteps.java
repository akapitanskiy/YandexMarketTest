package ru.aplana.kapitanskiyYandexTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.kapitanskiyYandexTest.pages.TvPage;

/**
 * Created by AKapitanskiy on 12.10.2016 14:01.
 */

public class TvSteps extends ScenarioSteps {

    public TvSteps(Pages pages) {
        super(pages);
    }

    private TvPage onTvPage() {
        return pages().get(TvPage.class);
    }

    @Step
    public void clickAdvancedSearchLink() {
        onTvPage().TVsAdvancedSearchLink.click();
    }

}
