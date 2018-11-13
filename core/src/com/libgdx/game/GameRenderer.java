package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class GameRenderer {
	
	private GameWorld world;
	private OrthographicCamera cam;
	private ShapeRenderer shapeRenderer;
	
	public GameRenderer(GameWorld world) {
		Gdx.app.log("GameRenderer", "created");
		this.world = world;
		
		cam = new OrthographicCamera();
		cam.setToOrtho(true, 750, 750);
		
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(cam.combined);
	}
	
	public void render() {
		Gdx.app.log("GameRenderer", "render");
		
		//Begin rendering the shape
		shapeRenderer.begin(ShapeType.Filled);
		shapeRenderer.setColor(Color.GOLD);
		shapeRenderer.rect(world.getCharacterShape().x, world.getCharacterShape().y, world.getCharacterShape().width, world.getCharacterShape().height);
		shapeRenderer.end();
	}
}
