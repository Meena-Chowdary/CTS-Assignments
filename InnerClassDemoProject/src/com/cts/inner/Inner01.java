//Regular Inner Class -creating object of inner class inside outer class

package com.cts.inner;

public class Inner01 {
 public static void method() {      //two ways- with static,without static  
	 //Inner in =new Inner();   if method() is not static 
	 Inner01.Inner in=new Inner01().new Inner();  //if static keyword is used before method()
	 in.work();
 }
 class Inner{
	 void work() {
		 System.out.println("Hello from inner class");
	 }
 }
 public static void main(String[] args) {
	//new Inner01().method(); if method() is not static
	Inner01.method(); //For static 
}
}
