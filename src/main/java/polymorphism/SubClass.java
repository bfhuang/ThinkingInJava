package polymorphism;

public class SubClass extends SuperClass {

	@Override
	public RedApple getApple() {
		return new RedApple();
	}
}
