package com.interview.pgms;

import java.util.Arrays;

public class ArrayPgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] numers = {1,2,5,2,4,6,8,3,10}; 
		  Arrays.sort(numers);
		  System.out.println(Arrays.toString(numers));
		 
       String[] familyName = {"Bobby","Selvi","Amaresh","Arun","Aswin","pappa","sadiayan"};
      // Arrays.sort
		/*
		 * int[] ints = {11367, 11358, 11421, 11530, 11491, 11218, 11789};
		 * Arrays.sort(ints); System.out.println(Arrays.toString(ints));
		 */
       String temp = "";
       for(int i = 0;i < familyName.length-1;i++ ) {
    	   System.out.println(familyName[i]);
    	   
    	   for(int j = i+1; j <familyName.length;j++ ) {
    		   if(familyName[i].compareTo(familyName[j])>0) {
    			   
    		   }
    	   }
       }
	}

}
