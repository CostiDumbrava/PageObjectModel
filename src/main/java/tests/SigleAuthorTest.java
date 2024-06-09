package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import page.objects.SingleAuthorPage;
import selenium.utils.BaseTest;

public class SigleAuthorTest extends BaseTest {
		
	@Test
	public void percentageTest() {
	SingleAuthorPage singleAuthPage = new SingleAuthorPage(driver);
	
	singleAuthPage.click(singleAuthPage.singleAuthorLink);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.elementToBeClickable(singleAuthPage.dramaPercentage));
	assertEquals(singleAuthPage.getElementText(singleAuthPage.dramaPercentage),"95%");
	
	wait.until(ExpectedConditions.elementToBeClickable(singleAuthPage.biographyPercentage));
	assertEquals(singleAuthPage.getElementText(singleAuthPage.biographyPercentage),"75%");
	
	wait.until(ExpectedConditions.elementToBeClickable(singleAuthPage.cookbooksPercentage));
	assertEquals(singleAuthPage.getElementText(singleAuthPage.cookbooksPercentage),"82%");
	
	}

}
