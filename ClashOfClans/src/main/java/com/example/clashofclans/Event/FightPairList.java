package com.example.clashofclans.Event;

import com.example.clashofclans.Model.Building.DefensiveBuilding;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Model.Hero.Hero;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Utility.ComponentMover;
import lombok.Synchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        pairFightModels = Collections.synchronizedList(new ArrayList<>());
        onAttackerDestroyTargets = Collections.synchronizedList(new ArrayList<>());
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
        if (pairFightModels.size() != 0 ){
            for (PairFightModel pairFightModel : pairFightModels) {
                if (!(pairFightModel.attacker.equals(attacker) || pairFightModel.target.equals(attacker))) {
                    pairFightModels.add(new PairFightModel(attacker, target));
                    break;
                }
            }
        }
        else {
            pairFightModels.add(new PairFightModel(attacker, target));
        }
    }

    @Synchronized
    public  void onAnyGameComponentDestroyed(IGameComponent winner) {
        Thread thread = new Thread(()->{

            for (PairFightModel pairFightModel : pairFightModels) {
                if (pairFightModel.attacker.equals(winner) || pairFightModel.target.equals(winner)) {
                    IGameComponent loser = pairFightModel.attacker == winner ? pairFightModel.target : pairFightModel.attacker;
                    if (winner instanceof Hero) {
                        winner.getAnimHandler().initDefaultAnimation();
                        AtomicReference<IGameComponent> newTarget = field.getTargetFor(winner, false);
                        if (newTarget.get() != null) {
                            ComponentMover.moveComponent(newTarget.get(), winner);

                        }
                    }
                    if (loser instanceof Hero) {
                        loser.getAnimHandler().setDieToDefaultAnim();

                    }
                    if (loser instanceof DefensiveBuilding) {
                        loser.getImageView().setOpacity(0);
                    }
                    System.out.println("pairFightModels.size() = " + pairFightModels.size());
                    pairFightModels.remove(pairFightModel);
                    runOnGameComponentDestroyed(loser);
                    System.out.println("pairFightModels.size() = " + pairFightModels.size());
                }
            }
        });

        thread.start();
//        for (PairFightModel pairFightModel : pairFightModels) {


//
//            if (attacker.equals(winner)) {
//                runOnGameComponentDestroyed(target);
//                if (winner instanceof Hero) {
//                    attacker.getAnimHandler().initDefaultAnimation();
//                    AtomicReference<IGameComponent> newTarget = field.getTargetFor(winner, false);
//                    if (newTarget.get() != null) {
//                        ComponentMover.moveComponent(newTarget.get(), winner);
//                        break;
//                    }
//                } else if (winner instanceof DefensiveBuilding) {
//                    target.getAnimHandler().setDieToDefaultAnim();
//
//                }
//                field.getTargets().remove(target);
//
//
//            } else if (target.equals(winner)) {
//                runOnGameComponentDestroyed(attacker);
//                if (winner instanceof Hero) {
//                    target.getAnimHandler().initDefaultAnimation();
//                    AtomicReference<IGameComponent> newTarget = field.getTargetFor(winner, false);
//                    if (newTarget.get() != null) {
//                        ComponentMover.moveComponent(newTarget.get(), winner);
//                        break;
//                    }
//                } else if (winner instanceof DefensiveBuilding) {
//                    attacker.getAnimHandler().setDieToDefaultAnim();
//
//                }
//                field.getTargets().remove(attacker);
//            }
//            pairFightModels.remove(pairFightModel);


//        }
    }
}

