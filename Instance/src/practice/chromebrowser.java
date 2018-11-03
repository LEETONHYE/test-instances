package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("This is");
		driver.findElement(By.name("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.cssSelector("input#u_0_2")).click();
		
	}

}
