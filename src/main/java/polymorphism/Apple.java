package polymorphism;

public class Apple {

	public double price = 10;

	public Apple(){
		System.out.print("Apple constructor call overridden method printPrice ");
		printPrice();
	}

	public  double getPrice() {
		System.out.println("Apple"+price);
		return price;
	}


	public static void getClassName(){
		System.out.println("Static Apple");
	}

	public void printPrice(){
		System.out.println(this.price+"Apple");
	}


}
