package com.libgdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

import com.libgdx.game.DrRPG;

public class MainMenu implements Screen{

	private static final int BUTTON_WIDTH = 300;
	private static final int BUTTON_HEIGHT = 120;
	private static final int NEW_GAME_BUTTON_Y = 300;
	private static final int BUTTON_X = DrRPG.WIDTH / 2 - BUTTON_WIDTH / 2;
	private static final int LOAD_GAME_BUTTON_Y = 150;
	private static final int QUIT_GAME_BUTTON_Y = 0;

	
	
	final DrRPG game;
	
	Texture backGround;
	Texture newGameButton;
	Texture loadGameButton;
	Texture quitGameButton;
	Texture settingsButton;
	Texture logo;
	
	
	public MainMenu (final DrRPG game) {
		
		this.game = game;
		backGround = new Texture("backGround.png");
		newGameButton = new Texture("newGameButton.png");
		loadGameButton = new Texture("loadGameButton.png");
		quitGameButton = new Texture("quitGameButton.png");
		settingsButton = new Texture("settingsButton.png");
		logo = new Texture("logo.png");
		
		final MainMenu mainMenu = this;
		
	}
	
	
	
	
	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		
		game.batch.begin();
		game.batch.draw(backGround, 0, 0, 1280, 720);
		game.batch.draw(newGameButton, BUTTON_X, NEW_GAME_BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT);
		if(Gdx.input.getX() < BUTTON_X +  BUTTON_WIDTH && Gdx.input.getX() > BUTTON_X && DrRPG.HEIGHT - Gdx.input.getY() < NEW_GAME_BUTTON_Y + BUTTON_HEIGHT && DrRPG.HEIGHT - Gdx.input.getY() > NEW_GAME_BUTTON_Y && Gdx.input.isTouched() ) {
			this.dispose();
			game.setScreen(new WorldMap(game));
		}
		game.batch.draw(loadGameButton, BUTTON_X, LOAD_GAME_BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT);
		game.batch.draw(quitGameButton, BUTTON_X, QUIT_GAME_BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT);
		if(Gdx.input.getX() < BUTTON_X +  BUTTON_WIDTH && Gdx.input.getX() > BUTTON_X && DrRPG.HEIGHT - Gdx.input.getY() < QUIT_GAME_BUTTON_Y + BUTTON_HEIGHT && DrRPG.HEIGHT - Gdx.input.getY() > QUIT_GAME_BUTTON_Y && Gdx.input.isTouched() ) {
			Gdx.app.exit();
		}
		game.batch.draw(settingsButton, 1000, 640, BUTTON_WIDTH, BUTTON_HEIGHT);
		
		
		
		
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
