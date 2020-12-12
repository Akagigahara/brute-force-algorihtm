package code;

public class Breaker {
	public static Object codebreaker(String pwd)
	{
		String input = pwd;
		boolean status = false;
		String str = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890.!?/-_.:,;#'+*´`~ß=<>|@^°";
		char[] elligable_chars = str.toCharArray();
		String looper = "";
		
		//while(!status)
		//{
			
			for (char letter : elligable_chars)
			{
				if(looper.isEmpty())
				{
					looper = Character.toString(letter);
						
				}if (looper.contentEquals(input))
				{
					System.out.println("Got it");
					status = true;
					break;
				}
			}
			for (char letter : elligable_chars)
			{
				
			}
		//}
		return null;
	}
}
