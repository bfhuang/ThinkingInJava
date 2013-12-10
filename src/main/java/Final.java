import polymorphism.RedApple;

public class Final {

	public static void  main(String args) {

		final int i = 3;
		final RedApple  redApple= new RedApple();

		//i = 4; //The compiler shows errors that final primitive variables can not be changed

		redApple.price = 30; //It's ok as for reference final type, we can not change the reference but we can change the properties

		//redApple = new RedApple();//Error

	}
}
