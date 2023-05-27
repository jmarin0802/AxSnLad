package com.axies.snake.ladders.table;

import com.axies.snake.ladders.axie.AxieToken;
import com.axies.snake.ladders.axie.AxieTokenPlayer;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class BoxSimple extends Rectangle {

    AxieTokenPlayer axieTokenPlayer;
    public BoxSimple() {
    }

    public BoxSimple(float x, float y, float width, float height) {
        super(x, y, width, height);
    }

    public BoxSimple(Rectangle rect) {
        super(rect);
    }

    public AxieTokenPlayer getAxieTokenPlayer() {
        return axieTokenPlayer;
    }

    public void setAxieTokenPlayer(AxieTokenPlayer axieTokenPlayer) {
        this.axieTokenPlayer = axieTokenPlayer;
    }

    public void Draw(SpriteBatch batch){
        sprite.draw(batch);
    }
}
