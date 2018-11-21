package com.mygdx.helperclasses;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.mygdx.gameobject.Character;

public class InputHandler implements InputProcessor{
	
	private Character character;
	
	public InputHandler(Character character) {
		this.character = character;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if(keycode == Keys.DOWN)
			character.onPressDOWN();
		if(keycode == Keys.UP)
			character.onPressUP();
		if(keycode == Keys.RIGHT)
			character.onPressRIGHT();
		if(keycode == Keys.LEFT)
			character.onPressLEFT();
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
