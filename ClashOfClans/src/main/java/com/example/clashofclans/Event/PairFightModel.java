package com.example.clashofclans.Event;

import com.example.clashofclans.Model.Interfaces.IGameComponent;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PairFightModel {
    IGameComponent attacker;
    IGameComponent target;
}
