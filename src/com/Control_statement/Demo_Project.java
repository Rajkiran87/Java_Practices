package com.Control_statement;

import java.util.Scanner;

public class Demo_Project {
	
	public static void main(String[] args) {
		System.out.println("Enter Your Credentials");
		for(int i=0; i<3; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("Username");
			String user = s.next();
			System.out.println("Password");
			int pass = s.nextInt();
			if(user.equals("Rajkiran") && pass == 1234) {
				System.out.println("LoggedIn");
				i=i+3;
	}		else {
				System.err.println("Incorrect Credentials");
			}System.out.println();
		
		}	
	}

}
