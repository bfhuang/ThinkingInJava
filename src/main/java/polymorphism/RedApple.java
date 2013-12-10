package polymorphism;

public class RedApple extends Apple{

	public double price = 20;

	RedApple() {
		System.out.print("RedApple constructor call overridden method printPrice ");
		printPrice();
	}

	@Override   //this annotation is not neccessary. It just make sure that you override the method correctly instead of overloaded
	public double getPrice() {
		System.out.println("RedApple"+price);
		return price;
	}
    //the compiler do not allow you to add the override annotation here
	public static void getClassName(){
		System.out.println("Static RedApple");
	}

	public void printPrice() {
		System.out.println(this.price+"RedApple");
	}
}
