package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.screens.GameScreen;

public class DemoGame extends Game {

	@Override
	public void create() {
		
		Gdx.app.log("DemoGame", "created");
		setScreen(new GameScreen());
	}
	
}
