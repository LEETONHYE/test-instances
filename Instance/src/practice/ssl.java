package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ssl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ssl certificates
		
		//Desired capabilities
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.accetInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//helps to your local browser
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(c);
		
		
	}

}
