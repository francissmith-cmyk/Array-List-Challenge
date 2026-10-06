package program;
import java.util.ArrayList;
public class ProgramRunner 
{
	public static void main(String[] args) 
	{
	ArrayList <Show> TVShows = new ArrayList <Show>();
	TVShows.add(new Show (100, "Generic Show", "miscellaneous"));
	TVShows.add(new Show (-5, "This Show is Funny (please laugh i don't want to be fired)", "comedy"));
	TVShows.add(new Show (5, "Spoopy Show", "horror"));
	TVShows.add(new Show (10, "Corny Romantic Show", "romance"));
	TVShows.add(new Show (10, "Generic Show Spinoff: Joe Goes to a Store", "adventure"));
	printList(TVShows);
	}
	private static void printList(ArrayList<Show> TV) 
	{
		for (int i = 0; i < TV.size(); i++)
		{
		System.out.print(TV.get(i).getTitle()+", ");
		System.out.print(TV.get(i).getGenre()+", ");
		System.out.print(TV.get(i).getSeasons()+" years");
		System.out.println();
		}
		
	}
}
