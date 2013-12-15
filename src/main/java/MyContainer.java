package packege;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyContainer<S> implements Iterable<S> {
	private S[] arr;
	private int size = 0;

	public MyContainer(S[] arr) {
		this.arr = arr;
		size = arr.length;
	}

	@Override
	public Iterator<S> iterator() {
		Iterator<S> it = new Iterator<S>() {
			private int cursor = 0;

			@Override
			public boolean hasNext() {
				return cursor < size;
			}

			@Override
			public S next() {
				if (cursor < size) {
					return arr[cursor++];
				}else
					throw new NoSuchElementException();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		return it;
	}



	public static void main(String [] args) {

		MyContainer<String> strings = new MyContainer<String>(getStringArray());

		for(String s:strings){
			System.out.println(s);
		}
	}


	public static String[] getStringArray() {
		String[] strings = new String[4];
		for(int i=0; i<strings.length; i++){
			strings[i] = Integer.toString(i);
		}
		return strings;
	}
}
