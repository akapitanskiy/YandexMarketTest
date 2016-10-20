package stories;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by AKapitanskiy on 05.10.2016 17:44.
 */

public class TestParent {
    protected WebDriver driver;
    protected String baseUrl;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", workingDir + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.yandex.ru/";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //System.out.println("++++++++++++++++++++++++++++++++++++++before");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        //System.out.println("++++++++++++++++++++++++++++++++++++++after");
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean checkElementsQuantity(int quantity) throws Exception {

        driver.findElement(By.xpath("//button[./span[text()='Применить']]")).click();
        Thread.sleep(3000);
        List<WebElement> webElements;
        //webElements = driver.findElements(By.cssSelector("span.snippet-list_type_vertical"));
        webElements = driver.findElements(By.xpath("//span[@class='snippet-card__header-text']"));
        //System.out.println(webElements.size());
        boolean b = ( quantity == webElements.size() );
        return b;
    }


    public void goToElectronic() throws Exception {
        driver.get("https://www.yandex.ru/");
        driver.manage().window().maximize();
        WebElement marketLink = driver.findElement(By.linkText("Маркет"));
        marketLink.click();
        driver.findElement(By.linkText("Электроника")).click();
    }


    public boolean checkFirstElement() throws Exception {
        String firstElement = driver.findElement(By.cssSelector("span.snippet-card__header-text")).getText();
        //Thread.sleep(3000);
        driver.findElement(By.id("header-search")).click();
        driver.findElement(By.id("header-search")).clear();
        driver.findElement(By.id("header-search")).sendKeys(firstElement);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String elementToChek = driver.findElement(By.cssSelector("h1.title.title_size_22")).getText();
        boolean b = firstElement.equals(elementToChek);
        return b;
    }

    public void goToAdvancedSearch() throws Exception {
        driver.findElement(By.linkText("Расширенный поиск →")).click();
    }

    public void goToPrice() throws Exception {
        driver.findElement(By.id("glf-pricefrom-var")).click();
        driver.findElement(By.id("glf-pricefrom-var")).clear();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

}
