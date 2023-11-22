import acm.program.ConsoleProgram;
//Java Program to check whether two Strings are anagram or not. 
//Two strings are called anagrams 
//if they contain same set of characters but in different order.
public class Seminar16Bonus1 extends ConsoleProgram {
	public void run() {
		String text1 = readLine("Enter text one : ");
		String text2 = readLine("Enter text two : ");
		boolean isAnagram = true;
		if(text1.length() != text2.length()){
			isAnagram = false;
		} else {
		for(int i = 0; i < text1.length(); i++) {
			for(int j = 0; j < text2.length(); j++){
				if(text1.charAt(i) == text2.charAt(j)) {
					isAnagram = checkFrequency(isAnagram, text1, text2 ,i, j);
					if(isAnagram == false) {
						break;
					}
				
				}
			}
			if(isAnagram == false) {
				break;
			}
		
		}
		}
		println("Two strings are anagrams : " + isAnagram);
		
		
	}

	private boolean checkFrequency(boolean isAnagram, String text1, String text2, int i, int j) {
		int number1 = 0;
		int number2 = 0;
		for(int a = 0; i < text1.length(); i++) {
			if(text1.charAt(i) == text1.charAt(a)) {
				number1 = number1 + 1;
			}
		}
		for(int b = 0; j < text2.length(); i++) {
			if(text2.charAt(j) == text2.charAt(b)) {
				number2 = number2 + 1;
			}
		}
		return number1 == number2; 
		
	}	
}		
		
		
	

	

