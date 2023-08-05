package _04_harry_potter;

public class HarryRunner {
	public static void main(String[] args) {
		
		HarryPotter harry = new HarryPotter();
		
		harry.makeInvisible(true);
		
		harry.spyOnSnape();
		
		harry.makeInvisible(false);
		
		harry.castSpell("stupefy");
		
	}
}
