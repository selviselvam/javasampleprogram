package com.interview.pgms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String>  memberNames = new ArrayList<String>();
    
    memberNames.add("Amitabh");
    memberNames.add("Shekhar");
    memberNames.add("Aman");
    memberNames.add("Amaresh");
    memberNames.add("Rahul");
    memberNames.add("Shahrukh");
    memberNames.add("Salman");
    memberNames.add("Yana");
    memberNames.add("Lokesh");
    //Adding Filter Functionality
     memberNames.stream().filter(e->e.startsWith("A")).collect(Collectors.toList())
    		.forEach(System.out::println);
  
    //Sorting the elements  		   			 
    memberNames.stream().sorted().filter(s->s.startsWith("A")).collect(Collectors.toList())
                 .forEach(System.out::println);
    
    //
    		
    
	}

}
