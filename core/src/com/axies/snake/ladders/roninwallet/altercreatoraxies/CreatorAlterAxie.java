package com.axies.snake.ladders.roninwallet.altercreatoraxies;

import com.axies.snake.ladders.axie.AxieToken;
import com.axies.snake.ladders.axie.axieparts.axieclass.body.Body;
import com.axies.snake.ladders.axie.axietype.AxieType;
import com.axies.snake.ladders.axie.factorys.AxieCreator;
import com.axies.snake.ladders.roninwallet.RoninAccount;
import com.badlogic.gdx.Gdx;


import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


public class CreatorAlterAxie implements RoninAccount {

    Logger logger = Logger.getLogger(CreatorAlterAxie.class.toString());

    String [] Back = {"Blue Moon","Spiky Wing","Cupid","Pigeon Post","Sandal","Ronin","Scarab","Mint","Croc","Indian Star","Red Ear","Pumpkin","Balloon","Green Thorns","Risky Beast","Perch","Hero","Anemone","Tri Spikes","Snail Shell","Garish Worm","Turnip","Jaguar","Buzz Buzz","Tri Feather","Furball","Bidens","Raven","Sponge","Kingfisher","Bone Sail","Hermit","Shiitake","Goldfish","Timber","Watering Can"};
    String [] Ears = {"Nyan","Ear Breathing","Curly","Bubblemaker","Belieber","Little Owl","Swirl","Hollow","Inkling","Peace Maker","Pogona","Rosa","Leaf Bug","Sidebarb","Nimo","Clover","Pink Cheek","Gill","Beetle Spike","Nut Cracker","Zen","Risky Bird","Seaslug","Tiny Fan","Curved Spine","Small Frill","Leafy","Lotus","Friezard","Larva","Early Bird","Puppy","Sakura","Earwing","Innocent Lamb","Tassels"};
    String [] Eyes = {"Blossom","Little Owl","Kotaro?","Papi","Chubby","Neo","Cucumber Slice","Bookworm","Robin","Clear","Topaz","Nerdy","Lucas","Puppy","Telescope","Tricky","Zeal","Confusion","Little Peas","Mavis","Gecko","Sleepless","Scar","Gero"};
    String [] Horn = {"Rose Bud","Unko","Scaly Spoon","Oranda","Lagging","Caterpillars","Arco","Incisor","Teal Shell","Little Branch","Bamboo Spear","Merry","Clamshell","Parasite","Scaly Spear","Pocky","Shoal Star","Cactus","Strawberry Shortcake","Bumpy","Feather Spear","Cerastes","Beech","Eggshell","Watermelon","Cuckoo","Anemone","Leaf Bug","Antenna","Pliers","Imp","Trump","Wing Horn","Dual Blade","Kestrel","Babylonia"};
    String [] Mounth = {"Lam","Doubletalk","Axie Kiss","Kotaro","Peace Maker","Cute Bunny","Zigzag","Herbivore","Catfish","Pincer","Toothless Bite","Tiny Turtle","Nut Cracker","Serious","Confident","Square Teeth","Mosquito","Risky Fish","Razor Bite","Goda","Piranha","Little Owl","Silence Whisper","Hungry Bird"};
    String [] Tail = {"Cloud","Feather Fan","Swallow","Hot Butt","Grass Snake","Shiba","Shrimp","Ranchu","Snake Jar","Potato Leaf","Rice","Gerbil","The Last One","Thorny Caterpillar","Iguana","Tiny Dino","Pupae","Post Fight","Hare","Navaga","Yam","Cottontail","Cattail","Gila","Nut Cracker","Ant","Gravel Ant","Koi","Granma's Fan","Nimo","Hatsune","Wall Gecko","Tadpole","Carrot","Fish Snack","Twin Tail"};
    AxieCreator axieCreator;

    @Inject
    public CreatorAlterAxie() {

    }

    public Map<String,String> partsAlter(){
        Map<String,String> partName = new HashMap<>();
        partName.put("Back",Back[(int)Math.floor(Math.random() * (Back.length))]);
        partName.put("Ears",Ears[(int)Math.floor(Math.random() * (Ears.length))]);
        partName.put("Eyes",Eyes[(int)Math.floor(Math.random() * (Eyes.length))]);
        partName.put("Horn",Horn[(int)Math.floor(Math.random() * (Horn.length))]);
        partName.put("Mouth",Mounth[(int)Math.floor(Math.random() * (Mounth.length))]);
        partName.put("Tail",Tail[(int)Math.floor(Math.random() * (Tail.length))]);
        partName.put("Type",AxieType.AQUATIC.toString());
        Gdx.app.log("Part Axie",partName.toString());
        return partName;
    }


    @Override
    public Map<String, String> getAxie(String id) {
        return partsAlter();
    }

    @Override
    public List<Map<String, String>> axiesListAccount() {
        List <Map<String, String>> list = new ArrayList<>();
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        list.add(partsAlter());
        return list;
    }
}
