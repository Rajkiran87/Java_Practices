package com.Overloading;

public class Library {
	public void books(String z) {
		System.out.println(z);
	}
	public void books(float a, char y, String b) {
		System.out.println(a+" "+y+" "+b);
	}
	public void books(String c, int d, String e) {
		System.out.println(c+" "+d+" "+e);
	}
	public void books(String f, double g, String h) {
		System.out.println(f+" "+g+" "+h);
	}
	public static void main(String[] args) {
		Library l = new Library();
		//l.books(0, '0', null);
		l.books("Description:");
		l.books(1, ',', "First Flight");
		l.books("Shakespeare", 1995, "Publication");
		l.books("Rs.",199,"/-");
	}
}
