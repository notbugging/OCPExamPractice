package chapter1;

public class Cow extends Animal {
	String name = "Lulu";

	@Override
	public void feed() {
		addHay();
	}
	
	private void addHay() {
		System.out.println("Yum! The cow loves hay!!!");
	}
	
	@Override
	public void play() {
		System.out.println("The cow is licking your head!!! Oh well...");
	}
}
