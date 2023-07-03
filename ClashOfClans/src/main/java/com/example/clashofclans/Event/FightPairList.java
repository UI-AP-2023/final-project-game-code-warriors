package com.example.clashofclans.Event;

import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Utility.ComponentMover;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class FightPairList {
    private static List<PairFightModel> pairFightModels;
    private static Field field;

    public static void setField(Field field) {
        FightPairList.field = field;
    }

    private static List<OnAttackerDestroyTarget> onAttackerDestroyTargets;

    static {
        pairFightModels = new ArrayList<>();
        onAttackerDestroyTargets = new ArrayList<>();
    }
    public static void addFight(IGameComponent target , IGameComponent attacker){
        pairFightModels.add(new PairFightModel(attacker , target));
    }
    public static void onAnyGameComponentDestroyed(IGameComponent winner){
        for (PairFightModel pairFightModel : pairFightModels) {
            IGameComponent attacker = pairFightModel.attacker;
            IGameComponent target = pairFightModel.attacker;
            if (attacker.equals(winner)){
                attacker.getAnimHandler().initDefaultAnimation();
                pairFightModels.remove(pairFightModel);
                IGameComponent iGameComponent = field.getTargetFor(winner);
                ComponentMover.moveComponent(target , iGameComponent , Duration.seconds(1));
                break;
            }

        }
    }
}
