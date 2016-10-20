package stories;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTv extends TestParent {
    /*private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();*/
    private int elementsQuantity = 12;

    @Test
    public void testTV() throws Exception {
        goToElectronic();
        driver.findElement(By.linkText("Телевизоры")).click();
        goToAdvancedSearch();
        goToPrice();
        driver.findElement(By.id("glf-pricefrom-var")).sendKeys("20000");
        driver.findElement(By.id("glf-1801946-1871499")).click();
        driver.findElement(By.id("glf-1801946-1871447")).click();
        assertTrue( "Неверное кол-во элементов", checkElementsQuantity(elementsQuantity) );
        //Thread.sleep(2000);
        assertTrue( "Элементы не эквивалентны", checkFirstElement() );
    }
}
