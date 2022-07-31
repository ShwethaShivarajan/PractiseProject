package test;

public class Vowels {

	public static void main(String[] args) {

		String str = "Check the vowels in this sentence";
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
				count++;

			}
		}
		System.out.println("The vowel count is " + count);
	}

}
// use switch condition to write this program and also count for each type of vowels