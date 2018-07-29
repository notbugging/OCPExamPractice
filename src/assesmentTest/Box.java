package assesmentTest;

public class Box<T> {
	T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public static void main(String[] args) {
		Box<String> one = new Box<String>("A string");
		Box<Integer> two = new Box<>(123);
		System.out.print(one.getValue());
		System.out.print(two.getValue());
	}
	
}

//This code is fine, it's the proper use of generics.