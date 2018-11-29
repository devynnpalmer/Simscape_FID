package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;


import com.mygdx.game.DrRPG;



public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = DrRPG.WIDTH;
		config.height = DrRPG.HEIGHT;
		config.resizable = true;
		
		new LwjglApplication(new DrRPG(), config);
	}
}
