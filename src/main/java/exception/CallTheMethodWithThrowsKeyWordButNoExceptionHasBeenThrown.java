package exception;

public class CallTheMethodWithThrowsKeyWordButNoExceptionHasBeenThrown {

	public static void fun() throws MyException{ }

	public static void main(String[] strings) {
		try {
			fun();
		} catch (MyException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
	}

}
