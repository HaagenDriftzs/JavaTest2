package ie.dit();

import java.util.ArrayList;

public class TuneBook()
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	public void TuneBook(String)
	{
		BufferedReader inputStream = null;
		try
		{
			inputStream = new BufferedReader(new FileReader("hnj0.abc.txt"));
			
			String l;
			while((l=inputStream.readline())!=null)
			{
				tunes.add(l);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(inputStream != null)
			{
				try
				{
					inputStream.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}