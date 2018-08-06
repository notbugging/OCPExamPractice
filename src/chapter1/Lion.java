package chapter1;

public class Lion extends Animal {
	String name = "Leonard";

	@Override
	public void feed() {
		addMeat();
	}

	private void addMeat() {
		System.out.println("Yum! The lion loves meat!!!");
	}
	
	@Override
	public void play() {
		System.out.println("The lion starts mauling you!!!! What were you thinking???!!!");
	}
}
