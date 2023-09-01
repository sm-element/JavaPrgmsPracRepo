package test.javaconcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapMinandMaxElement {
	
	public static void main(String args[])
	{
	/// case1
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(5, "test1");
		hm.put(1, "test2");
		hm.put(2, "test3");
		hm.put(3, "test4");
		hm.put(4, "test5");
		
		System.out.println("hm value is :"+hm);
		
		int minmapkeyelement = Collections.min(hm.keySet());
		System.out.println("hm min key value is :"+minmapkeyelement);
		int maxmapkeyelement = Collections.max(hm.keySet());
		System.out.println("hm max key value is :"+maxmapkeyelement);
		
		

		String  minmapvalueelement = Collections.min(hm.values());
		
		System.out.println("hm min  value is :"+minmapvalueelement);
		String  maxmapvalueelement = Collections.max(hm.values());
		System.out.println("hm max  value is :"+maxmapvalueelement);
		
		
		// case 2
		
		System.out.println("########## Case 2 ");
Map<String, Integer> map = new HashMap<String, Integer>();
		
map.put("test1",5);
map.put("test2",1);
map.put("test3",3);
map.put("test4",2);
map.put("test5",4);
		
		System.out.println("map value is :"+map);
		
		String minele = Collections.min(map.keySet());
		
		System.out.println("hm min key is :"+minele);
		System.out.println("hm min key value is :"+map.get(minele));
		String maxele = Collections.max(map.keySet());
		
		System.out.println("hm max key is :"+maxele);
		System.out.println("hm max key value is :"+map.get(maxele));
		
		

		int  minval = Collections.min(map.values());
		
		System.out.println("hm min  value is :"+minval);
		int  maxval = Collections.max(map.values());
		System.out.println("hm max  value is :"+maxval);
	}

}
