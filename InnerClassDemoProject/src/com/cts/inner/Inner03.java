//Method local inner class-inner class inside a method and object of inner class has to be created right after closing innerclass and within method

package com.cts.inner;

class Other{
	int v;
	public void some() {
		int v=60; //treated as final
		//v=70; cannot reassign value as v is treated as final
		class Inner{
			//Other.this.v=88; not working in java 8.x versions
			public void work() {
				System.out.println("Hello from inner class "+v);
			}
		}
		new Inner().work();
	}
}
public class Inner03 {
	public static void main(String[] args) {
		new Other().some();
	}
}
