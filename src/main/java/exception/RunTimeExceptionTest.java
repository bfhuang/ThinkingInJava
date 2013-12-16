package exception;

public class RunTimeExceptionTest {

	public static void main(String [] strings) {

		System.out.println("before runtime exception");
//		throw new RuntimeException();
		throw new IndexOutOfBoundsException();
//		throw new IllegalArgumentException();
//		throw new PrinterException();
//		System.out.println("before runtime exception");

	}
}
