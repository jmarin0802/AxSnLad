package com.axies.snake.ladders.axie.factorys.parts;

import com.axies.snake.ladders.axie.axieparts.Eyes;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.eyes.Clear;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.eyes.Gero;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.eyes.Sleepless;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.eyes.Telescope;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.horn.Babylonia;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.eyes.Chubby;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.eyes.LittlePeas;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.eyes.Puppy;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.eyes.Zeal;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.eyes.LittleOwl;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.eyes.Lucas;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.eyes.Mavis;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.eyes.Robin;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.eyes.Bookworm;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.eyes.Kotaro;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.eyes.Neo;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.eyes.Nerdy;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.eyes.Scar;
import com.axies.snake.ladders.axie.factorys.AxiePartFactory;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.eyes.Blossom;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.eyes.Confusion;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.eyes.CucumberSlice;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.eyes.Papi;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.eyes.Gecko;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.eyes.Topaz;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.eyes.Tricky;
import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;
import com.badlogic.gdx.Gdx;

public class EyesFactory implements AxiePartFactory<Eyes> {
    @Override
    public Eyes instancePart(String part) throws FactoryPartBodyException {
        Gdx.app.log("EyesFactory - instancePart - Eyes", part.toString());
        switch (part) {
            case "Blossom": return new Blossom();
            case "Bookworm": return new Bookworm();
            case "Chubby": return new Chubby();
            case "Clear": return new Clear();
            case "Confusion": return new Confusion();
            case "Cucumber Slice": return new CucumberSlice();
            case "Gecko": return new Gecko();
            case "Gero": return new Gero();
            case "Kotaro?": return new Kotaro();
            case "Little Owl": return new LittleOwl();
            case "Little Peas": return new LittlePeas();
            case "Lucas": return new Lucas();
            case "Mavis": return new Mavis();
            case "Neo": return new Neo();
            case "Nerdy": return new Nerdy();
            case "Papi": return new Papi();
            case "Puppy": return new Puppy();
            case "Robin": return new Robin();
            case "Scar": return new Scar();
            case "Sleepless": return new Sleepless();
            case "Telescope": return new Telescope();
            case "Topaz": return new Topaz();
            case "Tricky": return new Tricky();
            case "Zeal": return new Zeal();
            default:
                throw new FactoryPartBodyException("Not found part body "+Eyes.class.toString());
        }
    }
}
