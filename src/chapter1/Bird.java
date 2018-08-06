package chapter1;

public class Bird extends Animal{
	String name = "Tweet";

	@Override
	public void feed() {
		addSeed();
	}
	
	private void addSeed() {
		System.out.println("Yum! The bird loves seeds!!!");
	}
	
	@Override
	public void play() {
		System.out.println("The bird started singing! It's a beautiful melody.");
	}

}
