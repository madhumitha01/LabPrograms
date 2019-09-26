
public class VowelConsonant {
	String compute(String str) {
		if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u") || str.equals("A")
				|| str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")) {
			return "Vowel";
		}
		else
			return "Consonant";
	}

}
