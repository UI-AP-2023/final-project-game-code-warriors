package com.example.clashofclans;

import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Widgets.Map;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;

public class Values {
    public static ArrayList<Map> maps;
    public static ArrayList<Account> users;
    public static Account loggedInUser;
    private static Stage mainStage;

    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    public static Stage getStage() {
        return mainStage;
    }

    static {
        users = new ArrayList<>();
        maps = new ArrayList<>();
    }
    // Max health = 100; Max hit/second = 50; Max speed = 20; Max hit range(HERO) = 10; Max hit range(BUILDING) = 20;
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
    public static int SPEAR_HIT = 40;
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
    public static int CANON_SCORE = 30;

    // Thrower - middle
    public static int THROWER_HIT = 30;
    public static int THROWER_HITRANGE = 15;
    public static int THROWER_DAMAGE = 250;
    public static int THROWER_SCORE = 35;

    // Powder - Strong
    public static int POWDER_HIT = 40;
    public static int POWDER_HITRANGE = 10;
    public static int POWDER_DAMAGE = 300;
    public static int POWDER_SCORE = 40;


    // Home (Level 1) - weak
    public static int HOME1_DAMAGE = 150;
    public static int HOME1_SCORE = 15;

    // Home (Level 2) - middle
    public static int HOME2_DAMAGE = 200;
    public static int HOME2_SCORE = 20;

    // Home (Level 3) - Strong
    public static int HOME3_DAMAGE = 250;
    public static int HOME3_SCORE = 25;

    // Castle - Strong
    public static int CASTLE_DAMAGE = 350;
    public static int CASTLE_SCORE = 35;

    // Barracks - Middle
    public static int BARRACKS_DAMAGE = 250;
    public static int BARRACKS_SCORE = 25;

    // Storage - Weak
    public static int STORAGE_DAMAGE = 200;
    public static int SORAGE_SCORE = 20;

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

    public static String SpearAttackFrame0 = "Heroes/Spear/5 ATTACK_000.png";
    public static String SpearAttackFrame1 = "Heroes/Spear/5 ATTACK_001.png";
    public static String SpearAttackFrame2 = "Heroes/Spear/5 ATTACK_002.png";
    public static String SpearAttackFrame3 = "Heroes/Spear/5 ATTACK_003.png";
    public static String SpearAttackFrame4 = "Heroes/Spear/5 ATTACK_004.png";


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

    public static String KnightFrame0 = "Heroes/Knight/Knight_01__RUN_000.png";
    public static String KnightFrame1 = "Heroes/Knight/Knight_01__RUN_001.png";
    public static String KnightFrame2 = "Heroes/Knight/Knight_01__RUN_002.png";
    public static String KnightFrame3 = "Heroes/Knight/Knight_01__RUN_003.png";
    public static String KnightFrame4 = "Heroes/Knight/Knight_01__RUN_004.png";
    public static String KnightFrame5 = "Heroes/Knight/Knight_01__RUN_005.png";
    public static String KnightFrame6 = "Heroes/Knight/Knight_01__RUN_006.png";
    public static String KnightFrame7 = "Heroes/Knight/Knight_01__RUN_007.png";
    public static String KnightFrame8 = "Heroes/Knight/Knight_01__RUN_008.png";
    public static String KnightFrame9 = "Heroes/Knight/Knight_01__RUN_009.png";


    public static String KnightDieFrame0 = "Heroes/Knight/Knight_01__DIE_000.png";
    public static String KnightDieFrame1 = "Heroes/Knight/Knight_01__DIE_001.png";
    public static String KnightDieFrame2 = "Heroes/Knight/Knight_01__DIE_002.png";
    public static String KnightDieFrame3 = "Heroes/Knight/Knight_01__DIE_003.png";
    public static String KnightDieFrame4 = "Heroes/Knight/Knight_01__DIE_004.png";
    public static String KnightDieFrame5 = "Heroes/Knight/Knight_01__DIE_005.png";
    public static String KnightDieFrame6 = "Heroes/Knight/Knight_01__DIE_006.png";
    public static String KnightDieFrame7 = "Heroes/Knight/Knight_01__DIE_007.png";
    public static String KnightDieFrame8 = "Heroes/Knight/Knight_01__DIE_008.png";
    public static String KnightDieFrame9 = "Heroes/Knight/Knight_01__DIE_009.png";


