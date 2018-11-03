package Alpha;

import org.apache.logging.log4j.*;

public class Demo {

	
	private static Logger Log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log.debug("I have clicked on button");
		Log.info("Button is not displayed");
		Log.error("Button is not displayed");
		Log.fatal("button is missing");		
		
	}

}
