import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generics {

	static class Snow {}
	static class Powder extends Snow {}
	static class Light extends Powder {}
	static class Heavy extends Powder {}
	class Crusty extends Snow {}
	class Slush extends Snow {}
	static class test{}

	public static void main(String[] args) {

//		List<Snow> snow1 = Arrays.asList(new Heavy(), new Light());//Error
		List<Snow> snow2 = Arrays.asList(new Snow(),new Heavy(), new Light());
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3,new Heavy(), new Light());



	}
}
