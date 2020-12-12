package code;

public class Breaker {
	public static Object codebreaker(String pwd)
	{
		boolean status = false;
		String str = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890.!?/-_.:,;#'+*´`~ß=<>|@^°";
		char[] elligable_chars = str.toCharArray();
		String looper = "";
		
		while(!status)
		{
			
			for (char letter : elligable_chars)
			{
				System.out.println(letter);
				String h = Character.toString(letter);
				if (looper == pwd)
				{
					status = true;
				}
			}
		}
		return null;
	}
}
