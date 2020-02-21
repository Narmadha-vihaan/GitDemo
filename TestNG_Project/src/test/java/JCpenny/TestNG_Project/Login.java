package JCpenny.TestNG_Project;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import pageObjects.Landingpage;
import pageObjects.homepage;
import resource.base;

public class Login extends base {
	
	
	
	@BeforeTest 
	//(dataProvider="logindata")
		public void initilizingbrowser() throws IOException
	{
		driver = initializewebdriver();
		String url=prop.getProperty("URL");
		driver.get(url);
	}
	
	@Test
	public void home() throws IOException
	{
		
		
		String user=prop.getProperty("login");
		String password=prop.getProperty("pwd");
		
		Landingpage L=new Landingpage(driver); 
		L.username().sendKeys(user);
		L.password().sendKeys(password);
		L.loginbtn().click();
		
		homepage H=new homepage(driver); 
		String actual=H.wuser().getText();
			
		
		
		if (actual.contains(user))
		{
			System.out.println("Test case passed");
		}
		
		else 
		{
			System.out.println("Test case failed");
			
		}
		
	
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Narmadha//screenshot.png"));			
			
	}
	



/*@DataProvider

public Object logindata()

{
	
	
	Object[][]data=new Object[2][2];
	
	data[0][0]="Narmadha";
	data[0][1]="Mahati4";
	data[1][0]="Senthil";
	data[1][1]="Vihaan";
	
	return data;
				
			
	
			
}*/


@AfterTest

public void closing()
{
	driver.close();
}
}

