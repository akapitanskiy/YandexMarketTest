package ru.aplana.kapitanskiyYandexTest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.kapitanskiyYandexTest.pages.SearchAdvancedPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by AKapitanskiy on 12.10.2016 11:08.
 */

public class UserSteps extends ScenarioSteps {
    //private static UserSteps INSTANCE = null;
    //private static final long serialVersionUID =

    public UserSteps(Pages pages){
        super(pages);
    }

    @Steps
    public EarPhoneSteps earPhoneSteps;

    @Steps
    public ElectronicSteps electronicSteps;

    @Steps
    public MarketSteps marketSteps;

    @Steps
    public SearchAdvancedSteps searchAdvancedSteps;

    @Steps
    public TvSteps tvSteps;

    @Steps
    public YandexMainSteps yandexMainSteps;



    @Step
    public void navigateTo(String url) {
        getDriver().get(url);
        getDriver().manage().window().maximize();
    }

    /*public static UserSteps getInstance() {
        if (INSTANCE == null){
            INSTANCE = new UserSteps();
        }
        return INSTANCE;
    }*/
    /*private YandexMainSteps yandexMainSteps = new YandexMainSteps();

    public YandexMainSteps getYandexMainSteps() {
        return yandexMainSteps;
    }*/
}
