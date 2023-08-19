package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;
import Pages.RSAHomePage;

public class HomePageTest extends Base
{

	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initalizeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc1()
	{
		RSAHomePage hp=new RSAHomePage(driver);
		hp.radio1().click();
		System.out.println(driver.getTitle());  
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
