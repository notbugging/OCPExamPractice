package assesmentTest;

public class AssertDemo {

	public static void main(String[] args) {
		Integer x = 10;
		x++;
		assert x == null && x >= 0;
		System.out.println(x);
	}
}

//This code prints "11". The command line does not enable assertions.