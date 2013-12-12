package polymorphism;


public class Main {

	static void  onlyPropertyAndStaticMethodCanNotBeInherited(){
		Apple apple = new RedApple();
		System.out.println(apple.price);
		apple.getPrice();

	}

	static void thereIsAOverriddenMethodBeingCalledInConstructor(){
		new RedApple();

	}

	public static void main(String [] args) {

//		onlyPropertyAndStaticMethodCanNotBeInherited();

		thereIsAOverriddenMethodBeingCalledInConstructor();

	}

}
