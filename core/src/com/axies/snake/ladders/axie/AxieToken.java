package com.axies.snake.ladders.axie;

import com.axies.snake.ladders.axie.axieparts.*;
import com.axies.snake.ladders.axie.axietype.AxieType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class AxieToken {

    private Back back;
    private Body body;
    private Ears ears;
    private Eyes eyes;
    private Horn horn;
    private Mouth mouth;
    private Tail tail;
    private AxieType axieType;



    public AxieToken(Back back, Ears ears, Eyes eyes, Horn horn, Mouth mouth, Tail tail, Body body, AxieType axieType) {
        this.back = back;
        this.ears = ears;
        this.eyes = eyes;
        this.horn = horn;
        this.mouth = mouth;
        this.tail = tail;
        this.body = body;
        this.axieType = axieType;
        Gdx.app.log("AxieToken",toString());
    }

    public AxieType getAxieType() {
        return axieType;
    }

    public void setAxieType(AxieType axieType) {
        this.axieType = axieType;
    }

    public Back getBack() {
        return back;
    }

    public void setBack(Back back) {
        this.back = back;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Ears getEars() {
        return ears;
    }

    public void setEars(Ears ears) {
        this.ears = ears;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Horn getHorn() {
        return horn;
    }

    public void setHorn(Horn horn) {
        this.horn = horn;
    }

    public Mouth getMouth() {
        return mouth;
    }

    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }

    public Tail getTail() {
        return tail;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "AxieToken{\n" +
                "back=" + back.getClass().toString() +
                ",\n ears=" + ears.getClass().toString() +
                ",\n eyes=" + eyes.getClass().toString() +
                ",\n horn=" + horn.getClass().toString() +
                ",\n mouth=" + mouth.getClass().toString() +
                ",\n tail=" + tail.getClass().toString() +
                ",\n body=" + body.getClass().toString() +
                ",\n axieType=" + axieType.getClass().toString() +
                "}";
    }
}
