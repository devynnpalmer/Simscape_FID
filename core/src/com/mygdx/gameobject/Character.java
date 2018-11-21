package com.libgdx.game;

public class Character {
	private static String classStats = System.getProperty("user.dir") + "/SE2018MW_Group4/Character Class/CharacterClassSpecs.txt";
	private static String classInfo = System.getProperty("user.dir") + "/SE2018MW_Group4/Character Class/CharacterClassInfo.txt";

	private int currentMP;
	private int currentXP;
	private int currentHP;
	
	private int maxMP;
	private int maxHP;
	private int maxXP;
	
	private int level;
	private String name;
	private String className;
	
	
	private int normalDMG;
	private int magicDMG;
	private int rangeDMG;
	
	CharacterClass Classes;
	private int classChoice; //0, professor 1, TA  2, Advisor
	

	/**
	 * Constructor for character
	 */
	public Character()
	{
		this.currentHP = 0;
		this.currentMP = 0;
		this.currentXP = 0;
		
		this.level = 0;
		this.maxHP = 0;
		this.maxMP = 0;
		this.maxXP = 0;
		
		this.normalDMG = 0;
		this.magicDMG = 0;
		this.rangeDMG = 0;
		
	}
	
	/**
	 * setClassChoice sets the choice the user select for class
	 * @param classChoice
	 */
	public void setClassChoice(int classChoice)
	{
		this.classChoice = classChoice;
	}
	
	
	public void configClass()
	{
		this.Classes = new CharacterClass(classChoice);
		Classes.readSpecs(classStats);
		Classes.readInfo(classInfo);
		this.className = Classes.getClassName();
		this.normalDMG = Classes.getNormalDMG();
		this.rangeDMG = Classes.getRangeDMG();
		this.magicDMG = Classes.getMPDMG();
		System.out.println(this.className);
		System.out.println(Classes.getClassInfo());
	}
	
}
