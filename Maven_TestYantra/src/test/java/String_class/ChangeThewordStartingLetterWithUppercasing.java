package String_class;

public class ChangeThewordStartingLetterWithUppercasing {

	public static void main(String[] args)
	{
		String s="welcome to testyantra";
		
		String[] word = s.split(" ");
		
		String allLetters="";
		
		for (String w : word)
		{
			String upperCaseLetter = w.substring(0, 1).toUpperCase();
			String remainingLetters=w.substring(1);
			allLetters=allLetters+upperCaseLetter+remainingLetters+" ";
			
		}
		
		System.out.println(allLetters);
	

	}

}
