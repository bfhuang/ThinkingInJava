package exception;

public class LostException {

	public static void main(String[] strings) throws MyException {

		try {
			throw new MyException();
		} finally {
			// Using ‘return’ inside the finally block
			// will silence any thrown exception.
//			return;
			System.out.println("33");
			return;
		}
	}
}
