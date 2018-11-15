package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.gameobject.Character;

public class GameWorld {
	
	private Character character;
	
	public GameWorld() {
		Gdx.app.log("GameWorld", "created");
		
		character = new Character();
	}
	
	public void update(float delta) {
		Gdx.app.log("GameWorld", "update");
		
		//These keep our character from leaving the screen.
		if(character.getRectangle().x > 720)
			character.upperBoundX();
		if(character.getRectangle().x < 0)
			character.lowerBoundX();
		if(character.getRectangle().y > 725)
			character.upperBoundY();
		if(character.getRectangle().y < 0)
			character.lowerBoundY();
	}
	
	public Rectangle getCharacterShape() {
		return character.getRectangle();
	}
	
	public Character getCharacter() {
		return character;
	}
}
