package easyMock;

public class Call {
	private ClassBeenCalled classBeenCalled = new ClassBeenCalled();

	public void fun(){
		classBeenCalled.fun();
	}

	public void setClassBeenCalled(ClassBeenCalled classBeenCalled) {
		this.classBeenCalled = classBeenCalled;
	}
}
