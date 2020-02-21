package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class paymentpage {
	
	public WebDriver driver;
	private By payment=By.xpath("//a[text()='Payments']");
	private By makepayment=By.xpath("//a[text()='View and Make Payments']");
	private By minamount=By.cssSelector("p.mBottom10");
	
	
	public paymentpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


	public WebElement paymentoption()
	{
		return driver.findElement(payment);
	}
	
	public WebElement make_payment()
	{
		return driver.findElement(makepayment);
	}
	
	public WebElement minimum_amount()
	{
		return driver.findElement(minamount);
	}
	

}
