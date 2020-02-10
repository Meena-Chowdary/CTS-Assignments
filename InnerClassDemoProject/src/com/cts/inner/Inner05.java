//Argument based anonymous inner class

package com.cts.inner;
interface Employee{
	void workForWages();
}
class Shruthi{
	public void doSomething(Employee emp) {
		System.out.println("Shruthi works..");
	}
}
public class Inner05 {
	public static void main(String[] args) {
	Shruthi s =new Shruthi();
	s.doSomething(new Employee() {
		@Override
		public void workForWages() {
			System.out.println("Shruthi works");
		}
	});
	
}
}
