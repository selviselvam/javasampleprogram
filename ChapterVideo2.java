package com.interview.pgms;

public class ChapterVideo2 {
public String videoName;
public ChapterVideo2(String str) {
	videoName = str;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChapterVideo2 obj1 = new ChapterVideo2("one");
		ChapterVideo2 obj2 = new ChapterVideo2("one");
		String s1 = new String("one");
		String s2 = new String("one");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
	}

}
