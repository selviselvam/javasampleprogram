package com.interview.pgms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraListNthfind {

	public static void main(String args[]) {
		
		List<String> namedList = new ArrayList<String>();
		namedList.add("india");
		namedList.add("india1");
		namedList.add("india2");
		namedList.add("india3");
		namedList.add("india4");
		namedList.add("india5");
		namedList.add("india6");
		namedList.add("india7");
		
		System.out.println("The 6th element from the list is :"+namedList.get(6));
		//List<Integer> list2 = list.stream().takenth(3).collect(Collectors.toList());
		
		System.out.println("Using stream opreatoin:"+namedList.stream().collect(Collectors.toList()).get(6));
	}
}
