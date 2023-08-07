package com.axies.snake.ladders.axie;

import com.axies.snake.ladders.axie.factorys.AxieCreator;
import com.axies.snake.ladders.roninwallet.RoninAccount;
import com.axies.snake.ladders.table.BoxSimple;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.security.Key;
import java.util.List;
import java.util.Map;

public class AxieTokenPlayer {
    Vector2 position;
    Sprite sprite;
    float speed = 500;
    AxieToken axieToken;
    RoninAccount roninAccount;
    AxieCreator axieCreator;
    BoxSimple boxSimple;

    public AxieTokenPlayer(Texture img,AxieToken axieToken) {
        //this.axieToken = axieToken;
        //Gdx.app.log("TAG",String.valueOf(this.axieToken.toString()));
        sprite = new Sprite(img);
        sprite.setScale(0.5f);
        //sprite.setSize(100,100);
        //sprite.setColor(Color.BROWN);
        //position = new Vector2(Gdx.graphics.getWidth()/2,sprite.getScaleY()*sprite.getHeight()/2);
        position = new Vector2(0,0);
        Gdx.app.log("TAG",String.valueOf(Gdx.graphics.getWidth()));
    }

    public void Update(float deltaTime){
        /*if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            position.x-=deltaTime*speed;
            Gdx.app.log("Posicion X: ",String.valueOf(position.x));
            Gdx.app.log("tamaño: ",String.valueOf((sprite.getTexture().getWidth()*sprite.getScaleX())/4));
        }
        if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            position.x+=deltaTime*speed;
            Gdx.app.log("Posicion X: ",String.valueOf(position.x));
            Gdx.app.log("tamaño: ",String.valueOf((sprite.getTexture().getWidth()*sprite.getScaleX())/4));
        }
        if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            position.y+=deltaTime*speed;
            Gdx.app.log("Posicion Y: ",String.valueOf(position.y));
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S)){
            position.y-=deltaTime*speed;
            Gdx.app.log("Posicion Y: ",String.valueOf(position.y));
        }

        //Gdx.app.log("getWidth",String.valueOf(Gdx.graphics.getWidth()));
        //if(!(Math.abs(position.x)<(Gdx.graphics.getWidth()/2))) position.x=(Gdx.graphics.getWidth()/2)-1;
        if(Math.abs(position.x)+(sprite.getTexture().getWidth()*sprite.getScaleX())/4>Gdx.graphics.getWidth()/2) position.x=((sprite.getWidth()/2)-(sprite.getTexture().getWidth()*sprite.getScaleX())/4)*Math.signum(position.x);
        if(Math.abs(position.y)+(sprite.getTexture().getHeight()*sprite.getScaleY())/4>Gdx.graphics.getHeight()/2) position.y=((sprite.getHeight()/2)-(sprite.getTexture().getHeight()*sprite.getScaleY())/4)*Math.signum(position.y);

        //if(position.x+(sprite.getWidth()*sprite.getScaleX()/2)>=Gdx.graphics.getWidth()) position.x=Gdx.graphics.getWidth()-(sprite.getWidth()*sprite.getScaleX()/2);
        */
    }
    public void Draw(SpriteBatch batch){
        Update(Gdx.graphics.getDeltaTime());
        sprite.setPosition(position.x,position.y);
        sprite.draw(batch);
    }
}
