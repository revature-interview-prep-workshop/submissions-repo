package com.revature.driver;

import com.revature.model.PStack;

public class StackDriver {
	public static void main(String[] args) throws Exception {
		PStack<Integer> ps = new PStack<Integer>();
		System.out.println(ps);
		ps.push(1);
		ps.push(2);
		System.out.println(ps);//[1]
		System.out.println(ps.pop());//2
		System.out.println(ps);//[2, 1]
		ps.push(3);
		System.out.println(ps);
	}
}
