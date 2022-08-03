package p2;

public class Sample1 {

	public static void main(String[] args) {

		String name = "Muhammad Musa";

		System.out.println(name.length());// 13
		System.out.println("---------------------");
		
		System.out.println(name.contains("ham"));
		System.out.println(name.startsWith("Muha"));
		System.out.println(name.endsWith("sa"));
		
		System.out.println("---------------------");

		char ch = name.charAt(6);
		System.out.println(ch); // 'a'
		System.out.println("---------------------");

		int index = name.indexOf('a');
		System.out.println(index);// 3
		System.out.println("---------------------");

		int lastIndex = name.lastIndexOf('a');
		System.out.println(lastIndex);// 12
		System.out.println("---------------------");

		String uCase = name.toUpperCase();
		String lCase = name.toLowerCase();
		System.out.println(lCase);// muhammad musa
		System.out.println(uCase);// MUHAMMAD MUSA
		System.out.println("---------------------");

		String newName = name.replace('a', 'z');
		System.out.println(newName);
		System.out.println("---------------------");

		String s1 = "I Love ";
		String s2 = "Java";

		String s3 = s1.concat(s2);

		System.out.println(s3);
		System.out.println("---------------------");

		String x = "";
		System.out.println(x.isEmpty()); // true
		System.out.println(x.isBlank()); // true

		String y = "   ";
		System.out.println(y.isEmpty()); // false
		System.out.println(y.isBlank()); // true

		System.out.println("---------------------");
		
		

	}

}
