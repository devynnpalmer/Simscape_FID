package com.libgdx.game;
import java.util.*;
import java.io.*;
public class CharacterClass {
	private ArrayList<String> Class;
	private int normalDMG;
	private int MPDMG;
	private int rangeDMG;
	private int classChoice; //0, professor 1, TA  2, Advisor
	private String className;
	
	private Scanner sc;
	
	/**
	 * Constructor to create a Character class object with the user's choice of class
	 * @param classChoice
	 */
	public CharacterClass(int classChoice)
	{
		this.Class = new ArrayList<>();
		this.classChoice = classChoice;
	}
	
	/**
	 * read retrieves the class status (damage info) from given file
	 * @param CharacterClassSpecs
	 */
	public void read(String CharacterClassSpecs)
	{
		try
		{
			sc = new Scanner (new FileInputStream(CharacterClassSpecs));
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();

			while (sc.hasNextLine())
			{
				Class.add(sc.nextLine());
			}
			if (this.classChoice == 0)
			{
				String[] temp = Class.get(0).split(" ", 20);
				this.className = temp[0];
				this.normalDMG = Integer.parseInt(temp[1]);
				this.MPDMG = Integer.parseInt(temp[2]);
				this.rangeDMG = Integer.parseInt(temp[3]);
			}
			else if (this.classChoice == 1)
			{
				String[] temp = Class.get(1).split(" ", 10);
				this.className = temp[0];
				this.normalDMG = Integer.parseInt(temp[1]);
				this.MPDMG = Integer.parseInt(temp[2]);
				this.rangeDMG = Integer.parseInt(temp[3]);
			}
			else if (this.classChoice == 2)
			{
				String[] temp = Class.get(2).split(" ", 10);
				this.className = temp[0];
				this.normalDMG = Integer.parseInt(temp[1]);
				this.MPDMG = Integer.parseInt(temp[2]);
				this.rangeDMG = Integer.parseInt(temp[3]);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File name: " + CharacterClassSpecs);
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
	}
	
	/**
	 * getClassName return the name of the class chosen
	 * @return className
	 */
	public String getClassName()
	{
		return this.className;
	}
	
	/**
	 * getNormalDMG return the normal damage of the class chosen
	 * @return normalDMG
	 */
	public int getNormalDMG()
	{
		return this.normalDMG;
	}
	
	/**
	 * getMPDMG return the magic damage of the class chosen
	 * @return MPDMG
	 */
	public int getMPDMG()
	{
		return this.MPDMG;
	}

	/**
	 * getRangeDMG return the normal damage of the class chosen
	 * @return rangeDMG
	 */
	public int getRangeDMG()
	{
		return this.rangeDMG;
	}
	
	
	/**
	 * Test class, will delete later
	 */
	public void printTest()
	{
		System.out.println(this.className);
		System.out.println(this.normalDMG);
		System.out.println(this.MPDMG);
		System.out.println(this.rangeDMG);
	}
	
	
}
