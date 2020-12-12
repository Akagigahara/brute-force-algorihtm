package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console
{
	
	public static void main(String[] args) throws IOException {
		System.out.println("Please insert password");
		String input = "invalid";
		input = reader();
		Breaker.codebreaker(input);
		write("");
		
	}
	
	public static String reader() throws IOException
	{
		System.out.println("I am reading");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String read = reader.readLine();
		return read;
	}
	
	public static void write(String x)
	{
		System.out.println(x);
	}

}
