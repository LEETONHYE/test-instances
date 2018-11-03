package Beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Alpha.Demo;

public class Demo1 {
	
	private static Logger Log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Log.debug("gone with wind");
		Log.info("pride and prejudice");
		Log.error("football is not soccer");
		Log.fatal("I am kidding");	

	}

}
