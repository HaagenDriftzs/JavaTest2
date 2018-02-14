//Thomas Killeen C16394453 LabTest 14/02/18
package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook()
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	public void loadData(String l)
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
	
	public static void main(String[] args)
	{
		TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune t = tb.findTune("Scotsman over the Border");
        t.play();
	}
}