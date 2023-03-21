package com.Constructor;

public class Television {

	String z="Channel";
	String y="Name";
	char x=':';
	
	public Television(int a, String b) {
		System.out.println(this.z+this.y+this.x);	
		System.out.println(a + " " + b);
	}

	public Television(float c) {
		System.out.print(c);
	}
	public Television(String d) {
		System.out.println(d);
	}
	public static void main(String[] args) {
		Television t = new Television(1, "Star Vijay");
		Television u = new Television(194.56f);
		Television v = new Television("Hz");
	}
	
	
	
}
