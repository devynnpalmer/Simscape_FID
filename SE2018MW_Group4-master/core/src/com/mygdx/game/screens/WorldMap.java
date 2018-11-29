package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.DrRPG;

public class WorldMap implements Screen{
	
	private static final int BUTTON_WIDTH = 1200 / 2;
	private static final int BUTTON_HEIGHT = 620 / 2;
	private static final int BUTTON_X = 1200 / 2;
	private static final int BUTTON_Y = 620 / 2;

	final DrRPG game;
	private Stage stage;
	Texture worldMap;
	
	
	public WorldMap (DrRPG game) {
		this.game = game;
		worldMap = new Texture("WorldMap.jpg");	
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		Skin skin = new Skin(Gdx.files.internal("uiskin.json"));
		TextButton btnMap = new TextButton("blah", skin);
		btnMap.setPosition(40,  50);
		btnMap.setSize(BUTTON_WIDTH,  BUTTON_HEIGHT);
		btnMap.addListener(new ClickListener() {
			public void touchUp(InputEvent e, float x, float y, int point, int button) {
				//btnIntroClicked();
			}
		});
		
		stage.addActor(btnMap);
		
		
		
	}

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		game.batch.begin();
		game.batch.draw(worldMap, 0, 0, 1280, 720);
		
		stage.act(delta);
		stage.draw();
		
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
