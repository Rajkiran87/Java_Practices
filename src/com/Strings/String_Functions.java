package com.Strings;

public class String_Functions {
	
	public static void main(String[] args) {
		
		String s = " Have a nice day ";
		String d="";
		//int i = 124;
		
		int length = s.length();
		System.out.println(length);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("jhgyf");
		System.out.println(equalsIgnoreCase);
		boolean equals = s.equals("kbsdbflnof");
		System.out.println(equals);
		boolean startsWith = s.startsWith("H");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("y");
		System.out.println(endsWith);
		int lastIndexOf = s.lastIndexOf("v");
		System.out.println(lastIndexOf);
		int indexOf = s.indexOf("v");
		System.out.println(indexOf);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		char charAt = s.charAt(13);
		System.out.println(charAt);
		String substring = s.substring(0);
		System.out.println(substring);
		boolean contains = s.contains("av");
		System.out.println(contains);
		String replace = s.replace('H', 'h');
		System.out.println(replace);
		boolean empty = d.isEmpty();
		System.out.println(empty);
		String[] split = s.split(s);
		System.out.println(s);
		String trim = s.trim();
		System.out.println(trim);
		String concat = s.concat("thank");
		System.out.println(concat);
		

		
	}

}
