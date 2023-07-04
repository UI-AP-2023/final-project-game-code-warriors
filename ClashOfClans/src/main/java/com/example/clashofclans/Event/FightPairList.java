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
    public  static void onAnyGameComponentDestroyed(IGameComponent winner) {
//            for (PairFightModel pairFightModel : pairFightModels) {
//
//                if (pairFightModel.attacker.equals(winner) || pairFightModel.target.equals(winner)) {
//                    IGameComponent loser = pairFightModel.attacker == winner ? pairFightModel.target : pairFightModel.attacker;
//                    if (!loser.getIsAlive())break;
//                    if (winner instanceof Hero) {
//                        winner.getAnimHandler().initDefaultAnimation();
//                        AtomicReference<IGameComponent> newTarget = field.getTargetFor(winner, false);
//                        if (newTarget.get() != null) {
//                            ComponentMover.moveComponent(newTarget.get(), winner);
//                            loser.setIsAlive(false);
//                        }
//                    }
//                    if (loser instanceof Hero) {
//                        loser.getAnimHandler().setDieToDefaultAnim();
//                        loser.getAnimHandler().geTimeLine().setOnFinished(event -> {
//                            loser.getImageView().setOpacity(0);
//                        });
//                    }
//                    if (loser instanceof DefensiveBuilding) {
//                        loser.getImageView().setOpacity(0);
//                    }
////                    runOnGameComponentDestroyed(loser);
//                    loser.setIsAlive(false);
//                    System.out.println("pairFightModels.size() = " + pairFightModels.size());
//                    pairFightModels.remove(pairFightModel);
//                    System.out.println("pairFightModels.size() = " + pairFightModels.size());
//
//                }
//
//            }
//


        for (PairFightModel pairFightModel : pairFightModels) {
            IGameComponent attacker = pairFightModel.attacker;
            IGameComponent target = pairFightModel.target;

            IGameComponent loser = attacker.equals(winner) ? target : attacker;

//            if (loser.getAnimHandler() != null) {
//                loser.getAnimHandler().geTimeLine().stop();
//                loser.getAnimHandler().setDieToDefaultAnim();
//            };

            if (attacker.equals(winner)) {
                runOnGameComponentDestroyed(loser);
                if (winner instanceof Hero) {
                    attacker.getAnimHandler().initDefaultAnimation();
                    AtomicReference<IGameComponent> newTarget = field.getTargetFor(winner, false);
                    if (newTarget.get() != null) {
                        ComponentMover.moveComponent(newTarget.get(), winner);
                    }
                }
                field.getTargets().remove(target);
                pairFightModels.remove(pairFightModel);
                break;


            } else if (target.equals(winner)) {
                runOnGameComponentDestroyed(loser);
                if (winner instanceof Hero) {
                    target.getAnimHandler().initDefaultAnimation();
                    AtomicReference<IGameComponent> newTarget = field.getTargetFor(winner, false);
                    if (newTarget.get() != null) {
                        ComponentMover.moveComponent(newTarget.get(), winner);
                    }
                } else if (winner instanceof DefensiveBuilding) {
                    attacker.getAnimHandler().setDieToDefaultAnim();
                    attacker.getAnimHandler().geTimeLine().setOnFinished(event -> {
                        attacker.getImageView().setOpacity(0);
                    });

                }
                field.getTargets().remove(attacker);
                pairFightModels.remove(pairFightModel);
                break;
            }


//        }
        }
    }
}

