package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import page.objects.MenuPage;
import selenium.utils.BaseTest;

public class DataProviderClassHome extends BaseTest {
	
	
	@DataProvider
	public Object[][] booksDataProviderHome(){
		
		Object[][] data = new Object[4][2]; // sunt 4 carti cu 2 atribute - URL si categoria Romans pentru fiecare
		
		data[0][0]= "https://keybooks.ro/shop/a-banquet-of-mouse/";
		data[0][1]= "Romans";
		
		data[1][0]= "https://keybooks.ro/shop/life-in-the-garden/";
		data[1][1]= "Romans";
		
		data[2][0]= "https://keybooks.ro/shop/lonely-man-in-white-hat/";
		data[2][1]= "Romans";
		
		data[3][0]= "https://keybooks.ro/shop/the-son/";
		data[3][1]= "Romans";

		return data;
		
	}

		@Test(dataProvider =  "booksDataProviderHome")
		public void searchAndAssertBookCategories(String bookURL, String bookCategories) throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.click(menu.shopLink);
		menu.scrollVertically(800);
		jse.executeScript("window.location='https://keybooks.ro/product-category/romans/'");
		
		Thread.sleep(3000);
		
		WebElement book = driver.findElement(By.cssSelector("h2>a[href='" +bookURL+ "']"));
			
		book.click();
		
		WebElement title = driver.findElement(By.cssSelector("h1[class='product_title entry-title']")); 
		String sTitle = title.getText();
		
	    sTitle = sTitle.toLowerCase(); 
	    sTitle = sTitle.replace(' ','-');  
	    
	    //System.out.println(sTitle);
	    
	    //System.out.println(bookURL.contains(sTitle));
	    assertTrue(bookURL.contains(sTitle));
	   
	    	
		WebElement categories = driver.findElement(By.xpath("//span//a[(text()='" +bookCategories+ "')]"));
		
	    
	}
}
