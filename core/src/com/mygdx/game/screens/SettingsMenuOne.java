package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.screens.MainMenu;
import com.mygdx.game.DrRPG;

public class SettingsMenuOne implements Screen{

	final DrRPG game;

	Texture returnToMainMenu;
	Texture settingsBackGround;
	
	public SettingsMenuOne(DrRPG game) {
		this.game = game;
		
		returnToMainMenu = new Texture("returnToMainMenu.png");
		settingsBackGround = new Texture("whiteScreen.png");
	}
	
	
	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		game.batch.begin();
		game.batch.draw(settingsBackGround, 0, 0, 1280, 720);
		
		game.batch.draw(returnToMainMenu, 100, 100, 150, 100);
		
		
		if(Gdx.input.getX() < 100 +  150 && Gdx.input.getX() > 100 && DrRPG.HEIGHT - Gdx.input.getY() < 100 + 100 && DrRPG.HEIGHT - Gdx.input.getY() > 100 && Gdx.input.isTouched() ) {
			this.dispose();
			game.setScreen(new MainMenu(game));
		}
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
