package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.DrRPG;

public class WorldMap implements Screen{

	final DrRPG game;

	Texture worldMap;
	
	
	public WorldMap (DrRPG game) {
		this.game = game;
		worldMap = new Texture("WorldMap.png");
		
		
		
	}

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		game.batch.begin();
		game.batch.draw(worldMap, 0, 0, 1280, 720);
		
		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}
	

}
