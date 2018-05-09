package qsq.gittest;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		

public class AppTest {
    
	protected WebDriver driver;
	@Test
	public void testApp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Alex/eclipse-workspace/gittest/resources/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
		driver.get("http://www.guru99.com/");
		//driver.manage().window().maximize();
		aTitle = driver.getTitle();
		if (aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		driver.close();
		}
}
    