package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class SingleAuthorPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
		
	}

	public By dramaPercentage = By.cssSelector("div[data-stop='95']");
	public By biographyPercentage =By.cssSelector("div[data-stop='75']");
	public By cookbooksPercentage = By.cssSelector("div[data-stop='82']");
}
