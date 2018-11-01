package com.maven.itfactory;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application itfactory");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application itfactory");
	     Application app = new Application();
    }
}