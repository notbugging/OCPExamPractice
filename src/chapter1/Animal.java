package chapter1;

public abstract class Animal {
	String name = "????";
	
	public abstract void feed();
	
	public void printName() {
		System.out.println(name);
	}
	
	public void play() {
		System.out.println("You are petting the animal.");
	}
}
