package stories;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

/**
 * Created by AKapitanskiy on 07.10.2016 13:15.
 */

public class TestEarPhone extends TestParent {
    /*private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();*/
    private int elementsQuantity = 12;

    @Test
    public void testEarPhone() throws Exception {
        goToElectronic();
        String urlToOpen = driver.getCurrentUrl();
        //driver.get(url);
        //Thread.sleep(4000);

        // открываем новую вкладку с urlToOpen
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.get(urlToOpen);
        /* driver.navigate().to(url); - делает тоже самое что и строка выше */

        //String s = driver.findElement(By.linkText("Наушники и Bluetooth-гарнитуры")).getAttribute("class");
        // <a class="link catalog-menu__list-item metrika i-bem metrika_js_inited" href="/catalogmodels.xml?hid=90555&CAT_ID=119075&nid=56179&track=
        // fr_ctlg" onclick="return {"metrika":{"onClick":{"catalogNavigation":{"place":"MID"}}}}">Наушники и Bluetooth-гарнитуры</a>
        // s равна link catalog-menu__list-item metrika i-bem metrika_js_inited
        //System.out.println(s);
        driver.findElement(By.linkText("Наушники и Bluetooth-гарнитуры")).click();
        goToAdvancedSearch();
        goToPrice();
        driver.findElement(By.id("glf-pricefrom-var")).sendKeys("5000");
        //Thread.sleep(2000);
        driver.findElement(By.id("glf-1801946-8455647")).click();
        assertTrue( "Неверное кол-во элементов", checkElementsQuantity(elementsQuantity) );
        //Thread.sleep(2000);
        assertTrue( "Элементы не эквивалентны", checkFirstElement() );
        // закрываем окно со всеми вкладками и выходим из экземпляра драйвера
    }
}
