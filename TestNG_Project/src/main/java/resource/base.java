package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public  WebDriver driver;
	public Properties prop;
	public WebDriver initializewebdriver() throws IOException 
	{
				
		prop =new Properties();
		FileInputStream fls =new FileInputStream("C:\\Users\\Narmadha\\eclipse-workspace\\TestNG_Project\\src\\main\\java\\resource\\Data.properties");
		prop.load(fls);
		prop.getProperty("Browser");
			
		
		String browserName = prop.getProperty("Browser");
		
		
		//Chrome
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Senthil\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		//Firefox
		
		else if(browserName.contentEquals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Senthil\\Selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}		
		
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Narmadha//"+result+"screenshot.png"));
		
	}


	

}
