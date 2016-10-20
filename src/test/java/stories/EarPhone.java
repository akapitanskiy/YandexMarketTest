package stories;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class EarPhone {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://www.yandex.ru/");
		selenium.start();
	}

	@Test
	public void testEarPhone() throws Exception {
		selenium.open("https://www.yandex.ru/");
		selenium.click("link=Маркет");
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Электроника", "");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Наушники и Bluetooth-гарнитуры");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Расширенный поиск →");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=glf-pricefrom-var");
		selenium.type("id=glf-pricefrom-var", "5000");
		selenium.click("id=glf-1801946-8455647");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=(//button[@type='button'])[4]");
		selenium.waitForPageToLoad("30000");
		String EarPhone1 = selenium.getText("css=span.snippet-card__header-text");
		selenium.click("id=header-search");
		selenium.click("id=header-search");
		selenium.type("id=header-search", EarPhone1);
		selenium.click("//button[@type='submit']");
		selenium.waitForPageToLoad("30000");
		// selenium.();
		selenium.click("id=glf-pricefrom-var");
		selenium.type("id=glf-pricefrom-var", "5000");
		selenium.clickAt("id=glf-1801946-8455647", "");
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("xpath=(//button[@type='button'])[5]", "");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
