package com.mygdx.game.gameobject;
import java.util.*;
import java.io.*;
public class CharacterClass {
	
	private ArrayList<String> classSpecs;
	private ArrayList<String> classInfo;	
	private int normalDMG;
	private int MPDMG;
	private int rangeDMG;
	private int classChoice; //0, professor 1, TA  2, Advisor
	private String className;
	private String classInformation;
	
	private Scanner sc;
	
	/**
	 * Constructor to create a Character class object with the user's choice of class
	 * @param classChoice
	 */
	public CharacterClass(int classChoice)
	{
		this.normalDMG = 0;
		this.rangeDMG = 0;
		this.MPDMG = 0;
		this.classSpecs = new ArrayList<String>();
		this.classInfo = new ArrayList<String>();
		this.classChoice = classChoice;
	}
	
	/**
	 * read retrieves the class Info (Class info) from given file
	 * @param CharacterClassInfo
	 */
	public void readInfo(String CharacterClassInfo)
	{
		try
		{
			sc = new Scanner (new FileInputStream(CharacterClassInfo));

			while (sc.hasNextLine())
			{
				classInfo.add(sc.nextLine());
			}
			if (this.classChoice == 0)
			{
				this.classInformation = classInfo.get(0);
			}
			else if (this.classChoice == 1)
			{
				this.classInformation = classInfo.get(1);
			}
			else if (this.classChoice == 2)
			{
				this.classInformation = classInfo.get(2);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File name: " + CharacterClassInfo);
			System.out.println(e.getMessage());
			System.exit(0);
		}
		sc.close();
	}
	
	/**
	 * read retrieves the class status (damage info) from given file
	 * @param CharacterClassSpecs
	 */
	public void readSpecs(String CharacterClassSpecs)
	{
		try
		{
			sc = new Scanner (new FileInputStream(CharacterClassSpecs));
			sc.nextLine();
			sc.nextLine();
			sc.nextLine();

			while (sc.hasNextLine())
			{
				classSpecs.add(sc.nextLine());
			}
			if (this.classChoice == 0)
			{
				String[] temp = classSpecs.get(0).split(" ", 20);
				this.className = temp[0];
				this.normalDMG = Integer.parseInt(temp[1]);
				this.MPDMG = Integer.parseInt(temp[2]);
				this.rangeDMG = Integer.parseInt(temp[3]);
			}
			else if (this.classChoice == 1)
			{
				String[] temp = classSpecs.get(1).split(" ", 20);
				this.className = temp[0];
				this.normalDMG = Integer.parseInt(temp[1]);
				this.MPDMG = Integer.parseInt(temp[2]);
				this.rangeDMG = Integer.parseInt(temp[3]);
			}
			else if (this.classChoice == 2)
			{
				String[] temp = classSpecs.get(2).split(" ", 20);
				this.className = temp[0];
				this.normalDMG = Integer.parseInt(temp[1]);
				this.MPDMG = Integer.parseInt(temp[2]);
				this.rangeDMG = Integer.parseInt(temp[3]);
			}
			sc.close();
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
	 * getClassStats gets the status of the classes from a file and display the required index as a string
	 * @param index
	 * @return String representing modified required class stats
	 */
	public String getClassStats(int index)
	{
		String result = "";
		String[] temp = classSpecs.get(index).split(" ", 20);
		result += "Class: " + temp[0] + "\t+Normal Damage: " + temp[1] + "\t+Magic Damage: " + temp[2] + "\t+Range Damage: " + temp[3] + "\t.";
		return result;
	}
	
	/**
	 * getClassInfo gets the class information (text) as a string
	 * @param index
	 * @return String stored in ClassInfo's index
	 */
	public String getClassInfo(int index)
	{
		return classInfo.get(index);
	}
	
	/**
	 * getClassInfo gets the class information without the index
	 * @return classInformation
	 */
	public String getClassInfo()
	{
		return this.classInformation;
	}
	
	/**
	 * Test class, will delete later
	 */
	public void printTest()
	{
		System.out.println(this.classInfo);
	}
	
	
}
