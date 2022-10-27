package com.AutomationTalks.demoProject1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\j_end\\OneDrive\\1\\SeleniumTraining\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("launchDriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		
		driver.navigate().to("http://www.espn.com");
		System.out.println("Test launchDriver is " + driver.getTitle());
				
	}
	@Test
	public void Test2() {

		driver.navigate().to("http://www.google.com");
		System.out.println("Test launchDriver is " + driver.getTitle());
		
	}
	@AfterMethod
	public void quit() {
	
		driver.quit();
	}

}
