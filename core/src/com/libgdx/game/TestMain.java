package com.libgdx.game;
import java.util.*;
import java.io.*;
public class TestMain
{
	public static void main(String[] args) {
		 CharacterClass a = new CharacterClass(0);
		 a.read(System.getProperty("user.dir") + "/SE2018MW_Group4/Character Class/CharacterClassSpecs.txt");//+ "/SE2018MW_Group4/core/src/com/libgdx/game/CharacterClassSpecs");
		 a.printTest();
	}
}

