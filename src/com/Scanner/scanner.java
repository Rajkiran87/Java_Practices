package com.Scanner;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Values");
		String n =s.next();
		System.out.println(n);
		int a = s.nextInt();
		System.out.println(a);
		char g = s.next().charAt(0);
		System.out.println(g);
		s.nextLine();
		String z = s.nextLine();
		System.out.println(z);
		int b = s.nextInt();
		System.out.println(b);
		System.out.println(a+2*b);
		System.out.println(a+" "+n+" "+b);
		boolean c = s.hasNext();
		System.out.println(c);
	}

}
