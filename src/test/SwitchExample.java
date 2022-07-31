package test;

public class SwitchExample {

	public static void main(String[] args) {
		
		String str = "This is a sentence to check vowels";
		
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break;
		}
		}
		
System.out.println(count);
	}

}
