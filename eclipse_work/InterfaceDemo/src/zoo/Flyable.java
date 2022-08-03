package zoo;

public interface Flyable {

	abstract void fly();

	default void foo() {
	}

	static void blaah() {
	}
}
