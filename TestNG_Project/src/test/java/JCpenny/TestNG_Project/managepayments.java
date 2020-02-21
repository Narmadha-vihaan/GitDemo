package JCpenny.TestNG_Project;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.paymentpage;
import resource.base;

public class managepayments extends base{
	@BeforeTest (groups= {"smoke"})
	//(dataProvider="logindata")
		public void initilizingbrowser() throws IOException
	{
		driver = initializewebdriver();
		String url=prop.getProperty("URL");
		driver.get(url);
	}

	
	@Test(groups= {"smoke"})
	public void payments()
	{
		String user=prop.getProperty("login");
		String password=prop.getProperty("pwd");
		
		Landingpage L=new Landingpage(driver); 
		L.username().sendKeys(user);
		L.password().sendKeys(password);
		L.loginbtn().click();
		paymentpage p=new paymentpage(driver);
		p.paymentoption().click();
		p.make_payment().click();
		System.out.println(p.minimum_amount().getText());
		
		
		
	}
	@AfterTest (groups= {"smoke"})

	public void closing()
	{
		driver.close();
	}
}
