package com.example.clashofclans.Widgets;

import com.example.clashofclans.Model.Field;
import javafx.scene.control.ScrollPane;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Map extends ScrollPane {
    private Field field;

    public Map(Field field) {
        this.field = field;
        this.setContent(field);
        this.setHbarPolicy(ScrollBarPolicy.NEVER);
        this.setVbarPolicy(ScrollBarPolicy.NEVER);
        this.setPannable(true);
    }
}
