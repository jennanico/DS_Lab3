
public class Archer implements Job
{

	public Archer()
	{
	}

	@Override
	public int attack(int val, HeroInterface hero)
	{
		return (int) (hero.getDEX() * 1.5 * val);
	}

	@Override
	public String getJobName()
	{
		return "ARCHER";
	}

}
