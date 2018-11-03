package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;
import objectrepository.RediffLoginpagePF;

public class Loginapplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpagePF rd=new RediffLoginpagePF(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("hello");
		rd.submit().click();
		rd.Home().click();
		RediffHomepage red=new RediffHomepage(driver);
		red.TT().click();
		red.Search().sendKeys("hello");
		red.Submit().click();
		
		
	}
	
	
	
	
	
	
}
