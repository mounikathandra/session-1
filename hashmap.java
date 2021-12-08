package JavaTraining;

import java.util.*;
//class for creating hash map
public class Iterate {

	public static void main(String[] args) {
          //creating hash map
		Map<Integer, String> h1 = new HashMap<Integer, String>();
		//Inserting Sets
		h1.put(1, "Mounika");
		h1.put(2, "Raj Shekar");
		h1.put(3, "Saikrishna");
		h1.put(4, "Madhuri");
		h1.put(5, "Anuja");
		h1.put(6, "Syamala");
		h1.put(7, "Priya");
		// Iterating using for loop
		for (Map.Entry<Integer, String>set : h1.entrySet()) {
			System.out.println(set.getKey() + "=" + set.getValue());
		}
	}
}
