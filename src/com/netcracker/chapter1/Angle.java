package com.netcracker.chapter1;

public class Angle {
    public static int angleNormalization(int angle){
        if (angle >= 0)
            return angle % 360;
        else
            return 360 + (angle % 360);
    }
    public static int angleNormalizationWithFloorMod(int angle){
        return Math.floorMod(angle, 360);
    }
}
