package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	WebDriver driver;
	public RediffLoginpagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//test-area objectized -(By path)
	/*By username=By.xpath("//input[@id='login1']");
	By password=By.id("password");
	By go=By.xpath("//input[@title='Sign in']");
	By Home=By.linkText("Home");*/
	
	
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@title='Sign in']")
	WebElement go;
	
	@FindBy(linkText="Home")
	WebElement Home;
	
	public WebElement EmailId() {
		return username;
		}
	
	public WebElement Password() {
		return password;
		}
	
	public WebElement submit() {
		return go;
		}
	
	public WebElement Home() {
		return Home;
		}
	
	
	
}
