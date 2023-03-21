package com.Control_statement;

public class For_Loop {	
	static int i;
	static int j;
	static int h;
public static void main(String[] args) {
	for(i=1; i<=5; i++) {
		for(j=1; j<=i; j++) {	
		System.out.print("*");
		}System.out.println();
	}System.out.println();
	for(i=1; i<=5; i++) {
		for(j=1; j<=i; j++) {	
		System.out.print(j);
		}System.out.println();
	}System.out.println();
	for(i=5; i>=1; i--) {
		for(j=1; j<=i; j++) {
			System.out.print(j);
		}System.out.println();
	}System.out.println();
	for(i=5; i>=1; i--) {
		for(j=5; j>=i; j--) {
			System.out.print(j);
		}System.out.println();
	}System.out.println();
	for(i=1; i<=5; i++) {
		for(j=5; j>=i; j--) {
			System.out.print(j);
		}System.out.println();
	}System.out.println();
	for(i=1; i<=5; i++) {
		for(j=1; j<=5; j++) {
			System.out.print(j);
		}System.out.println();
	}System.out.println();
	for(i=5; i>=1; i--) {
		for(j=5; j>=1; j--) {
			System.out.print(j);
		}System.out.println();
	}	
}
}