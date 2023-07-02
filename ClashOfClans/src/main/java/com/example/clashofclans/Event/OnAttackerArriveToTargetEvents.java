package com.example.clashofclans.Event;

import com.example.clashofclans.Model.Interfaces.IGameComponent;

import java.util.ArrayList;
import java.util.List;

public class OnAttackerArriveToTargetEvents
{
    private static final List<IOnAttackerArriveToTarget> onAttackerArriveToTargets;
    static {
         onAttackerArriveToTargets = new ArrayList<>();
    }
    public static void addOnAttackerArriveToTarget(IOnAttackerArriveToTarget onAttackerArriveToTarget){
        onAttackerArriveToTargets.add(onAttackerArriveToTarget);
    }
    public static void removeOnAttackerArriveToTarget(IOnAttackerArriveToTarget onAttackerArriveToTarget){
        onAttackerArriveToTargets.remove(onAttackerArriveToTarget);
    }
    public static void runEvents(IGameComponent target , IGameComponent attacker){
        for (IOnAttackerArriveToTarget onAttackerArriveToTarget : onAttackerArriveToTargets) {
            onAttackerArriveToTarget.onAttackerArriveToTarget(target , attacker);
        }
    }
}
