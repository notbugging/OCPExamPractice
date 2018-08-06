package chapter1;

public class AnimalFeedingProgram {

	public static void main(String[] args) {
		Animal animal1 = new Cow();
		Animal animal2 = new Bird();
		Animal animal3 = new Lion();
		
		animal1.feed();
		animal2.feed();
		animal3.feed();
		
		animal1.printName();
		animal2.printName();
		animal3.printName();

		animal1.play();
		animal2.play();
		animal3.play();
	}

}
