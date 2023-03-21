package com.Control_statement;

import java.util.Scanner;

public class Demo_Project1 {

	public static void main(String[] args) {
		int check=0;
		int password = 112233;
		String user = "Raj";
		Scanner s = new Scanner(System.in);
		while(check<3) {
		System.out.println("Username");
		String u = s.next();
		System.out.println("Password");
		int p = s.nextInt();
		if(u.equals(user) && p==password) {
			System.out.println("LoggedIn");
			check=check+3;
		}
		else{
			System.out.println("Incorrect Credentials");
			check++;
		}
	}
	}	
}
