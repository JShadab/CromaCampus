package zoo;

public class Test {
	
	public static void main(String[] args) {
		Animal animal = new  Animal();
		animal.eat(); // Animal class
		
		System.out.println("----------------------------");
		
		Lion lion= new Lion();
		lion.hunt();
		lion.eat(); // Lion class eat()
		
		System.out.println("----------------------------");
		Cow cow = new Cow();
		cow.eat();
	}

}
