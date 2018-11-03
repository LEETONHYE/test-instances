package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {

	WebDriver driver;
	public RediffHomepage(WebDriver driver) {
		this.driver = driver;
	}
	
		
	By TT=By.xpath("//div[@id='srch_show_hide_btn']");
	By search=By.xpath("//input[@id='srchword']");
	By submit=By.xpath("//input[@value='Search']");
	
	public WebElement TT() {
		return driver.findElement(TT);
	}
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement Submit() {
		return driver.findElement(submit);
	}
	
}
