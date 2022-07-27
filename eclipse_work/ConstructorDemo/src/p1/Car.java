package p1;

public class Car {

	int h;
	int w;

	public Car() {
		this.h = 5;
		this.w = 10;
	}

	public Car(int x, int y) {
		this.h = x;
		this.w = y;
	}

	void display() {
		System.out.println(this.h + " : " + this.w);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.h = 100;
		c1.w = 200;
		c1.display();

		Car c2 = new Car();
		c2.display();

		Car c3 = new Car(50, 80);
		c3.display();
	}
}
