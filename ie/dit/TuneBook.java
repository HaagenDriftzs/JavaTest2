package ie.dit();

import java.util.ArrayList;

public class TuneBook()
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	public String toString()
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
	public String toString(String tunes)
	{
			System.out.println(tunes);
	}
	public Tune findTune(String title)
	{
		int closestTi = Integer.Max_Value;
		String closestTitle = "";
		for(String t:title)
		{
			int ti = EditDistance.MinimumEditDistance(title, t);
			if(ti == 0)
			{
				return title;
			}
			if(ti < closestTi)
			{
				closestTi = ti;
				closestTitle = t;
			}
		}
		return closestTitle;
	}
	public interface Player
	{
		void play();
	}
	public static void main(String[] args)
	{
		
	}
}