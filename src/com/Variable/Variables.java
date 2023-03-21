package com.Variable;

public class Variables {
	
	static int a=121;
	static int b=144;
	static float c=25.00f;
	static double d=36.50;
	float e=49;
	static int f=64;
	
	public static void raj() {
		float j=10.99f;
		System.out.println(j+d);
		System.out.println(c-j);
		System.out.println(a*b);
		System.out.println(b+f);	
	}
	public void raj(int h) {
		int i=10;
		int k=15;
		float l=20.50f;
		System.out.println(h);
		System.out.println(h/i);
		System.out.println(l*k);
	}
	public static void main(String[] args) {
		Variables v = new Variables();
		raj();
		v.raj(50);
		
	}
}
