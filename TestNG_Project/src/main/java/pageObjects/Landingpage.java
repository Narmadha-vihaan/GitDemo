package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	private By username =By.name("userName");
	private By password =By.name("password");
	private By login =By.id("secLoginBtn");
	
		

	

	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginbtn()
	
	{
		return driver.findElement(login);
	}
	
	

}

	

