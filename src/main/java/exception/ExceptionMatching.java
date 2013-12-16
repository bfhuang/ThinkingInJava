package exception;

public class ExceptionMatching {

	public static void main(String[] strings) {

		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		try{
			throw new IllegalArgumentException();
		} catch (RuntimeException e){
			System.out.println("RuntimeException");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("IllegalArgumentException");
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
	}
}
