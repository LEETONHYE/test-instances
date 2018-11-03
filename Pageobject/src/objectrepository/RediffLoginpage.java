package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		this.driver = driver;
	}
	
	//test-area objectized -(By path)
	By username=By.xpath("//input[@id='login1']");
	By password=By.id("password");
	By go=By.xpath("//input[@title='Sign in']");
	By Home=By.linkText("Home");
	
	public WebElement EmailId() {
		return driver.findElement(username);
		}
	
	public WebElement Password() {
		return driver.findElement(password);
		}
	
	public WebElement submit() {
		return driver.findElement(go);
		}
	
	public WebElement Home() {
		return driver.findElement(Home);
		}
	
	
	
}
