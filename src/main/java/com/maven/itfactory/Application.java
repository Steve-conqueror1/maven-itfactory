package com.maven.itfactory;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public int countWords(String words){
      String[] separateWords = StringUtils.split(words, ' ');
      return (separateWords == null)? 0: separateWords.length;
    }

    public Application() {
        System.out.println ("Inside Application itfactory");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application itfactory");
	     Application app = new Application();

       int count = app.countWords("i have four words");
       System.out.println("Word Count : "+ count);
    }
}