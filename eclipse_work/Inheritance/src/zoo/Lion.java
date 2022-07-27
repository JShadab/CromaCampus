package zoo;

public class Lion extends Animal {

	void hunt() {
		System.out.println("Lion is hunting");
	}
	
	@Override
	void eat() {
		System.out.println("Lion is eating");
	}

}
