package com.songhi.seleniumproject;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest extends SeleniumBaseTest {

	public GoogleSearchTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void canEnterGoogle()
	{
		System.out.println(props.getProperty("root.url"));
		driver.get(props.getProperty("root.url"));
		WebElement searchBox = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		assertEquals(getKey("expected.title"), driver.getTitle());
	}
	
	@Test
	public void canSearchGoogle()
	{
		driver.get(props.getProperty("root.url"));
		WebElement searchBox = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		searchBox.sendKeys("asdf\n");
		assertEquals(getKey("expected.title"), driver.getTitle());
	}
	
	@Test
	public void canGetResultFromGoogle()
	{
		driver.get(props.getProperty("root.url"));
		WebElement searchBox = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("lst-ib")));
		searchBox.sendKeys("asdf\n");
		assertEquals(getKey("expected.title"), driver.getTitle());
	}

}
