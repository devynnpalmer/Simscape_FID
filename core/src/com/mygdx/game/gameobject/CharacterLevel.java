package com.mygdx.game.gameobject;
import java.io.*;
import java.util.*;

public class CharacterLevel {
	private ArrayList<String> levelInfo;
	private Scanner sc;
	private ArrayList<Integer> level;
	private ArrayList<Integer> maxXP;
	private ArrayList<Integer> maxHP;
	private ArrayList<Integer> maxMP;
	private int currentLevel;
	
	/**
	 * CharacterLevel constructor with all elements initialized
	 */
	public CharacterLevel()
	{
		this.levelInfo = new ArrayList<String>();
		this.maxHP = new ArrayList<Integer>();
		this.maxMP = new ArrayList<Integer>();
		this.maxXP = new ArrayList<Integer>();
		this.level = new ArrayList<Integer>();
		this.currentLevel = 0;
	}
	
	/**
	 * readInfo gets the information from given file about max numbers of stats
	 * @param LevelMaxStats
	 */
	public void readInfo(String LevelMaxStats)
	{
		try
		{
			
			sc = new Scanner (new FileInputStream(LevelMaxStats));
			sc.nextLine();
			while (sc.hasNextLine())
			{
				this.level.add(sc.nextInt());
				this.maxHP.add(sc.nextInt());
				this.maxMP.add(sc.nextInt());
				this.maxXP.add(sc.nextInt());
			}	
			sc.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File name: " + LevelMaxStats);
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	/**
	 * levelUp increment player's level
	 */
	public void levelUp()
	{
		this.currentLevel++;
	}
	
	/**
	 * getCurrentLevel return the current level of the player
	 * @return curerntLevel
	 */
	public int getCurrentLevel()
	{
		return this.currentLevel;
	}
	
	/**
	 * resetLevel resets the level to 0
	 */
	public void resetLevel()
	{
		this.currentLevel = 0;
	}
	
	/**
	 * getLevelMaxHP gets the max HP for requested level
	 * @param level
	 * @return maxHP
	 */
	public int getLevelMaxHP(int level)
	{
		return this.maxHP.get(level);
	}
	
	/**
	 * getLevelMaxMP gets the max MP for requested level
	 * @param level
	 * @return maxMP
	 */
	public int getLevelMaxMP(int level)
	{
		return this.maxMP.get(level);
	}
	
	/**
	 * getLevelMaxXP gets the max XP for requested level before leveling up
	 * @param level
	 * @return maxXP
	 */
	public int getLevelMaxXP(int level)
	{
		return this.maxXP.get(level);
	}
}
