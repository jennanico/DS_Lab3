
public class Warrior implements Job
{

	public Warrior()
	{
	}

	@Override
	public int attack(int val, HeroInterface hero)
	{
		return hero.getSTR() * val + hero.getDEX();
	}

	@Override
	public String getJobName()
	{
		return "WARRIOR";
	}

}
