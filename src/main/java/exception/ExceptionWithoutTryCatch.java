package exception;

public class ExceptionWithoutTryCatch {

	public static void main(String[] args) throws NegativeArraySizeException {

		int sign = 1;
		System.out.println("Before exception");
		if (1 == sign) {
			throw new NegativeArraySizeException();
		}
		System.out.println("After exception");

	}
}
