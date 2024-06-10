package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public By audioPost = By.xpath("//a[text()='Audio post']");
	public By playBtn = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
	public By pauseBtn = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-pause']");
	
	
	public By melodySlider = By.cssSelector("span[role='slider']");
	//public By melodySlider = By.cssSelector("span[class='mejs-time-handle']");
	
	//public By melodySlider = By.cssSelector("span[style*='transform: translateX']");
	
	
		
	public By volumeSlider = By.cssSelector("a[role='slider']");
	
	
	 
	
	
}
