package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class ShippingAddressPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public ShippingAddressPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	 public By sortingDropdownIndex = By.name("shipping_country"); 
	 public By sortingDropdownValue = By.name("shipping_state");
	 
	 
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(sortingDropdownIndex);
		Select select = new Select(element);
		select.selectByIndex(index);
}
	public String getSelectOptionIndex() {
		 WebElement element = driver.findElement(sortingDropdownIndex);
			Select select = new Select(element); 
			return select.getFirstSelectedOption().getText();
	}
	
	public void selectByValue(String value) {
		WebElement element = driver.findElement(sortingDropdownValue);
		Select select = new Select(element);
		select.selectByValue(value);
	
	}
	
	public String getSelectOptionValue() {
		 WebElement element = driver.findElement(sortingDropdownValue);
			Select select = new Select(element); 
			return select.getFirstSelectedOption().getText();
	}
	
}
	

