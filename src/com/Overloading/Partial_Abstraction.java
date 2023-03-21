package com.Overloading;

public class Partial_Abstraction extends Overriding {
	@Override
	public void books(String z) {
		super.books(z);
	}
	
	public static void main(String[] args) {
		Overriding m = new Overriding();
		m.books("Chemistry");
		m.books(1, 'h', "Physics");
				
	}

}

