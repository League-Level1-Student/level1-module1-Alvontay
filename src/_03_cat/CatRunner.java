package _03_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("John");
		cat.meow();
		cat.printName();
		  		 
		while (cat.getLives() > 0) {
			 cat.kill();
		}
	}
}
