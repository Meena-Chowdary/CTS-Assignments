//Anonymous inner class

package com.cts.inner;
interface Remote{
	public void doSomething();
}
public class Inner04 {
	public static void main(String[] args) {
		Remote ref=new Remote() {
			@Override
			public void doSomething() {
				System.out.println("Annonymous Inner class");
			}
		};
		ref.doSomething();
	}
}
