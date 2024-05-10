package com.vector;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<Integer>();
	
	System.out.println("capacity:="+v.capacity());
	v.add(1);
	v.add(5);
	v.add(456546555);v.add(1);
	v.add(5);
	v.add(456546555);v.add(1);
	v.add(5);
	v.add(456546555);v.add(1);
	v.add(5);
	v.add(456546555);v.add(1);
	v.add(5);
	v.add(456546555);
	v.removeAll(v);
	System.out.println(v.capacity());
	System.out.println(v);
}
}
