
public class Hero implements HeroInterface
{
	String heroRace;
	Job heroJob;
	
	public Hero(String raceName, Job jobName)
	{
		this.heroRace = raceName;
		this.heroJob = jobName;
	}

	@Override
	public int attack(int val)
	{
		return heroJob.attack(val, this);
	}

	@Override
	public int getSTR()
	{
		return 20;
	}

	@Override
	public int getDEX()
	{
		return 20;
	}

	@Override
	public int getINT()
	{
		return 20;
	}

	@Override
	public String getRaceName()
	{
		return heroRace;
	}

	@Override
	public String getJobName()
	{
		return heroJob.getJobName();
	}

}
