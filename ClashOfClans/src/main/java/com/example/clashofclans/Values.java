package com.example.clashofclans;

import com.example.clashofclans.Model.Field;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Values {

    public static ArrayList<Field> maps = new ArrayList<>();

    // Max health = 100; Max hit/second = 50; Max speed = 20; Max hit range(HERO) = 10; Max hit range(BUILDING) = 10;
    // Max Damage = 500;

    // Knight - middle
    public static int KNIGHT_HEALTH = 60;
    public static int KNIGHT_HIT = 30;
    public static int KNIGHT_SPEED = 10;
    public static int KNIGHT_HITRANGE = 2;

    // Green - weak
    public static int GREEN_HEALTH = 45;
    public static int GREEN_HIT = 15;
    public static int GREEN_SPEED = 40;
    public static int GREEN_HITRANGE = 2;

    // Spear - middle
    public static int SPEAR_HEALTH = 80;
    public static int SPEAR_HIT = 15;
    public static int SPEAR_SPEED = 15;
    public static int SPEAR_HITRANGE = 5;

    // Dragon - Strong
    public static int DRAGON_HEALTH = 60;
    public static int DRAGON_HIT = 40;
    public static int DRAGON_SPEED = 30;
    public static int DRAGON_HITRANGE = 10;

    //Troll - Strong
    public static int TROLL_HEALTH = 80;
    public static int TROLL_HIT = 50;
    public static int TROLL_SPEED = 10;
    public static int TROLL_HITRANGE = 2;

    public enum DefensiveType {
        DEFENSIVE,
        NORMAL,
    }

    // Canon - middle
    public static int CANON_HIT = 20;
    public static int CANON_HITRANGE = 20;
    public static int CANON_DAMAGE = 200;

    // Thrower - middle
    public static int THROWER_HIT = 30;
    public static int THROWER_HITRANGE = 15;
    public static int THROWER_DAMAGE = 250;

    // Powder - Strong
    public static int POWDER_HIT = 40;
    public static int POWDER_HITRANGE = 10;
    public static int POWDER_DAMAGE = 300;

    // Home (Level 1) - weak
    public static int HOME1_DAMAGE = 170;

    // Home (Level 2) - middle
    public static int HOME2_DAMAGE = 200;

    // Home (Level 3) - Strong
    public static int HOME3_DAMAGE = 250;

    // Castle - Strong
    public static int CASTLE_DAMAGE = 350;

    // Barracks - Middle
    public static int BARRACKS_DAMAGE = 250;

    // Storage - Weak
    public static int STORAGE_DAMAGE = 200;

    public static String SpearFrame0 = "Heroes/Spear/2 WALK_000.png";
    public static String SpearFrame1 = "Heroes/Spear/2 WALK_001.png";
    public static String SpearFrame2 = "Heroes/Spear/2 WALK_002.png";
    public static String SpearFrame3 = "Heroes/Spear/2 WALK_003.png";
    public static String SpearFrame4 = "Heroes/Spear/2 WALK_004.png";
    public static String SpearDieFrame0 = "Heroes/Spear/7 DIE_000.png";
    public static String SpearDieFrame1 = "Heroes/Spear/7 DIE_001.png";
    public static String SpearDieFrame2 = "Heroes/Spear/7 DIE_002.png";
    public static String SpearDieFrame3 = "Heroes/Spear/7 DIE_003.png";
    public static String SpearDieFrame4 = "Heroes/Spear/7 DIE_004.png";

    public static String TrollFrame0 = "Heroes/Troll/Troll_01_1_RUN_000.png";
    public static String TrollFrame1 = "Heroes/Troll/Troll_01_1_RUN_001.png";
    public static String TrollFrame2 = "Heroes/Troll/Troll_01_1_RUN_002.png";
    public static String TrollFrame3 = "Heroes/Troll/Troll_01_1_RUN_003.png";
    public static String TrollFrame4 = "Heroes/Troll/Troll_01_1_RUN_004.png";
    public static String TrollFrame5 = "Heroes/Troll/Troll_01_1_RUN_005.png";
    public static String TrollFrame6 = "Heroes/Troll/Troll_01_1_RUN_006.png";
    public static String TrollFrame7 = "Heroes/Troll/Troll_01_1_RUN_007.png";
    public static String TrollFrame8 = "Heroes/Troll/Troll_01_1_RUN_008.png";
    public static String TrollFrame9 = "Heroes/Troll/Troll_01_1_RUN_009.png";

    public static String TrollDieFrame0 = "Heroes/Troll/Troll_01_1_DIE_000.png";
    public static String TrollDieFrame1 = "Heroes/Troll/Troll_01_1_DIE_001.png";
    public static String TrollDieFrame2 = "Heroes/Troll/Troll_01_1_DIE_002.png";
    public static String TrollDieFrame3 = "Heroes/Troll/Troll_01_1_DIE_003.png";
    public static String TrollDieFrame4 = "Heroes/Troll/Troll_01_1_DIE_004.png";
    public static String TrollDieFrame5 = "Heroes/Troll/Troll_01_1_DIE_005.png";
    public static String TrollDieFrame6 = "Heroes/Troll/Troll_01_1_DIE_006.png";
    public static String TrollDieFrame7 = "Heroes/Troll/Troll_01_1_DIE_007.png";
    public static String TrollDieFrame8 = "Heroes/Troll/Troll_01_1_DIE_008.png";
    public static String TrollDieFrame9 = "Heroes/Troll/Troll_01_1_DIE_009.png";

    public static List<String> TrollFrames = List.of(Values.TrollFrame0 , Values.TrollFrame1 , Values.TrollFrame2 , Values.TrollFrame3 , Values.TrollFrame4 , Values.TrollFrame5 , Values.TrollFrame6 , Values.TrollFrame7 , Values.TrollFrame8 , Values.TrollFrame9);




}
