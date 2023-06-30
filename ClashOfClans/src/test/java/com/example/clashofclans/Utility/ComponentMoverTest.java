package com.example.clashofclans.Utility;

import javafx.geometry.Insets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComponentMoverTest {

    @Test
    public void testCalculateMoveLength(){
        double currentTop = 10;
        double currentLeft = 10;

        double targetTop = 20;
        double targetLeft = 20;

        double expected = 14.142135623730951;
        double actual = ComponentMover.calculateMoveLength(currentTop, currentLeft, targetTop, targetLeft);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateMoveLength2(){
        double currentTop = 30;
        double currentLeft = 10;

        double targetTop = 20;
        double targetLeft = 20;

        double expected = 14.142135623730951;
        double actual = ComponentMover.calculateMoveLength(currentTop, currentLeft, targetTop, targetLeft);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateMoveLength3(){
        double currentTop = 30;
        double currentLeft = 30;

        double targetTop = 20;
        double targetLeft = 20;

        double expected = 14.142135623730951;
        double actual = ComponentMover.calculateMoveLength(currentTop, currentLeft, targetTop, targetLeft);
        Assertions.assertEquals(expected, actual);
    }
}