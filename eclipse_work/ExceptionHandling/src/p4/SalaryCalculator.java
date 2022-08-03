package p4;

public class SalaryCalculator {

	public static void main(String[] args) {

		double total = 0.0;

		total = calcSalary(-100);

		System.out.println("Your Total Salary is :$" + total);
	}

	private static double calcSalary(int basic) {

//		if (basic <= 0) {
//			System.out.println("Brother...Basic salary cannot be zero or negative");
//			return 0;
//		}
		if (basic <= 0) {
			try {
				MyException exp = new MyException("How dare you? Basic salary cannot be zero or negative");
				throw exp;
			} catch (MyException e) {
				e.printStackTrace();
			}

		}

		double total = basic * 2 + 50;
		return total;
	}

}
