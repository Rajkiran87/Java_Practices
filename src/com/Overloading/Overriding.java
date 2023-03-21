package com.Overloading;

public class Overriding extends Library {

	@Override
	public void books(float a, char y, String b) {
		System.out.println(1.5+" "+','+" "+"Hippo");
		super.books(a, y, b);
		}
	@Override
	public void books(String c, int d, String e) {
		
		super.books(c, d, e);
	}
	@Override
	public void books(String f, double g, String h) {
		
		super.books(f, g, h);
	}
	@Override
	public void books(String z) {
		System.out.println("India");
		System.out.println("Africa");
		super.books(z);
	}
	public static void main(String[] args) {
		Overriding o = new Overriding();
		o.books(2, ',',"Chindrella");
		o.books("William Wordsworth", 1992, "Publication");
			
		
	}
	
	
	
	
	
}
