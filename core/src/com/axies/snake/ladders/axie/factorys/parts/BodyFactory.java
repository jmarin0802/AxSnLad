package com.axies.snake.ladders.axie.factorys.parts;

import com.axies.snake.ladders.axie.axieparts.Body;
import com.axies.snake.ladders.axie.factorys.AxiePartFactory;

public class BodyFactory implements AxiePartFactory<Body> {
    @Override
    public Body instancePart(String part) {
        return new com.axies.snake.ladders.axie.axieparts.axieclass.body.Body();
    }
}
