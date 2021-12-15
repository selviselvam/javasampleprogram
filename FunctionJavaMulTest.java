package com.interview.pgms;

import java.util.function.Function;

public class FunctionJavaMulTest {
public static void main(String args[]) {
	Function<String,Integer> func1 = x ->x.length();
	Function<Integer,Integer> func2 = x->x*2;
	 
	Integer result = func1.andThen(func2).apply("Amaresh");
	System.out.println("The result is :"+result);
}
}
