package com.mygdx.game.gameobject;
import java.util.*;
import java.io.*;
public class TestMain
{
	public static void main(String[] args) {
		 Character aCharacter = new Character();
		 aCharacter.setClassChoice(0);
		 aCharacter.configClass();	 
		 aCharacter.setXP(50);
		 aCharacter.isLevelUp();
		 System.out.println(aCharacter.getCurrentLevel());
	}
}

