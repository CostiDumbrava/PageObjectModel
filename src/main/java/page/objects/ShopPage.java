package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
		
	}

	 public By sortingDropdown = By.name("orderby");
	 public By priceSliderLeft = By.xpath("//span[@style='left: 0%;']");
	 public By priceSliderRight = By.xpath("//span[@style='left: 100%;']");
	 
	 
	 //homework
	    public By searchBtn = By.cssSelector("div[class='top_panel_middle'] button[class='search_submit icon-search']");
		public By searchText = By.cssSelector("div[class='top_panel_middle'] input[class='search_field']");
		public By selectBook = By.cssSelector("h6[class='post_title'] a[href='https://keybooks.ro/shop/the-wicked-king/']");
		public By category = By.cssSelector("div[class='product_meta'] a[href='https://keybooks.ro/product-category/new-releases/']");
		public By productID = By.cssSelector("span[class='product_id']");
		
		public By magnifier = By.cssSelector("div[class='page_content_wrap page_paddings_yes'] a[class='woocommerce-product-gallery__trigger']");
		public By Img1 = By.cssSelector("ol[class='flex-control-nav flex-control-thumbs'] > li:nth-child(1) > img[src*='King1-100x100.png']");
		public By Img2 = By.cssSelector("ol[class='flex-control-nav flex-control-thumbs'] > li:nth-child(2) > img[src*='King3-100x100.png']");
		public By Img3 = By.cssSelector("ol[class='flex-control-nav flex-control-thumbs'] > li:nth-child(3) > img[src*='King4-100x100.png']");
		public By Img4 = By.cssSelector("ol[class='flex-control-nav flex-control-thumbs'] > li:nth-child(4) > img[src*='King2-100x100.png']");
		public By textImg = By.cssSelector("div[role='dialog'] div[class='pswp__caption'] div[class='pswp__caption__center']");
		public By closeBtn = By.cssSelector("div[role='dialog'] button[class='pswp__button pswp__button--close']");
		
		  public void title (String bookname) {
			 driver.findElement(searchBtn).click();		 
			 sendKeys(searchText,bookname);
				
				}
	 //homework
	 
	 
		  
	
	public void selectByValue(String value) {
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		select.selectByValue(value); // value="popularity" spre exemplu, poate fi si ByIndex(adica pozitia din lista de valori) sau ByVisibleText (adica textul dintre tag-uri:Sort by popularity spre ex.)
	
	}
	
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
	
	public void selectByVisibleText(String visisbleText) {
		WebElement element = driver.findElement(sortingDropdown);
		Select select = new Select(element);
		select.selectByValue(visisbleText); 
	}

	 public String getSelectOption() {
		 WebElement element = driver.findElement(sortingDropdown);
			Select select = new Select(element); 
			return select.getFirstSelectedOption().getText();
		 
	 }      
	 
	
	
}
