class Tweet
{
	private String message;
	//add 2 more instance variables
    private int retweets, likes;
	
	public Tweet( String m, int r, int lk )
	{
		//finish the constructor
        message = m; retweets = r; likes = lk;
	}
	
	public void addLikes( int n )
	{
		//code
        likes += n;
	}
	
	public void addRetweets( int n )
	{
		//code
        retweets += n;
	}
	
	public boolean notLiked()
	{
		return likes < 10;
	}
	
	public boolean kindaLiked()
	{
		return likes > retweets;
	}
	
	public boolean isTrending()
	{
		return likes + retweets > 75;
	}
	
	public String toString()
	{
		return "msg " + message + " rt " + retweets + " lk " + likes;
	}
}