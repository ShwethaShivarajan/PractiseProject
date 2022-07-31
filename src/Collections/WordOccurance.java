package Collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "She sells sea shells on the sea shore as She is sea shells seller";

		String[] words = str1.split(" ");

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		for (String word : words) {

			if (map1.get(word) == null) {
				map1.put(word, 1);

			} else {
				int count = map1.get(word);
				map1.put(word, count + 1);
			}

		}
		System.out.println(map1);

	}

}
