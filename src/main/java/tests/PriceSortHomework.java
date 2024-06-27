package tests;

import static org.testng.Assert.*;
import org.testng.Converter;
import org.testng.annotations.Test;

import page.objects.MenuPage;
import page.objects.ShopPage;
import selenium.utils.BaseTest;

public class PriceSortHomework extends BaseTest {
	
	    @Test 
		public void selectByValueIndex() {
			MenuPage menuPage= new MenuPage(driver);
			menuPage.click(menuPage.shopLink);
			
			ShopPage shopPage= new ShopPage(driver);
			shopPage.selectByIndex(4);
			
			String low =shopPage.getElementText(shopPage.lowestPrice);
			String high =shopPage.getElementText(shopPage.highestPrice);
		
			double d1=Double.parseDouble(shopPage.deleteCurrencyChar(low)); 
			double d2=Double.parseDouble(shopPage.deleteCurrencyChar(high)); 
			
			
			//boolean flag=false;
			//if (d1<d2) 
			//{flag = true;}
			//assertTrue(flag);
			
			 assertTrue(d1<d2? true: false);

}
}
