package generic_collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> priceMap = new HashMap<>();
		
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		
		System.out.println("priceMap = " + priceMap);
		System.out.println("priceMap size = " + priceMap.size());
		
		priceMap.put("LG Gram", 1_800_000);
		System.out.println("priceMap = " + priceMap);
		System.out.println("priceMap size = " + priceMap.size());
		
		System.out.println("===========================");
		
		int applePrice = priceMap.get("Apple Macbook Pro");
		System.out.println(applePrice);

		System.out.println("===========================");

		System.out.println("1.priceMap = " + priceMap);
		System.out.println("1.priceMap size = " + priceMap.size());
		
		priceMap.remove("Apple Macbook Pro");
		
		System.out.println("2.priceMap = " + priceMap);
		System.out.println("2.priceMap size = " + priceMap.size());

		System.out.println("===========================");

		System.out.println("1.priceMap = " + priceMap);
		System.out.println("1.priceMap size = " + priceMap.size());
		
		priceMap.clear();
		
		System.out.println("2.priceMap = " + priceMap);
		System.out.println("2.priceMap size = " + priceMap.size());
		
		System.out.println("===========================");
		
		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
		
		boolean isEmpty = (priceMap == null || priceMap.isEmpty());
		System.out.println("1.priceMap isEmpty = " + isEmpty);
		System.out.println("1.priceMap = " + priceMap);
		System.out.println("1.priceMap size = " + priceMap.size());
		
		priceMap.clear();
		isEmpty = (priceMap == null || priceMap.isEmpty());
		System.out.println("1.priceMap isEmpty = " + isEmpty);
		System.out.println("1.priceMap = " + priceMap);
		System.out.println("1.priceMap size = " + priceMap.size());
		
		System.out.println("===========================");

		// isEmpty() 사용시 Null Check 필수!!
		Map<Integer, String> testMap = null;
		
//		boolean isEmptyTest = testMap.isEmpty(); // NullPointerException
		boolean isEmptyTest = (testMap == null || testMap.isEmpty());
		System.out.println("testMap isEmpty = " + isEmptyTest);
		
		System.out.println("===========================");

		priceMap.put("Apple Macbook Pro", 3_500_000);
		priceMap.put("Samsung Galaxy Book", 1_500_000);
		priceMap.put("LG Gram", 1_700_000);
	
		System.out.println("1.priceMap = " + priceMap);
		System.out.println("1.priceMap size = " + priceMap.size());
		
		// Map에 값을 넣어주기 전에 containsKey()를 사용해서 체크한 후 넣어주자!
		if(!priceMap.containsKey("Dell")) {
			priceMap.put("Dell", 2_500_000);
		}
		
		System.out.println("2.priceMap = " + priceMap);
		System.out.println("2.priceMap size = " + priceMap.size());
		
		System.out.println("===========================");
		
		System.out.println("1.priceMap = " + priceMap);
		System.out.println("1.priceMap size = " + priceMap.size());
		
		if(priceMap.containsValue(2_500_000)) {
			priceMap.put("Dell", 2_600_000);
		}
		
		System.out.println("2.priceMap = " + priceMap);
		System.out.println("2.priceMap size = " + priceMap.size());
		
		System.out.println("===========================");
		
		Map<String, Integer> priceMap2 = new HashMap<>();
		priceMap2.putAll(priceMap);
		
		System.out.println("1.priceMap add = " + System.identityHashCode(priceMap));
		System.out.println("1.priceMap = " + priceMap);
		System.out.println("1.priceMap size = " + priceMap.size());
		
		System.out.println("2.priceMap2 add = " + System.identityHashCode(priceMap2));
		System.out.println("2.priceMap2 = " + priceMap2);
		System.out.println("2.priceMap2 size = " + priceMap2.size());
		
	}

}
