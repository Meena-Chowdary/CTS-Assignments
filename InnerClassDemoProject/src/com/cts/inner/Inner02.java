//Regular Inner Class -creating object of inner class outside of outer class

package com.cts.inner;

class Outer {
	public void method() {
//		Inner in=new Inner();
//		in.work();  not required 
		System.out.println("Hello from outer class");
	}
	class Inner{
		void work() {
			System.out.println("Hello from inner class");
		}
	}
}

public class Inner02 {
	public static void main(String[] args) {
		Outer in=new Outer();
		in.method();
		Outer.Inner obj=in.new Inner();
		obj.work();
	}
}
