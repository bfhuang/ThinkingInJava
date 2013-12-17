package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConvertingCheckedToUncheckedExceptionTest {

	public static void main(String [] strings) {
		MyException myException = new MyException();

		try{
			myException.throwRuntimeException(0);
		} catch (RuntimeException e){
			try{
				throw e.getCause();
			}catch (FileNotFoundException re){

			} catch(IOException re){

			}catch (Throwable throwable) {
				throwable.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
			}

		} catch (Exception e){

		}

	}
}
