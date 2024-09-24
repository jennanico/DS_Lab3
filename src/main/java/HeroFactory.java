public class HeroFactory
{

   public static HeroInterface createHero(String raceName, String jobName)   
   {
      Hero myHero = null;
      
      Warrior wJob = new Warrior();
      Archer aJob = new Archer();
      Mage mJob = new Mage();
	  
	  if (raceName == "ELF")
      {
    	  if (jobName == "WARRIOR")
    	  {
    		  myHero = new Elf("ELF", wJob);
    	  } else if (jobName == "ARCHER")
    	  {
    		  myHero = new Elf("ELF", aJob);
    	  } else if (jobName == "MAGE")
    	  {
    		  myHero = new Elf("ELF", mJob);
    	  }
      } else if (raceName == "DWARF")
      {
    	  if (jobName == "WARRIOR")
    	  {
    		  myHero = new Dwarf("DWARF", wJob);
    	  } else if (jobName == "ARCHER")
    	  {
    		  myHero = new Dwarf("DWARF", aJob);
    	  } else if (jobName == "MAGE")
    	  {
    		  myHero = new Dwarf("DWARF", mJob);
    	  }
      } else if (raceName == "ROBOT")
      {
    	  if (jobName == "WARRIOR")
    	  {
    		  myHero = new Robot("ROBOT", wJob);
    	  } else if (jobName == "ARCHER")
    	  {	
    		  myHero = new Robot("ROBOT", aJob);
    	  } else if (jobName == "MAGE")
    	  {
    		  myHero = new Robot("ROBOT", mJob);
    	  }
      }
	  
	  return myHero;
   }







}