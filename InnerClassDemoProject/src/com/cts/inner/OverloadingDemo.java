//Overloading demo
//widening >Auto boxing>variable arguments
//widening :
//short->int/float/double(same order)
//Auto boxing: short->Short-/>Integer/Double/any wrapper class but short->Short->Object(IS-A relation)
//Object class is parent class of all wrapper classes

package com.cts.inner;
class Methods{
	void work(Object val){				//works if short,long or none of primitive data types and Short Wrapper class are not there
		System.out.println("Object");   //and works if Integer or any other wrapper class is there other than Short
	}									
	void work(Integer val){					//doesn't work as variable is of type short
		System.out.println("Integer");		//works if variable is of type int
	}										
	void work(Short val){					//works if short,long or none of primitive data types are not there
		System.out.println("Short");		//beats Object wrapper class as short->Short(auto boxing)
	}
	void work(short val){					//highest preference as variable is of type short
		System.out.println("short");
	}
	void work(int val){					//preferred when short data type is not there
		System.out.println("int");
	}
	void work(long val){				//preferred when short and int is not there
		System.out.println("long");
	}
	void work(Long val){				//doesn't work,will work if variable is of type long
		System.out.println("Long");
	}
}
public class OverloadingDemo {
	public static void main(String[] args) {
		short val=9;
		new Methods().work(val);
	}
}
