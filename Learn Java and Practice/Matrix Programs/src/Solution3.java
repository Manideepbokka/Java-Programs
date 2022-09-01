class Player
{
	private String playerName;
	private String team;
	private String playerType;
	private boolean isCaptain;
	private int runs;
	private int wickets;
	Player(String playerName,String team,String playerType,boolean isCaptain,int runs,int wickets)
	{
		this.playerName=playerName;
		this.team=team;
		this.playerType=playerType;
		this.isCaptain=isCaptain;
		this.runs=runs;
		this.wickets=wickets;	
	}
	public String getplayerName()
	{
		return playerName;
	}
	public String getteam()
	{
		return team;
	}
	public String getplayerType()
	{
		return playerType;
	}
	public boolean getisCaptain()
	{
		return isCaptain;
	}
	public int getruns()
	{
		return runs;
	}
	public int getwickets()
	{
		return wickets;
	}	
}
class Tournament
{
	
}
public class Solution3 {
	public static void main(String args[])
	{
		
	}

}
