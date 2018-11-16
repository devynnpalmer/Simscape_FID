package com.libgdx.game;
import java.util.*;
import java.io.*;
public class TestMain
{
	public static void main(String[] args) {
		 CharacterClass a = new CharacterClass(0);
		 a.readInfo(System.getProperty("user.dir") + "/SE2018MW_Group4/Character Class/CharacterClassInfo.txt");
		 a.printTest();
	}
}

