//Thomas Killeen C16394453 LabTest 14/02/18
package ie.dit;

public class Tune()
{
    public int x;
	public String title, altTitle, notation;
	
	public String toString()
	{
		System.out.println(x + title + altTitle + notation + EditDistance.MinimumEditDistance(x, title, altTitle, notation));
	}
	public interface Player
	{
		void play();
	}
}