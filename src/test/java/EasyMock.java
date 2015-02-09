import easyMock.Call;
import easyMock.ClassBeenCalled;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.*;

public class EasyMock {

	private Call call;
	private ClassBeenCalled classBeenCalled;

	@Before
	public void setup() {
		call = new Call();
		classBeenCalled = createMock(ClassBeenCalled.class);
		call.setClassBeenCalled(classBeenCalled);
	}

	@Test
	public void shouldVerifyTheMethodBeenCalled(){
		classBeenCalled.fun();

		replay(classBeenCalled);//should put the mocked object here which need to be verified
		call.fun();
		verify(classBeenCalled);
	}

}
