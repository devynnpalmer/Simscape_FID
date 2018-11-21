package com.mygdx.gameobject;



import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.libgdx.game.screens.MainMenu;



public class DrRPG extends Game {
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	
	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();

		this.setScreen(new MainMenu(this));
		
	}

	@Override
	public void render () {
		
	super.render();
	}
	
	@Override
	public void resize (int width, int height) {
	super.resize(width, height);
	}
}
