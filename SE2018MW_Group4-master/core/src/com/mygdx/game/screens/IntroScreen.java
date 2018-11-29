package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.DrRPG;

public class IntroScreen implements Screen {
	
	private static final int BUTTON_WIDTH = 1200;
	private static final int BUTTON_HEIGHT = 620;
	private static final int BUTTON_X = 1200;
	private static final int BUTTON_Y = 620;
	
	private static final String intro = "You are Dr. Brian Eddy. "
			+ "\n "
			+ "\n You proudly hold a Ph.D. in Computer Science from the University"
			+ "\n of Alabama. You are currently a professor at the University of West"
			+ "\n Florida and you take pride in teaching young Computer Science hopefuls."
			+ "\n It is your duty to teach and it is your pupil's duty to learn, but"
			+ "\n  that doesn't stop a few lazy students from asking for grade bumps "
			+ "\n or extra credit at the end of each term. Every semester you dread "
			+ "\n finals week as you must thwart the unrelenting waves of grade-grubbing "
			+ "\n students. "
			+ "\n " 
			+ "\nThis is your story."
			+ "\n "
			+ "\n "
			+ "\n "
			+ "\n "
			+ "\n(Click to continue)";
	
	
	final DrRPG game;
	private Stage stage;
	Texture introScreen;
	
	public IntroScreen (DrRPG game) {
		this.game = game;
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		Skin skin = new Skin(Gdx.files.internal("uiskin.json"));
		TextButton btnIntro = new TextButton(intro, skin);
		btnIntro.setPosition(40,  50);
		btnIntro.setSize(BUTTON_WIDTH,  BUTTON_HEIGHT);
		btnIntro.addListener(new ClickListener() {
			public void touchUp(InputEvent e, float x, float y, int point, int button) {
				btnIntroClicked();
			}
		});
		
		stage.addActor(btnIntro);
	}
	
	public void btnIntroClicked() {
		game.setScreen(new WorldMap(game));
		this.dispose();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0,  0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		
		stage.act(delta);
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
