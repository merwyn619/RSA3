import java.time.Duration;

import org.openqa.selenium.By;

import coreJava.ChromeDriver;
import coreJava.WebDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Amit";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cheta\\OneDrive\\Documents\\A\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.cssSelector(".logout-btn")).click();
		
	}

}
