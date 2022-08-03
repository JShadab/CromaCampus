package p2;

public class Sample3 {

	public static void main(String[] args) {
		String name = "ABC XYZ";

		String[] words = name.split("\\s+");
		// System.out.println(Arrays.toString(words));

		String output = "";

		for (int i = 0; i < words.length - 1; i++) {
			String word = words[i];

			char firstChar = word.charAt(0);

			output = output.concat(firstChar + ". ");

		}
		output = output.concat(words[words.length - 1]);
		System.out.println(output);
	}

}
