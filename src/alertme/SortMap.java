import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMap 
{
	/**
	 * Sort the ratings map by value
	 * @param unsortMap
	 * @return the sorted by value map
	 */
	private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap) 
	{
		 
		// Convert Map to List
		List<Map.Entry<String, Integer>> list = 
				new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
 
		// Sort list with comparator, to compare the Map values
		Collections.sort
		(
			list, 
			new Comparator<Map.Entry<String, Integer>>() 
			{
				public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
				{
					// reverse sort o2 comp to 01 so highest is first
					return (o2.getValue()).compareTo(o1.getValue());
				}
			}
		);
 
		// Convert sorted map back to a Map
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) 
		{
			Map.Entry<String, Integer> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}


