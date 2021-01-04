package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console
{
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Please insert password");
		String input = "invalid";
		input = reader();
		if(input.isBlank())
		{
			write("Invalid Input");
		}
		
		else
		{			
			long startTime = System.currentTimeMillis();
			Breaker.codebreaker(input);
			long endTime = System.currentTimeMillis();
			write("Prozess Abgeschlossen. " + milisecConverter(startTime, endTime));
		}
		
		main(args);
	}
	
	public static String reader() throws IOException
	{
		System.out.println("I am reading");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String read = reader.readLine();
		return read;
	}
	
	public static String milisecConverter(long x1, long x2)
	{
		long preFormat = x2-x1;
		long Miliseconds = preFormat%1000;
		long seconds = preFormat/1000%60;
		long minutes = preFormat/1000/60%60;
		long hours = preFormat/1000/60/60;
		
		String deltaT = "Der Algorithmus benötigte " + hours + " Stunden, " + minutes + " Minuten, " + seconds + " Sekunden und " + Miliseconds + " Millisekunden.";
		return deltaT;
	}
	
	public static void write(String x)
	{
		System.out.println(x);
	}

}
