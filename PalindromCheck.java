package com.interview.pgms;

import java.util.Scanner;

public class PalindromCheck {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revers = "";
        System.out.println("The total string:"+A.length());
        for(int i = A.length()-1; i >= 0; i--){
        	System.out.println(A.charAt(i));
           revers = revers+ A.charAt(i);
           
        }
        System.out.println("reversed string:"+revers);
        if(A.equals(revers)){
            System.out.println("Its an palindrome");
        }else{
            System.out.println("Its not an palindrome");
        }
        /* Enter your code here. Print output to STDOUT. */
        
    }

}
