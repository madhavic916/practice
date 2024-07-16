import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class reverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr1 = new ArrayList();
		//to store same datat ype
		LinkedList<String> arr2 = new LinkedList<>();
		arr2.add("Apple");
		arr2.add("Banana");
		arr2.add("Apple");
		arr2.add("Orange");
		ArrayList<String> sorted = new ArrayList<String>();

		
		Iterator<String> it = arr2.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

		
	}

}
