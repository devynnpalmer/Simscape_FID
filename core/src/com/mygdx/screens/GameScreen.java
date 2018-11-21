package com.mygdx.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.gameworld.GameRenderer;
import com.mygdx.gameworld.GameWorld;
import com.mygdx.helperclasses.InputHandler;

public class GameScreen implements Screen{
	
	private GameWorld world;
	private GameRenderer renderer;
	
	public GameScreen() {
		
		Gdx.app.log("GameScreen", "attached screen");
		world = new GameWorld();
		renderer = new GameRenderer(world);
		
		Gdx.input.setInputProcessor(new InputHandler(world.getCharacter()));
	}
	
	@Override
	public void show() {
		Gdx.app.log("GameScreen", "show");
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		world.update(delta);
		renderer.render();
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log("GameScreen", "resized");
		
	}

	@Override
	public void pause() {
		Gdx.app.log("GameScreen", "paused");
		
	}

	@Override
	public void resume() {
		Gdx.app.log("GameScreen", "resumed");
		
	}

	@Override
	public void hide() {
		Gdx.app.log("GameScreen", "hidden");
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
