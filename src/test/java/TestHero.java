import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHero
{
	HeroInterface elfW;
	HeroInterface elfA;
	HeroInterface elfM;
	HeroInterface dwarfW;
	HeroInterface dwarfA;
	HeroInterface dwarfM;
	HeroInterface robotW;
	HeroInterface robotA;
	HeroInterface robotM;
	
	@BeforeEach
	void setUp() throws Exception
	{
		HeroInterface elfW = HeroFactory.createHero("ELF", "WARRIOR");
		HeroInterface elfA = HeroFactory.createHero("ELF", "ARCHER");
		HeroInterface elfM = HeroFactory.createHero("ELF", "MAGE");
	
		HeroInterface dwarfW = HeroFactory.createHero("DWARF", "WARRIOR");
		HeroInterface dwarfA = HeroFactory.createHero("DWARF", "ARCHER");
		HeroInterface dwarfM = HeroFactory.createHero("DWARF", "MAGE");
		
		HeroInterface robotW = HeroFactory.createHero("ROBOT", "WARRIOR");
		HeroInterface robotA = HeroFactory.createHero("ROBOT", "ARCHER");
		HeroInterface robotM = HeroFactory.createHero("ROBOT", "MAGE");
	
	}

	@Test
	void testHeroHasRaceAndJob()
	{
		assertEquals("ELF", elfW.getRaceName());
		assertEquals("WARRIOR", elfW.getJobName());
		assertEquals("ELF", elfA.getRaceName());
		assertEquals("ARCHER", elfA.getJobName());
		assertEquals("ELF", elfM.getRaceName());
		assertEquals("MAGE", elfM.getJobName());
		
		assertEquals("DWARF", dwarfW.getRaceName());
		assertEquals("WARRIOR", dwarfW.getJobName());
		assertEquals("DWARF", dwarfA.getRaceName());
		assertEquals("ARCHER", dwarfA.getJobName());
		assertEquals("DWARF", dwarfM.getRaceName());
		assertEquals("MAGE", dwarfM.getJobName());
		
		assertEquals("ROBOT", robotW.getRaceName());
		assertEquals("WARRIOR", robotW.getJobName());
		assertEquals("ROBOT", robotA.getRaceName());
		assertEquals("ARCHER", robotA.getJobName());
		assertEquals("ROBOT", robotM.getRaceName());
		assertEquals("MAGE", robotM.getJobName());
	}
	
	@Test
	void testHeroHasStats()
	{
		assertEquals(25, elfW.getDEX());
		assertEquals(20, elfW.getINT());
		assertEquals(20, elfW.getSTR());
		assertEquals(25, elfA.getDEX());
		assertEquals(20, elfA.getINT());
		assertEquals(20, elfA.getSTR());
		
		assertEquals(20, dwarfW.getDEX());
		assertEquals(20, dwarfW.getINT());
		assertEquals(25, dwarfW.getSTR());
		assertEquals(20, dwarfA.getDEX());
		assertEquals(20, dwarfA.getINT());
		assertEquals(25, dwarfA.getSTR());

		assertEquals(20, robotW.getDEX());
		assertEquals(25, robotW.getINT());
		assertEquals(20, robotW.getSTR());
		assertEquals(20, robotA.getDEX());
		assertEquals(25, robotA.getINT());
		assertEquals(20, robotA.getSTR());
	}
	
	@Test
	void testHeroHasAtk()
	{
		int val = 1;
		
		int elfWatk = elfW.getSTR() * val + elfW.getDEX();
		int elfAatk = (int) (elfA.getDEX() * 1.5 * val);
		int elfMatk = elfM.getDEX() + elfM.getINT() * val;

		int dwarfWatk = dwarfW.getSTR() * val + dwarfW.getDEX();
		int dwarfAatk = (int) (dwarfA.getDEX() * 1.5 * val);
		int dwarfMatk = dwarfM.getDEX() + dwarfM.getINT() * val;

		int robotWatk = robotW.getSTR() * val + robotW.getDEX();
		int robotAatk = (int) (robotA.getDEX() * 1.5 * val);
		int robotMatk = robotM.getDEX() + robotM.getINT() * val;
		
		assertEquals(elfWatk, elfW.attack(val));
		assertEquals(elfAatk, elfA.attack(val));
		assertEquals(elfMatk, elfM.attack(val));
		
		assertEquals(dwarfWatk, dwarfW.attack(val));
		assertEquals(dwarfAatk, dwarfA.attack(val));
		assertEquals(dwarfMatk, dwarfM.attack(val));

		assertEquals(robotWatk, dwarfW.attack(val));
		assertEquals(robotAatk, dwarfA.attack(val));
		assertEquals(robotMatk, dwarfM.attack(val));
	}
	
	@Test
	void testInvalidHeroRaceJob()
	{
		HeroInterface invalidHeroA = HeroFactory.createHero("HUMAN", "WARRIOR");
		HeroInterface invalidHeroB = HeroFactory.createHero("ELF", "CLERK");
		HeroInterface invalidHeroC = HeroFactory.createHero("HUMAN", "CLERK");

		assertEquals(null, invalidHeroA);
		assertEquals(null, invalidHeroB);
		assertEquals(null, invalidHeroC);

	}

}
