package com.mygdx.game.gameobject;

public class Character {
	private static String classStats = System.getProperty("user.dir") + "/Character Class/CharacterClassSpecs.txt";
	private static String classInfo = System.getProperty("user.dir") + "/Character Class/CharacterClassInfo.txt";
	private static String classLevel = System.getProperty("user.dir") + "/Character Level/LevelMaxStats.txt";

	private int currentMP;
	private int currentXP;
	private int currentHP;
	
	private String name;
	private String className;
	private String classInformation;
	
	
	private int normalDMG;
	private int magicDMG;
	private int rangeDMG;
	
	CharacterClass Classes;
	CharacterLevel Level;
	private int classChoice; //0, professor 1, TA  2, Advisor
	

	/**
	 * Constructor for character
	 */
	public Character()
	{
		this.currentHP = 0;
		this.currentMP = 0;
		this.currentXP = 0;
		
		this.normalDMG = 0;
		this.magicDMG = 0;
		this.rangeDMG = 0;
		this.classChoice = 0;
		
		this.name = "Dr. Eddy";
	}
	
	/**
	 * setName sets the name of the character with the provided name
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * getName returns the character's name, default is "Dr. Eddy"
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * setClassChoice sets the choice the user select for class
	 * @param classChoice
	 */
	public void setClassChoice(int classChoice)
	{
		this.classChoice = classChoice;
	}
	
	/**
	 * configClass helps configurating class levels and stats and max stats
	 */
	public void configClass()
	{
		this.Classes = new CharacterClass(classChoice);
		this.Level = new CharacterLevel();
		Classes.readSpecs(classStats);
		Classes.readInfo(classInfo);
		Level.readInfo(classLevel);
		this.className = Classes.getClassName();
		this.normalDMG = Classes.getNormalDMG();
		this.rangeDMG = Classes.getRangeDMG();
		this.magicDMG = Classes.getMPDMG();
		this.classInformation = Classes.getClassInfo();	
	}
	
	/**
	 * isLevelUp checks if the character's XP is enough to level up
	 * @return true: currentXP = max XP
	 * @return false: otherwise 
	 */
	public boolean isLevelUp()
	{
		if (this.currentXP == Level.getLevelMaxXP(Level.getCurrentLevel()))
		{
			this.currentXP = 0;
			Level.levelUp();
			return true;
		}
		else 
		{
			return false;
		}
	}
	 
	/**
	 * setHP adds/subtracts a value to HP
	 */
	public void setHP(int value)
	{
		this.currentHP += value;
	}
	
	/**
	 * setMP adds/subtracts a value to MP
	 */
	public void setMP(int value)
	{
		this.currentMP += value;
	}	
	
	/**
	 * setXP adds/subtracts a value to XP
	 */
	public void setXP(int value)
	{
		this.currentXP += value;
	}
	
	/**
	 * getMaxXP get the maximum XP for a certain level, from CharacterLevel class
	 * @return MaxXP of a level
	 */
	public int getMaxXP()
	{
		return Level.getLevelMaxXP(this.Level.getCurrentLevel());
	}

	/**
	 * getMaxMP get the maximum MP for a certain level, from CharacterLevel class
	 * @return MaxMP of a level
	 */
	public int getMaxMP()
	{
		return Level.getLevelMaxMP(this.Level.getCurrentLevel());
	}
	
	/**
	 * getMaxHP get the maximum HP for a certain level, from CharacterLevel class
	 * @return MaxHP of a level
	 */
	public int getMaxHP()
	{
		return Level.getLevelMaxHP(this.Level.getCurrentLevel());
	}
	
	/**
	 * getCurrentLevel get the current level of the character, from CharacterLevel class
	 * @return currentLevel
	 */
	public int getCurrentLevel()
	{
		return Level.getCurrentLevel();
	}
	
	/**
	 * getCurrentMP get the current MP of the character
	 * @return currentMP
	 */
	public int getCurrentMP()
	{
		return this.currentMP;
	}
	
	/**
	 * getCurrentXP get the current XP of the character
	 * @return currentXP
	 */
	public int getCurrentXP()
	{
		return this.currentXP;
	}	

	/**
	 * getCurrentMP get the current HP of the character
	 * @return currentHP
	 */
	public int getCurrentHP()
	{
		return this.currentHP;
	}
	
}
