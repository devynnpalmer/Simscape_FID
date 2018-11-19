package com.libgdx.game;
import java.util.*;
import java.io.*;
public class TestMain
{
	public static void main(String[] args) {
		 /**Character aCharacter = new Character();
		 aCharacter.setClassChoice(0);
		 aCharacter.configClass(); */
		 
		 CharacterLevel aLevel = new CharacterLevel();
		 aLevel.readInfo(System.getProperty("user.dir") + "/SE2018MW_Group4/Character Level/LevelMaxStats.txt");
		// aLevel.printTest(0);
		 
	}
}

