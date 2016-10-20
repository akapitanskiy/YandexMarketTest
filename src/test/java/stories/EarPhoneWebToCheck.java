package stories;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EarPhoneWebToCheck {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.yandex.ru/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEarPhone() throws Exception {
    driver.get("https://www.yandex.ru/");
    driver.findElement(By.linkText("Маркет")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [clickAt | link=Электроника | ]]
    driver.findElement(By.linkText("Наушники и Bluetooth-гарнитуры")).click();
    driver.findElement(By.linkText("Расширенный поиск →")).click();
    driver.findElement(By.id("glf-pricefrom-var")).click();
    driver.findElement(By.id("glf-pricefrom-var")).clear();
    driver.findElement(By.id("glf-pricefrom-var")).sendKeys("5000");
    driver.findElement(By.id("glf-1801946-8455647")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    String EarPhone1 = driver.findElement(By.cssSelector("span.snippet-card__header-text")).getText();
    driver.findElement(By.id("header-search")).click();
    driver.findElement(By.id("header-search")).click();
    driver.findElement(By.id("header-search")).clear();
    driver.findElement(By.id("header-search")).sendKeys(EarPhone1);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    String EarPhoneToChek = driver.findElement(By.cssSelector("h1.title.title_size_22")).getText();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
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
