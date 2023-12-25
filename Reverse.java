/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String ans = "";
		char midChar = 'd';
		for(int i = 0; i < word.length();i++)
		{
				ans += word.charAt(word.length()-i-1);
			if (i == (word.length()-1)/2){
				midChar= word.charAt(i);
			}
		}
		/*  int i = 0;
		while (i < word.length()){
		 	ans += word.charAt(word.length()-i-1);
		 	if (i == (word.length()-1)/2){
		 		midChar= word.charAt(i);
		 	}
		 }	
		*/
		System.out.println(ans+"\nThe middle character is "+midChar);
	}
}
