package com.example.clashofclans.Model;

import javafx.geometry.Insets;
import javafx.scene.Node;

public interface IGameComponent {
    Node getComponent(double size);

    Insets getInsets();
}
