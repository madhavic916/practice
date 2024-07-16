import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class compareAllrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		ArrayList<String> list2 = new ArrayList(Arrays.asList("Apple","Banana","Orange"));
		LinkedList<String> list3 = new LinkedList(Arrays.asList("Apple","Orange","Banana"));

		boolean result = list.equals(list2);
		System.out.println(result);
		compareList(list,list2);
		System.out.println(result);

		list.ensureCapacity(8);
		list.trimToSize();
		
		ArrayList<String> c3 = (ArrayList<String>)list.clone();
		Iterator it = list.listIterator(1);
		Iterator it3 = list3.descendingIterator();
		Iterator it4 = list.iterator();
		while(it.hasNext())
		{
			it.next();
		}
		
		List<String> sortedList = list3.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
			
	}

	private static boolean compareList(ArrayList list, ArrayList<String> list2) {
		// TODO Auto-generated method stub
		
		return list.toString().contentEquals(list2.toString())?true:false;
		
	}

}
