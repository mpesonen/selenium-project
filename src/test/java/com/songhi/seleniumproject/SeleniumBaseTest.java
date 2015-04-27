package com.songhi.seleniumproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBaseTest {
	
	public Properties props;
	public WebDriver driver;
	int implicitWaitTime = 10;
	
	public SeleniumBaseTest() throws IOException
	{
		props = new Properties();
		String fileName = "target/classes/config.properties";
		props.load(new FileInputStream(fileName));
	}
	
	@Before
	public void setupSelenium() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDownSelenium()
	{
		driver.quit();
	}
	
	public String getKey(String propertyKey)
	{
		return props.getProperty(propertyKey);
	}

}
