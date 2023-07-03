package com.example.clashofclans.Event;

import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Utility.ComponentMover;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

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

    public static void runOnGameComponentDestroyed(IGameComponent gameComponent) {
        for (OnAttackerDestroyTarget onAttackerDestroyTarget : onAttackerDestroyTargets) {
            onAttackerDestroyTarget.onTargetDestroyTarget(gameComponent);
        }
    }

    public static void addOnAttackerDestroyTarget(OnAttackerDestroyTarget onAttackerDestroyTarget) {
        onAttackerDestroyTargets.add(onAttackerDestroyTarget);
    }


    public static void addFight(IGameComponent target, IGameComponent attacker) {
        pairFightModels.add(new PairFightModel(attacker, target));
    }

    public static void onAnyGameComponentDestroyed(IGameComponent winner) {
        for (PairFightModel pairFightModel : pairFightModels) {
            IGameComponent attacker = pairFightModel.attacker;
            IGameComponent target = pairFightModel.target;

            if (attacker.equals(winner)) {
//                field.getChildren().remove(target.getImageView());
                runOnGameComponentDestroyed(target);
                attacker.getAnimHandler().initDefaultAnimation();
                AtomicReference<IGameComponent> newTarget = field.getTargetFor(winner);
                if (newTarget.get() != null){
                    pairFightModels.remove(pairFightModel);
                    ComponentMover.moveComponent(newTarget.get(), winner);
                }else {

                }
                System.out.println("Another Target Detected" + newTarget.getClass());
                break;
            }

        }
    }
}
