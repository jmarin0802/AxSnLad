package com.axies.snake.ladders.axie.factorys;

import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;

public interface AxiePartFactory <T>{
    T instancePart(String part) throws FactoryPartBodyException;
}
