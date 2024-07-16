import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//duplicates are allowed, follows insertion order, non synchronized
		List<Integer> arrlist = new ArrayList(Arrays.asList(30,45,12,23));
        List<Integer> linkList = new LinkedList(Arrays.asList(12,34,56,43));
        List<Integer> v = new Vector(Arrays.asList(45,23,45,12,34));
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.add(89);
        stack.push(12);
        stack.push(90);
        
        Collections.sort(arrlist);
        Collections.sort(arrlist,Collections.reverseOrder());
        Collections.sort(linkList);
        Collections.sort(stack);
        
       System.out.println(stack);
        
        
        
	
	}

}
