import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayLIst {

	public static void main(String[] args) {
		// Allows duplicates and preserve Insertion order
		//default location provided is 10
		
		ArrayList arr1 = new ArrayList();
		//to store same datat ype
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("Apple");
		arr2.add("Tree");
		arr2.add("Apple");
		arr2.add("Orange");
		
		Set<String> noDup = new LinkedHashSet<>(arr2);
		arr2.clear();
		arr2.addAll(noDup);
		System.out.println(arr2);

	}

}
