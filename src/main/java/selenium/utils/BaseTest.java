package selenium.utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
public static WebDriver driver; //l am facut static pentru a avea un singur obiect, altfel cand s a facut mostenirea se pierde 

public JavascriptExecutor jse;
	
	@BeforeClass 
	public void setup() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // se adauga in Base Test si nu in @Test pentru ca e o actiune generala
		driver.get("https://keybooks.ro");
		jse = (JavascriptExecutor) driver;
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000); //pauza de 5sec executiei, este bad practice in testarea automata
		driver.quit();	
	}

}
