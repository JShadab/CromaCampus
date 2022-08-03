package p2;

public class PetrolEngine implements Engine {

	@Override
	public void startWorking() {
		
		System.out.println("Petrol Engine is working...");

	}
	
	@Override
	public String toString() {
		
		return "Petrol Engine";
	}

}
