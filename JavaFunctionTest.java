package com.interview.pgms;

import java.util.function.Function;

public class JavaFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Function<String,Integer>  funObj =  x -> x.length();
      Integer lenValue = funObj.apply("Selvi");
      System.out.println(lenValue);
      
	}

}
