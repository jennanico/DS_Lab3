
public class Mage implements Job
{

	public Mage()
	{
	}

	@Override
	public int attack(int val, HeroInterface hero)
	{
		return hero.getDEX() + hero.getINT() * val;
	}

	@Override
	public String getJobName()
	{
		return "MAGE";
	}

}
