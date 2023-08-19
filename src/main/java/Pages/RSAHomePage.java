package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RSAHomePage {

	WebDriver driver;
	
	public RSAHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By radio1 = By.cssSelector("[value='radio1']");
	
	public WebElement radio1()
	{
		return driver.findElement(radio1);
	}
	
}
