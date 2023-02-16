
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
	private BufferedReader reader;
	
	//private String line;

	public FileRead(String fileName) throws FileNotFoundException
	{
		reader = new BufferedReader(new FileReader(fileName));
	}

	public String ReadLine() throws IOException
	{
		return reader.readLine();
	}

	public static int[] ToInt(String[] arr) throws NumberFormatException
	{
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			res[i] = Integer.parseInt(arr[i]);
		}

		return res;
	}

	public class java {
	}
}
