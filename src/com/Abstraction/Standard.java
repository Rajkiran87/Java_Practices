package com.Abstraction;

public class Standard implements Section_A, Section_B {

	@Override
	public void student_1(String A) {
		System.out.println(A);
		
	}

	@Override
	public void student_2(String B) {
		 
	}

	@Override
	public void student_3(String C) {
		
	}

	@Override
	public void student_4(String D) {
		
	}
	
	@Override
	public void student_5(String A) {
		
	}

	@Override
	public void student_6(String B) {
		
	}

	@Override
	public void student_7(String C) {
		
	}

	@Override
	public void student_8(String D) {
		
	}
	public static void main(String[] args) {
		Standard s = new Standard();
		s.student_1("Raj");
		s.student_1("Kiran");
	}

}
