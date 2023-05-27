package com.axies.snake.ladders;

import com.axies.snake.ladders.account.Owner;
import com.axies.snake.ladders.axie.factorys.AxieCreator;
import com.axies.snake.ladders.axie.factorys.partBodyException.FactoryPartBodyException;
import com.axies.snake.ladders.roninwallet.RoninAccount;
import com.axies.snake.ladders.util.LoggerUtil;
import com.badlogic.gdx.Gdx;

import javax.inject.Inject;
import java.util.Map;
import java.util.logging.Logger;

public class PreInterfaceASL {
    Owner owner;
    AxieCreator axieCreator;
    RoninAccount roninAccount;

    @Inject
    public PreInterfaceASL(Owner owner, AxieCreator axieCreator, RoninAccount roninAccount) {
        Gdx.app.log("ClassName: " + LoggerUtil.getClassName(getClass()), "MethodName: PreInterfaceASL");
        this.owner = owner;
        this.axieCreator = axieCreator;
        this.roninAccount = roninAccount;
        try {
            for (Map<String, String> listAx : roninAccount.axiesListAccount()) {

                owner.AddAxieBodyList(axieCreator.initCreatorAxie(listAx.get("Back"),
                        listAx.get("Ears"),
                        listAx.get("Eyes"),
                        listAx.get("Horn"),
                        listAx.get("Mouth"),
                        listAx.get("Tail"),
                        "Body",
                        listAx.get("Type")));
            }
        }catch (NoSuchMethodException e){
            Gdx.app.error("Error","Constructor PreInterfaceASL "+e.toString());
        }catch (FactoryPartBodyException e){
            Gdx.app.error("Error","Constructor PreInterfaceASL "+e.toString());
        }
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "PreInterfaceASL{" +
                "owner=" + owner ;
    }
}
