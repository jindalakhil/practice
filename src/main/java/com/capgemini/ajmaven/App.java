package com.capgemini.ajmaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
	    Log.info("bye");
	    Log.info("hi");
	    Log.info("test");
	    Log.info("aaaa");
	    Log.info("feature-demo branch");
	    Log.info("made conflict");
        System.out.println( "Hello World!" );
    }
}