    public static String GreenFrame0 = "Heroes/Green/GREEN_RUN_000.png";
    public static String GreenFrame1 = "Heroes/Green/GREEN_RUN_001.png";
    public static String GreenFrame2 = "Heroes/Green/GREEN_RUN_002.png";
    public static String GreenFrame3 = "Heroes/Green/GREEN_RUN_003.png";
    public static String GreenFrame4 = "Heroes/Green/GREEN_RUN_004.png";
    public static String GreenFrame5 = "Heroes/Green/GREEN_RUN_005.png";
    public static String GreenFrame6 = "Heroes/Green/GREEN_RUN_006.png";
    public static String GreenFrame7 = "Heroes/Green/GREEN_RUN_007.png";
    public static String GreenFrame8 = "Heroes/Green/GREEN_RUN_008.png";
    public static String GreenFrame9 = "Heroes/Green/GREEN_RUN_009.png";


    public static String GreenDieFrame0 = "Heroes/Green/GREEN_DIE_000.png";
    public static String GreenDieFrame1 = "Heroes/Green/GREEN_DIE_001.png";
    public static String GreenDieFrame2 = "Heroes/Green/GREEN_DIE_002.png";
    public static String GreenDieFrame3 = "Heroes/Green/GREEN_DIE_003.png";
    public static String GreenDieFrame4 = "Heroes/Green/GREEN_DIE_004.png";
    public static String GreenDieFrame5 = "Heroes/Green/GREEN_DIE_005.png";
    public static String GreenDieFrame6 = "Heroes/Green/GREEN_DIE_006.png";
    public static String GreenDieFrame7 = "Heroes/Green/GREEN_DIE_007.png";
    public static String GreenDieFrame8 = "Heroes/Green/GREEN_DIE_008.png";
    public static String GreenDieFrame9 = "Heroes/Green/GREEN_DIE_009.png";


    public static List<String> TrollFrames = List.of(Values.TrollFrame0, Values.TrollFrame1, Values.TrollFrame2, Values.TrollFrame3, Values.TrollFrame4, Values.TrollFrame5, Values.TrollFrame6, Values.TrollFrame7, Values.TrollFrame8, Values.TrollFrame9);
    public static List<String> TrollDieFrames = List.of(Values.TrollDieFrame0, Values.TrollDieFrame1, Values.TrollDieFrame2, Values.TrollDieFrame3, Values.TrollDieFrame4, Values.TrollDieFrame5, Values.TrollDieFrame6, Values.TrollDieFrame7, Values.TrollDieFrame8, Values.TrollDieFrame9);

    public static List<String> SpearFrames = List.of(Values.SpearFrame0, Values.SpearFrame1, Values.SpearFrame2, Values.SpearFrame3, Values.SpearFrame4);
    public static List<String> SpearDieFrames = List.of(Values.SpearDieFrame0, Values.SpearDieFrame1, Values.SpearDieFrame2, Values.SpearDieFrame3, Values.SpearDieFrame4);

    public static List<String> KnightFrames = List.of(Values.KnightFrame0, Values.KnightFrame1, Values.KnightFrame2, Values.KnightFrame3, Values.KnightFrame4, Values.KnightFrame5, Values.KnightFrame6, Values.KnightFrame7, Values.KnightFrame8, Values.KnightFrame9);
    public static List<String> KnightDieFrames = List.of(Values.KnightDieFrame0, Values.KnightDieFrame1, Values.KnightDieFrame2, Values.KnightDieFrame3, Values.KnightDieFrame4, Values.KnightDieFrame5, Values.KnightDieFrame6, Values.KnightDieFrame7, Values.KnightDieFrame8, Values.KnightDieFrame9);

    public static List<String> GreenFrames = List.of(Values.GreenFrame0, Values.GreenFrame1, Values.GreenFrame2, Values.GreenFrame3, Values.GreenFrame4, Values.GreenFrame5, Values.GreenFrame6, Values.GreenFrame7, Values.GreenFrame8, Values.GreenFrame9);
    public static List<String> GreenDieFrames = List.of(Values.GreenDieFrame0, Values.GreenDieFrame1, Values.GreenDieFrame2, Values.GreenDieFrame3, Values.GreenDieFrame4, Values.GreenDieFrame5, Values.GreenDieFrame6, Values.GreenDieFrame7, Values.GreenDieFrame8, Values.GreenDieFrame9);

}
