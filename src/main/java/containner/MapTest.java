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


		// Create three strings in three different ways.
		String s1 = "Hello";
		String s4 = "Hello";
		String s6="hello";
		String s2 = new StringBuffer("he").append("llo").toString();
		String s3 = s2.intern();
		String s5 = "hello";

		// Determine which strings are equivalent using the ==
		// operator
		System.out.println("s1 == s2? " + (s1 == s2));
		System.out.println("s1 == s3? " + (s1 == s3));
		System.out.println("s1 == s4? " + (s1 == s4));
		System.out.println("s1 == s5? " + (s1 == s5));
		System.out.println("s2 == s5? " + (s5 == s2));
		System.out.println("s2 == s6? " + (s1 == s6));
	}
}
