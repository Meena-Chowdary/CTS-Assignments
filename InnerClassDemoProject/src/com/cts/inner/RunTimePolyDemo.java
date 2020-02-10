package com.cts.inner;

interface Cricket{
	void bat();
	void field();
}
class Rohit implements Cricket{
	@Override
	public void bat() {
		System.out.println("Rohit can bat well...");
	}
	@Override
	public void field() {
		System.out.println("Rohit can field well...");
	}
}
class Maxwell implements Cricket{
	@Override
	public void bat() {
		System.out.println("Maxwell can bat well...");
	}
	@Override
	public void field() {
		System.out.println("Maxwell can field well...");
	}
	public void bowl() {
		System.out.println("Maxwell can bowl");
	}
}
public class RunTimePolyDemo {
	public static void main(String[] args) {
		Cricket []cricketers=new Cricket[2];
		cricketers[0]=new Rohit();
		cricketers[1]=new Maxwell();
		for(Cricket players: cricketers) {
			players.bat();
			players.field();
			if(players instanceof Maxwell) {
				((Maxwell)players).bowl();
			}
		}
	}

}
