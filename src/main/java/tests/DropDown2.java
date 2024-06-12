package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import page.objects.MenuPage;
import page.objects.ShopPage;
import selenium.utils.BaseTest;

public class DropDown2 extends BaseTest {
	
	    @Test 
		public void selectByValueIndex() {
			MenuPage menuPage= new MenuPage(driver);
			menuPage.click(menuPage.shopLink);
			
			ShopPage shopPage= new ShopPage(driver);
			shopPage.selectByIndex(4);
			
			String low =shopPage.getElementText(shopPage.lowestPrice);
			StringBuilder lowSB = new StringBuilder(low);
			
						
			System.out.println(shopPage.getElementText(shopPage.lowestPrice));
			System.out.println(shopPage.getElementText(shopPage.highestPrice));
			
			lowSB.deleteCharAt(0);
	
			
			System.out.println("pret " +lowSB);
			
			//Double d = Double.parseDouble(low);
			
			//System.out.println("rezultat" +d);
			

}
}
