package jan.day26.e;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // <Key, Value>
		map.put("곰문곰", 85);
		map.put("문곰문", 70);
		map.put("곰문곰", 90);
		map.put("문문곰", 95);
		System.out.println(map.get("곰문곰")); // key 값이 중복되는 자료중 오래된 자료를 지우고 나중 자료가 적용됨 << 키가 중요함 
		System.out.println(map.size());

	}

}
