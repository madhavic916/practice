import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(3, "Banana");
		map.put(5, "Orange");
		map.put(2, "kiwi");
		
		System.out.println(map.get(3));
		System.out.println(map.containsValue("Apple") + " "+map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());
        
        //to get individual values
        for(Object i:map.keySet())
        {
        	System.out.println(i  +" "+map.get(i));
        	
        }       
       
        for(Map.Entry entry:map.entrySet())
        {
        	System.out.println( entry.getKey());
        	System.out.println( entry.getValue());
        }
        Map<Integer,String> sortedMap = map.entrySet().stream()
        		.sorted(Map.Entry.comparingByValue())
        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
            
                sortedMap.forEach((key,value) ->System.out.println(key+" "+value));
        		
        	
        	
       
             
	}

}
