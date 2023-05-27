package com.axies.snake.ladders;

import com.axies.snake.ladders.axie.AxieTokenPlayer;
import com.axies.snake.ladders.di.DaggerPreInterfaceASLComponent;
import com.axies.snake.ladders.di.PreInterfaceASLComponent;
import com.axies.snake.ladders.table.BoxSimple;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

import javax.inject.Inject;
import java.util.logging.Logger;

public class AxiesSnakeLadders2 extends ApplicationAdapter {
	private static final Logger logger = Logger.getLogger(PreInterfaceASL.class.toString());
	AxieTokenPlayer axieTokenPlayer;
	SpriteBatch batch;
	BoxSimple rectangle;
	ShapeRenderer shapeRenderer;
	@Inject
	PreInterfaceASL preInterfaceASL;
	Texture bordeTexture, rellenoTexture;

	@Override
	public void create () {
		DaggerPreInterfaceASLComponent.create().getPreInterfaceAsl();
		batch = new SpriteBatch();
		axieTokenPlayer = new AxieTokenPlayer(new Texture("axie1-min.png"),null);
		rectangle = new BoxSimple(100,100,200,200);
		rectangle.setAxieTokenPlayer(axieTokenPlayer);
		Pixmap pixmap = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
		pixmap.setColor(Color.GRAY);
		pixmap.fill();
		rellenoTexture = new Texture(pixmap);
		pixmap.setColor(Color.RED);
		pixmap.drawRectangle(0, 0, 1, 1);
		bordeTexture = new Texture(pixmap);
		pixmap.dispose();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		rectangle.Draw(batch);
		batch.draw(rellenoTexture, rectangle.x, rectangle.y, rectangle.width, rectangle.height);

		// Dibujamos los bordes del cuadrado
		batch.draw(bordeTexture, rectangle.x, rectangle.y, rectangle.width, 1);
		batch.draw(bordeTexture, rectangle.x, rectangle.y, 1, rectangle.height);
		batch.draw(bordeTexture, rectangle.x + rectangle.width - 1, rectangle.y, 1, rectangle.height);
		batch.draw(bordeTexture, rectangle.x, rectangle.y + rectangle.height - 1, rectangle.width, 1);

		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		bordeTexture.dispose();
		rellenoTexture.dispose();
	}

}
