package ru.aplana.kapitanskiyYandexTest.pages;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import ru.aplana.kapitanskiyYandexTest.steps.UserSteps;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

/**
 * Created by AKapitanskiy on 10.10.2016 14:07.
 */

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(driver = "firefox")
    public static WebDriver driver;
    protected final String baseUrl = "https://www.yandex.ru/";

    @Steps
    public UserSteps user;

    @Before
    public void openYandexMainPage() {
        user.navigateTo(baseUrl);
        user.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        Thread.sleep(6000);
    }
}
