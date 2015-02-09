package containner;

import java.util.*;

public class Generics {

	static class Snow {}
	static class Powder extends Snow {}
	static class Light extends Powder {}
	static class Heavy extends Powder {}
	class Crusty extends Snow {}
	static class Slush extends Snow {}
	static class test{}

	public static void main(String[] args) {

		List<Snow> snow1 = Arrays.<Snow>asList(new Heavy(), new Light());//Error
		List<Snow> snow2 = Arrays.asList(new Snow(),new Heavy(), new Light());
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3,new Heavy(), new Light());


		List<String> strings = new ArrayList<String>(Arrays.asList("11", "22", "33", "44", "55"));
		List<String> subStrs = new ArrayList<String>(Arrays.asList("11", "22", "66"));

		System.out.println(strings.retainAll(subStrs));

		ListIterator<String> iterator = strings.listIterator();
		iterator.next();
		System.out.println(iterator.previousIndex());
		System.out.println(iterator.nextIndex());



	}
}
