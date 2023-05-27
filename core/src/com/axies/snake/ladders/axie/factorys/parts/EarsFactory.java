package com.axies.snake.ladders.axie.factorys.parts;

import com.axies.snake.ladders.axie.axieparts.Ears;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.ears.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.ears.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.ears.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.ears.*;
import com.axies.snake.ladders.axie.factorys.AxiePartFactory;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.ears.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.ears.*;
import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;
import com.badlogic.gdx.Gdx;

public class EarsFactory implements AxiePartFactory<Ears> {
    @Override
    public Ears instancePart(String part) throws FactoryPartBodyException {
        Gdx.app.log("EarsFactory - instancePart - Ears", part.toString());
        switch (part){
            case "Beetle Spike": return new BeetleSpike();
            case "Belieber": return new Belieber();
            case "Bubblemaker": return new Bubblemaker();
            case "Clover": return new Clover();
            case "Curly": return new Curly();
            case "Curved Spine": return new CurvedSpine();
            case "Early Bird": return new EarlyBird();
            case "Ear Breathing": return new EarBreathing();
            case "Earwing": return new Earwing();
            case "Friezard": return new Friezard();
            case "Gill": return new Gill();
            case "Hollow": return new Hollow();
            case "Inkling": return new Inkling();
            case "Innocent Lamb": return new InnocenntLamb();
            case "Larva":return new Larva();
            case "Leaf Bug":return new LeafBug();
            case "Leafy": return new Leafy();
            case "Little Owl": return new LittleOwl();
            case "Lotus": return new Lotus();
            case "Nimo": return new Nimo();
            case "Nut Cracker": return new NutCracker();
            case "Nyan": return new Nyan();
            case "Peace Maker": return new PeaceMaker();
            case "Pink Cheek": return new PinkCheek();
            case "Pogona": return new Pogona();
            case "Puppy": return new Puppy();
            case "Risky Bird": return new RiskyBird();
            case "Rosa": return new Rosa();
            case "Sakura": return new Sakura();
            case "Seaslug": return new Seaslug();
            case "Sidebarb": return new Sidebard();
            case "Small Frill": return new SmallFrill();
            case "Swirl": return new Swirl();
            case "Tassels": return new Tassels();
            case "Tiny Fan": return new TinyFan();
            case "Zen": return new Zen();
            default:
                throw new FactoryPartBodyException("Not found part body "+Ears.class.toString());
            }

    }
}
