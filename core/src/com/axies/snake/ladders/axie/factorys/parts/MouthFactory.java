package com.axies.snake.ladders.axie.factorys.parts;

import com.axies.snake.ladders.axie.axieparts.Mouth;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.mouth.Catfish;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.mouth.Lam;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.mouth.Piranha;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.mouth.RiskyFish;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.mouth.AxieKiss;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.mouth.Confident;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.mouth.Goda;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.mouth.NutCracker;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.mouth.Doubletalk;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.mouth.HungryBird;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.mouth.LittleOwl;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.mouth.PeaceMaker;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.mouth.CuteBunny;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.mouth.Mosquito;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.mouth.Pincer;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.mouth.SquareTeeth;
import com.axies.snake.ladders.axie.factorys.AxiePartFactory;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.mouth.Herbivore;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.mouth.Serious;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.mouth.SilenceWhisper;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.mouth.Zigzag;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.mouth.Kotaro;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.mouth.RazorBite;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.mouth.TinyTurtle;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.mouth.ToothlessBite;
import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;
import com.badlogic.gdx.Gdx;

public class MouthFactory implements AxiePartFactory<Mouth> {
    @Override
    public Mouth instancePart(String part) throws FactoryPartBodyException {
        Gdx.app.log("MouthFactory - instancePart - Mouth", part.toString());
        switch (part){
            case "Axie Kiss": return new AxieKiss();
            case "Catfish": return new Catfish();
            case "Confident": return new Confident();
            case "Cute Bunny": return new CuteBunny();
            case "Doubletalk": return new Doubletalk();
            case "Goda": return new Goda();
            case "Herbivore": return new Herbivore();
            case "Hungry Bird": return new HungryBird();
            case "Kotaro": return new Kotaro();
            case "Lam": return new Lam();
            case "Little Owl": return new LittleOwl();
            case "Mosquito": return new Mosquito();
            case "Nut Cracker": return new NutCracker();
            case "Peace Maker": return new PeaceMaker();
            case "Pincer": return new Pincer();
            case "Piranha": return new Piranha();
            case "Razor Bite": return new RazorBite();
            case "Risky Fish": return new RiskyFish();
            case "Serious": return new Serious();
            case "Silence Whisper": return new SilenceWhisper();
            case "Square Teeth": return new SquareTeeth();
            case "Tiny Turtle": return new TinyTurtle();
            case "Toothless Bite": return new ToothlessBite();
            case "Zigzag": return new Zigzag();
            default:
                throw new FactoryPartBodyException("Not found part body "+Mouth.class.toString());
        }
    }
}
