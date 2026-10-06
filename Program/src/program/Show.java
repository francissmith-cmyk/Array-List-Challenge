package program;

	public class Show
	{
	private int seasons;
	private String title;
	private String genre;

public Show(int s, String t, String g)
		{
		seasons = s;
		title = t;
		genre = g;
		}

	public int getSeasons()
		{
		return seasons;
		}

	public void setSeasons(int seasons)
		{
		this.seasons = seasons;
		}

	public String getTitle()
		{
		return title;
		}

	public void setTitle(String title)
		{
		this.title = title;
		}

	public String getGenre()
	{
	return genre;
	}

public void setGenre(String genre)
	{
	this.genre = genre;
	}
	}

