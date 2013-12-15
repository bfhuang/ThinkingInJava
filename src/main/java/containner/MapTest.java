package containner;

import polymorphism.Apple;
import polymorphism.RedApple;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map appleMap = new HashMap<String, Apple>();

		appleMap.put("apple", new Apple());
		appleMap.put("redApple", new RedApple());
	}
}
