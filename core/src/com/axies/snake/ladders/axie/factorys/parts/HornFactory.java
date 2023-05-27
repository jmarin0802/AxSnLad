package com.axies.snake.ladders.axie.factorys.parts;

import com.axies.snake.ladders.axie.axieparts.Horn;
import com.axies.snake.ladders.axie.axieparts.axieclass.aquatic.horn.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.beast.horn.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bird.horn.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.bug.horn.*;
import com.axies.snake.ladders.axie.factorys.AxiePartFactory;
import com.axies.snake.ladders.axie.axieparts.axieclass.plant.horn.*;
import com.axies.snake.ladders.axie.axieparts.axieclass.reptile.horn.*;
import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;
import com.badlogic.gdx.Gdx;

public class HornFactory implements AxiePartFactory<Horn> {
    @Override
    public Horn instancePart(String part) throws FactoryPartBodyException {
        Gdx.app.log("HornFactory - instancePart - Horn", part.toString());
        switch (part){
            case "Anemone": return new Anemone();
            case "Antenna": return new Antenna();
            case "Arco": return new Arco();
            case "Babylonia": return new Babylonia();
            case "Bamboo Shoot": return new BambooShoot();
            case "Bamboo Spear": return new BambooShoot();
            case "Beech": return new Beech();
            case "Bumpy": return new Bumpy();
            case "Cactus": return new Cactus();
            case "Caterpillars": return new Caterpillars();
            case "Cerastes": return new Cerastes();
            case "Clamshell": return new Clamshell();
            case "Cuckoo": return new Cuckoo();
            case "Dual Blade": return new DualBlade();
            case "Eggshell": return new Eggshell();
            case "Feather Spear": return new FeatherSpear();
            case "Imp": return new Imp();
            case "Incisor": return new Incisor();
            case "Kestrel": return new Kestrel();
            case "Lagging": return new Lagging();
            case "Leaf Bug": return new LeafBug();
            case "Little Branch": return new LittleBranch();
            case "Merry": return new Merry();
            case "Oranda": return new Oranda();
            case "Parasite": return new Parasite();
            case "Pliers": return new Pliers();
            case "Pocky": return new Pocky();
            case "Rose Bud": return new RoseBud();
            case "Scaly Spoon": return new ScalySpoon();
            case "Scaly Spear": return new ScalySpoon();
            case "Shoal Star": return new ShoalStar();
            case "Strawberry Shortcake": return new StrawberryShortcake();
            case "Teal Shell": return new TealShell();
            case "Trump": return new Trump();
            case "Unko": return new Unko();
            case "Watermelon": return new Watermelon();
            case "Wing Horn": return new WingHorn();
            default:
                throw new FactoryPartBodyException("Not found part body "+Horn.class.toString());
        }

    }
}
