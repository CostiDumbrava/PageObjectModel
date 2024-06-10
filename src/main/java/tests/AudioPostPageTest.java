package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import page.objects.AudioPostPage;
import page.objects.LoginPage;
import page.objects.MenuPage;
import page.objects.ShippingAddressPage;
import page.objects.ShopPage;
import page.objects.SingleAuthorPage;
import selenium.utils.BaseTest;
import selenium.utils.SeleniumWrappers;

public class AudioPostPageTest extends BaseTest {
	
	@Test
	public void dragAndDropAudio() throws InterruptedException {
		
		MenuPage menuPage= new MenuPage(driver);
		menuPage.hoverElement(menuPage.blogLink);
		Thread.sleep(3000);
		menuPage.click(menuPage.postFormats);
		
		
		AudioPostPage audioPostPage = new AudioPostPage(driver);
		
		
		audioPostPage.click(audioPostPage.audioPost);
		audioPostPage.click(audioPostPage.playBtn);
		audioPostPage.click(audioPostPage.pauseBtn);
		
		Thread.sleep(2000);
		
		audioPostPage.dragAndDrop(audioPostPage.melodySlider,100, 0); // am incercat mai multi locatori, dar nu functioneaza cum ar trebui in functie de numarul de pixeli
		
		Thread.sleep(2000);
		audioPostPage.dragAndDrop(audioPostPage.volumeSlider,50, 0);
		
		Thread.sleep(3000);
		
		}
		
		
	}

	

