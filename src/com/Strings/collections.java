package com.Strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collections {
	
	public static void main(String[] args) {
		List<Object> l = new ArrayList<>();
		l.add(2000);
		l.add(4000);
		l.add(5000);
		l.add(7000);
		l.add("maths");
		
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(3);
		System.out.println(object);
		
		l.set(3, "marks");
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		int indexOf = l.indexOf("maths");
		System.out.println(indexOf);
		
		boolean contains = l.contains("marks");
		System.out.println(contains);
		
//		l.clear();
//		System.out.println(l);
		
		
		List<Object> ll = new LinkedList<>();
		
		ll.add(3000);
		ll.add(4000);
		ll.add(5000);
		ll.add(6000);
		
		System.out.println(ll);
		
		l.addAll(ll);
		System.out.println(l);
		
		ll.retainAll(l);
		System.out.println(l);
		
		l.removeAll(ll);
		System.out.println(l);
		
	}

}
