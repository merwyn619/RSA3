package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public Properties prop;
	public WebDriver driver;
	
	public WebDriver initalizeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
				"/src/test/java/resources/data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.contains("chrome"))
		{
//			System.setProperty(webcdriver.chrome.driver, System.getProperty("user.dir")+
//					"\\src\\main\\java\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.contains("firefox"))
     	{
//			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+
//					"\\src\\main\\java\\resources\\firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.contains("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+
					"\\src\\main\\java\\resources\\edgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	}
	
}
