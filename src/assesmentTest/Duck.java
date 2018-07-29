package assesmentTest;

import java.util.List;
import java.util.function.Predicate;

public class Duck {
	private String name;
	private List<Duck> ducklings;

	public Duck(String name, List<Duck> ducklings) {
		this.name = name;
		this.ducklings = ducklings;
	}

	public String getName() {
		return name;
	}

	public List<Duck> getDucklings() {
		return ducklings;
	}
	
	public String hasDuckings(Predicate<Duck> p) {
		return p.test(this) ? "Quack Quack" : ""; 
	}
}


//To be an immutable object, all instance variables must be marked as private and final.
//The class also must be marked as final
//The method getDucklings shouldn't give the caller direct access to the list 'ducklings' 
