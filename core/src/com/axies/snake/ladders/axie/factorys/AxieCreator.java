package com.axies.snake.ladders.axie.factorys;

import com.axies.snake.ladders.axie.AxieToken;
import com.axies.snake.ladders.axie.axietype.AxieType;
import com.axies.snake.ladders.axie.factorys.parts.*;
import com.badlogic.gdx.Gdx;

import javax.inject.Inject;
import java.util.logging.Logger;

public class AxieCreator {
    private BackFactory back;
    private BodyFactory body;
    private EarsFactory ears;
    private EyesFactory eyes;
    private HornFactory horn;
    private MouthFactory mouth;
    private TailFactory tail;

    @Inject
    public AxieCreator() {
        Gdx.app.log(AxieCreator.class.toString(),"Constructor");
        this.back = new BackFactory();
        this.body = new BodyFactory();
        this.ears = new EarsFactory();
        this.eyes = new EyesFactory();
        this.horn = new HornFactory();
        this.mouth = new MouthFactory();
        this.tail = new TailFactory();
    }

    public AxieToken initCreatorAxie(String back, String ears, String eyes, String horn, String mouth, String tail, String body, String axieType) throws NoSuchMethodException {
        Gdx.app.log(AxieCreator.class.getName().toString(), "Método: initCreatorAxie");
        return new AxieToken(
                this.back.instancePart(back),
                this.ears.instancePart(ears),
                this.eyes.instancePart(eyes),
                this.horn.instancePart(horn),
                this.mouth.instancePart(mouth),
                this.tail.instancePart(tail),
                this.body.instancePart(body),
                AxieType.valueOf(axieType));
    }

    @Override
    public String toString() {
        return "AxieCreator{" +
                "back=" + back +
                ", body=" + body +
                ", ears=" + ears +
                ", eyes=" + eyes +
                ", horn=" + horn +
                ", mouth=" + mouth +
                ", tail=" + tail +
                '}';
    }
}
