package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	public WebDriver driver;
	private By welcomeuser=By.cssSelector("div.myCardContainer.without_multiaccount>h1");
	
	
	public homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public WebElement wuser()
	{
		return driver.findElement(welcomeuser);
	}
	
	
	
	
	
	

}
