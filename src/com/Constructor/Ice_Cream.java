package com.Constructor;

public class Ice_Cream {
	
	public Ice_Cream() {
		this("Rs.", 499.99f);
	System.out.println("Thank You");
	}
	public Ice_Cream(String b) {
		System.out.println(b);
	}
	public Ice_Cream(int d, String e) {
		this("Vanilla");
	System.out.println(d+""+e);
	}
	public Ice_Cream(String f, int g, String h) {
		this(1000, "ml");
		System.out.println(f+""+g+""+h);
	}
	public Ice_Cream(String i, float j) {
		this("with", 150, "grams of chocolate syrup");
		System.out.println(i+""+j);
	}
	public static void main(String[] args) {
		Ice_Cream a = new Ice_Cream();
	}
	
}
