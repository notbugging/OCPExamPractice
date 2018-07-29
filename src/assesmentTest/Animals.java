package assesmentTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class Animals {

	public static void main(String[] args) {
		List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer> fish = new CopyOnWriteArrayList<>(source);
		List<Integer> mammals = Collections.synchronizedList(source);
		Set<Integer> birds = new ConcurrentSkipListSet<>();
		birds.addAll(source);
		
		synchronized (new Integer(10)) {
			for (Integer f : fish) {fish.add(4);}
			for (Integer m : mammals) {mammals.add(4);}
			for (Integer b : birds) {birds.add(5);}
			System.out.println(fish.size()+" " +mammals.size() + " " + birds.size());
		}
	}
}

// A ConcurrentModificationException is thrown at runtime on line 22 because mammals is
// a synchronized list not a concurrent one. Therefore, it is not safe to be used inside
// an iterator.