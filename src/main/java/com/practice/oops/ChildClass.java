package com.practice.oops;

public class ChildClass extends ParentClass {
	
	public void whoAmI() {
		System.out.println("I am child");
	}
	
	public static void main(String[] args) {
		
		ParentClass p = new ParentClass();
		ParentClass pc = new ChildClass();
		ChildClass cc = new ChildClass();

		p.whoAmI();
		pc.whoAmI();
		cc.whoAmI();

	}

}
