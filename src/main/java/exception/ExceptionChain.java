package exception;

public class ExceptionChain {

	public static void setValue(String string) {
		if(null == string){
			MyException myException = new MyException();
			myException.initCause(new NullPointerException());
			try {
				throw myException;
			} catch (MyException e) {
				e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
			}

		}
	}

	public static void main(String[] strings) {
		setValue(null);
	}
}
