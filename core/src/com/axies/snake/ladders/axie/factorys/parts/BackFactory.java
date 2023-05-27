package com.axies.snake.ladders.axie.factorys.parts;

import com.axies.snake.ladders.axie.axieparts.Back;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.back.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.back.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.back.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.back.*;
import com.axies.snake.ladders.axie.factorys.AxiePartFactory;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.back.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.back.*;
import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;
import com.badlogic.gdx.Gdx;

public class BackFactory implements AxiePartFactory<Back> {

    @Override
    public Back instancePart(String part) throws FactoryPartBodyException {
        Gdx.app.log("BackFactory - instancePart - Back", part.toString());
        switch (part){
            case "Anemone": return new Anemone();
            case "Balloon": return new Balloon();
            case "Bidens": return new Bidens();
            case "Blue Moon": return new BlueMoon();
            case "Bone Sail": return new BoneSail();
            case "Buzz Buzz": return new BuzzBuzz();
            case "Croc": return new Croc();
            case "Cupid": return new Cupid();
            case "Furball": return new Furball();
            case "Garish Worm": return new GarishWorm();
            case "Goldfish": return new Goldfish();
            case "Green Thorns": return new GreenThorns();
            case "Hermit": return new Hermit();
            case "Hero": return new Hero();
            case "Indian Star": return new IndianStar();
            case "Jaguar": return new Jaguar();
            case "Kingfisher": return new Kingfisher();
            case "Mint": return new Mint();
            case "Perch": return new Perch();
            case "Pigeon Post": return new PigeonPost();
            case "Pumpkin": return new Pumpkin();
            case "Raven": return new Raven();
            case "Red Ear": return new RedEar();
            case "Risky Beast": return new RiskyBeast();
            case "Ronin": return new Ronin();
            case "Sandal": return new Sandal();
            case "Scarab": return new Scarab();
            case "Shiitake": return new Shiitake();
            case "Snail Shell": return new SnailShell();
            case "Spiky Wing": return new SpikyWing();
            case "Sponge": return new Sponge();
            case "Timber": return new Timber();
            case "Tri Feather": return new TriFeather();
            case "Tri Spikes": return new TriSpikes();
            case "Turnip": return new Turnip();
            case "Watering Can": return new WateringCan();
            default:
                throw new FactoryPartBodyException("Not found part body " + Back.class.toString());
        }

    }
}
