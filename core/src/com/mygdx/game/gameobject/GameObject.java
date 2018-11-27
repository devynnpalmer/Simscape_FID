package com.mygdx.game.gameobject;

import com.badlogic.gdx.math.Rectangle;

public class GameObject {
	
	private Rectangle rectangle;
	
	public GameObject() {
		rectangle = new Rectangle(0, 0, 30, 25);
	}
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	
	public void onPressDOWN() {
		rectangle.setPosition(rectangle.x, rectangle.y + 15);
	}
	
	public void onPressUP() {
		rectangle.setPosition(rectangle.x, rectangle.y - 15);
	}
	
	public void onPressRIGHT() {
		rectangle.setPosition(rectangle.x + 15, rectangle.y);
	}
	
	public void onPressLEFT() {
		rectangle.setPosition(rectangle.x - 15, rectangle.y);
	}
	
	public void upperBoundX() {
		rectangle.setPosition(720, rectangle.y);
	}
	
	public void lowerBoundX() {
		rectangle.setPosition(0, rectangle.y);
	}
	
	public void upperBoundY() {
		rectangle.setPosition(rectangle.x, 725);
	}
	
	public void lowerBoundY() {
		rectangle.setPosition(rectangle.x, 0);
	}
}
