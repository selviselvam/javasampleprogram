package com.interview.pgms;

public class HibernateUtil {
private static HibernateUtil hibernateObj ;
private HibernateUtil() {
	
}
public static HibernateUtil getHibernatObj() {
	if(hibernateObj == null) {
		hibernateObj = new HibernateUtil();
	}
	return hibernateObj;
}
}
