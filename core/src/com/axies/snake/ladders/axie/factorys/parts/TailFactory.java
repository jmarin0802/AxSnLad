package com.axies.snake.ladders.axie.factorys.parts;

import com.axies.snake.ladders.axie.axieparts.Tail;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.tail.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.tail.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.tail.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.tail.*;
import com.axies.snake.ladders.axie.factorys.AxiePartFactory;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.tail.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.tail.*;
import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;
import com.badlogic.gdx.Gdx;

public class TailFactory implements AxiePartFactory<Tail> {
    @Override
    public Tail instancePart(String part) throws FactoryPartBodyException {
        Gdx.app.log("TailFactory - instancePart - Tail", part.toString());
        switch(part){
            case "Ant": return new Ant();
            case "Carrot": return new Carrot();
            case "Cattail": return new Cattail();
            case "Cloud": return new Cloud();
            case "Cottontail": return new Cottontail();
            case "Feather Fan": return new FeatherFan();
            case "Fish Snack": return new FishSnack();
            case "Gravel Ant": return new GravelAnt();
            case "Gerbil": return new Gerbil();
            case "Gila": return new Gila();
            case "Granma's Fan": return new GranmasFan();
            case "Grass Snake": return new GrassSnake();
            case "Iguana": return new Iguana();
            case "Hare": return new Hare();
            case "Hatsune": return new Hatsune();
            case "Hot Butt": return new HotButt();
            case "Koi": return new Koi();
            case "Navaga": return new Navaga();
            case "Nimo": return new Nimo();
            case "Nut Cracker": return new NutCracker();
            case "Post Fight": return new PostFight();
            case "Potato Leaf": return new PotatoLeaf();
            case "Pupae": return new Pupae();
            case "Ranchu": return new Ranchu();
            case "Rice": return new Rice();
            case "Shiba": return new Shiba();
            case "Shrimp": return new Shrimp();
            case "Snake Jar": return new SnakeJar();
            case "Swallow": return new Swallow();
            case "Tadpole": return new Tadpole();
            case "The Last One": return new TheLastOne();
            case "Thorny Caterpillar": return new ThornyCaterpillar();
            case "Tiny Dino": return new TinyDino();
            case "Twin Tail": return new TwinTail();
            case "Wall Gecko": return new WallGecko();
            case "Yam": return new Yam();
            default:
                throw new FactoryPartBodyException("Not found part body "+Tail.class.toString() );
        }
    }
}
