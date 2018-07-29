package assesmentTest;

public class Console {

	public static void main(String[] args) {
		String line;
		java.io.Console c = System.console();
		if ((line = c.readLine()) != null) {
			System.out.println(line);
		}
	}
}

//This code throws a NullPointerException if there is no available console.