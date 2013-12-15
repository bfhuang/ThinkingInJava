package exception;

public class ExceptionWithTryCatch {

	public static void main(String[] args) {
		int sign = 1;

		System.out.println("Before exception");
		if(1 == sign){
			try {
				throw new NoSuchFieldException();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
			}
		}

		System.out.println("After exception");


	}
}
