package chapter1;

public class InstanceofProgram {

	public static void main(String[] args) {
		HeavyAnimal hippo = new Hippo();
		boolean b1 = hippo instanceof Hippo;
		boolean b2 = hippo instanceof HeavyAnimal;
		boolean b3 = hippo instanceof Elephant;
		boolean b4 = hippo instanceof Mother;
		
		HeavyAnimal motherHippo = new MotherHippo();
		boolean b5 = motherHippo instanceof Hippo;
		boolean b6 = motherHippo instanceof HeavyAnimal;
		boolean b7 = motherHippo instanceof Elephant;
		boolean b8 = motherHippo instanceof Mother;
		
		System.out.println("hippo instanceof Hippo: " + b1);
		System.out.println("hippo instanceof HeavyAnimal: " + b2);
		System.out.println("hippo instanceof Elephant: " + b3);
		System.out.println("hippo instanceof Mother: " + b4);
		
		System.out.println("motherHippo instanceof Hippo: " + b5);
		System.out.println("motherHippo instanceof HeavyAnimal: " + b6);
		System.out.println("motherHippo instanceof Elephant: " + b7);
		System.out.println("motherHippo instanceof Mother: " + b8);
	}
}
