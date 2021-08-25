package logicalmilestone3.string6;
//5. String s= "java by kiran" …print the only vowel of string..

public class Vowels {

	public static void main(String[] args) {
		
		String s= "java by kiran";
		
		for(int i=0; i<=s.length()-1; i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
					s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') 
				System.out.println(s.charAt(i));
		}

		
	}

}
