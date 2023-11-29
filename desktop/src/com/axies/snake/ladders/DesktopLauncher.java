package com.axies.snake.ladders;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {

	private final AxiesSnakeLadders axiesSnakeLadders;

	public static void main (String[] arg) {
		new DesktopLauncher().createGame();
	}

	private DesktopLauncher() { this.axiesSnakeLadders = new AxiesSnakeLadders(); }

	private void createGame() { new Lwjgl3Application(this.axiesSnakeLadders, this.generateConfiguration()); }

	private Lwjgl3ApplicationConfiguration generateConfiguration() {
		final Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(1200, 640);
		config.setForegroundFPS(60);
		config.setTitle("AxieSnakeLadders2");
		config.setIdleFPS(15);
		config.setForegroundFPS(60);
		return config;
	}

}
