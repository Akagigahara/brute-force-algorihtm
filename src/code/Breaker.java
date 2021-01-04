package code;

import java.io.IOException;
import java.util.Arrays;

public class Breaker {
	
	public static Object codebreaker(String pwd) throws IOException
	{
		boolean status = false;
		String str = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890.!?/-_#'*+`~=<>|@^";
		char[] elligable_chars = str.toCharArray();
		String check = "";
		String looper = "";
		
		while(!status)
		{
			for (char letter : elligable_chars)
			{
				
				check = looper + Character.toString(letter);
				if (check.contentEquals(pwd))
				{
					status = true;
				}
			}
			looper = pushString(check);
		}
			
		return null;
	}
	
		public static String pushString(String subject)
		{
			char[] change  = subject.toCharArray();
			char[] temp = change;
			String str = "°AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890.!?/-_#'*+`~=<>|@^";
			boolean precededMaxed = false;
		
			for(int pos = change.length-1; pos >= 0; pos--)
			{
				if(change[pos] == '^' && pos == change.length-1 || precededMaxed)
				{
					if(change.length == 1)
					{
						change[pos] = 'A';
					}
					
					else if(pos == 0)
					{
						temp[pos] = 'A';
						temp[pos+1] = 'A';
					}
					
					else
					{
						switch(change[pos-1])
						{
							case '^':
								precededMaxed = true;
								temp[pos-1] = 'A';
								break;
								
							default:
								temp[pos-1] = str.charAt(str.indexOf(change[pos-1])+1);
								precededMaxed = false;
								temp = Arrays.copyOfRange(change, 0, change.length-1);
								break;
						}
					}
				}
			}
			String returner = String.valueOf(temp);
			return returner;
		}
	}