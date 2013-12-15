package exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class ExceptionWithTryCatch {

	private static Logger logger =
			Logger.getLogger("LoggingExceptions2");
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public static void main(String[] args) {
		int sign = 1;

		System.out.println("Before exception");
		if(1 == sign){
			try {
				throw new NoSuchFieldException("in main");
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
				e.printStackTrace(System.out);
				e.printStackTrace(new PrintWriter(new StringWriter()));
				logException(e);
			}
		}

		System.out.println("After exception");


	}
}
