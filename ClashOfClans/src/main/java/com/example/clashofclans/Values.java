package com.example.clashofclans;

import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Widgets.Map;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;

public class Values {
    public static ArrayList<Map> maps;
    public static ArrayList<Account> users;
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
    public static int STORAGE_SCORE = 20;

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

    public static String TrollAttackFrame0 = "Heroes/Troll/Troll_01_1_ATTACK_000.png";
    public static String TrollAttackFrame1 = "Heroes/Troll/Troll_01_1_ATTACK_001.png";
    public static String TrollAttackFrame2 = "Heroes/Troll/Troll_01_1_ATTACK_002.png";
    public static String TrollAttackFrame3 = "Heroes/Troll/Troll_01_1_ATTACK_003.png";
    public static String TrollAttackFrame4 = "Heroes/Troll/Troll_01_1_ATTACK_004.png";
    public static String TrollAttackFrame5 = "Heroes/Troll/Troll_01_1_ATTACK_005.png";
    public static String TrollAttackFrame6 = "Heroes/Troll/Troll_01_1_ATTACK_006.png";
    public static String TrollAttackFrame7 = "Heroes/Troll/Troll_01_1_ATTACK_007.png";
    public static String TrollAttackFrame8 = "Heroes/Troll/Troll_01_1_ATTACK_008.png";
    public static String TrollAttackFrame9 = "Heroes/Troll/Troll_01_1_ATTACK_009.png";

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

    public static String KnightAttackFrame0 = "Heroes/Knight/Knight_01__ATTACK_000.png";
    public static String KnightAttackFrame1 = "Heroes/Knight/Knight_01__ATTACK_001.png";
    public static String KnightAttackFrame2 = "Heroes/Knight/Knight_01__ATTACK_002.png";
    public static String KnightAttackFrame3 = "Heroes/Knight/Knight_01__ATTACK_003.png";
    public static String KnightAttackFrame4 = "Heroes/Knight/Knight_01__ATTACK_004.png";
    public static String KnightAttackFrame5 = "Heroes/Knight/Knight_01__ATTACK_005.png";
    public static String KnightAttackFrame6 = "Heroes/Knight/Knight_01__ATTACK_006.png";
    public static String KnightAttackFrame7 = "Heroes/Knight/Knight_01__ATTACK_007.png";
    public static String KnightAttackFrame8 = "Heroes/Knight/Knight_01__ATTACK_008.png";
    public static String KnightAttackFrame9 = "Heroes/Knight/Knight_01__ATTACK_009.png";

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

    public static String GreenAttackFrame0 = "Heroes/Green/GREEN_ATTACK_000.png";
    public static String GreenAttackFrame1 = "Heroes/Green/GREEN_ATTACK_001.png";
    public static String GreenAttackFrame2 = "Heroes/Green/GREEN_ATTACK_002.png";
    public static String GreenAttackFrame3 = "Heroes/Green/GREEN_ATTACK_003.png";
    public static String GreenAttackFrame4 = "Heroes/Green/GREEN_ATTACK_004.png";
    public static String GreenAttackFrame5 = "Heroes/Green/GREEN_ATTACK_005.png";
    public static String GreenAttackFrame6 = "Heroes/Green/GREEN_ATTACK_006.png";
    public static String GreenAttackFrame7 = "Heroes/Green/GREEN_ATTACK_007.png";
    public static String GreenAttackFrame8 = "Heroes/Green/GREEN_ATTACK_008.png";
    public static String GreenAttackFrame9 = "Heroes/Green/GREEN_ATTACK_009.png";
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

    public static String DragonFrame = "Heroes/Dragon/Dragon - Walk.png";
    public static String DragonAttackFrame = "Heroes/Dragon/Dragon - Fire.png";


    public static List<String> TrollFrames = List.of(TrollFrame0, TrollFrame1, TrollFrame2, TrollFrame3, TrollFrame4, TrollFrame5, TrollFrame6, TrollFrame7, TrollFrame8, TrollFrame9);
    public static List<String> TrollDieFrames = List.of(TrollDieFrame0, TrollDieFrame1, TrollDieFrame2, TrollDieFrame3, TrollDieFrame4, TrollDieFrame5, TrollDieFrame6, TrollDieFrame7, TrollDieFrame8, TrollDieFrame9);

    public static List<String> TrollAttackFrames = List.of(TrollAttackFrame0, TrollAttackFrame1, TrollAttackFrame2, TrollAttackFrame3, TrollAttackFrame4, TrollAttackFrame5, TrollAttackFrame6, TrollAttackFrame7, TrollAttackFrame8, TrollAttackFrame9);

    public static List<String> SpearFrames = List.of(SpearFrame0, SpearFrame1, SpearFrame2, SpearFrame3, SpearFrame4);
    public static List<String> SpearAttackFrames = List.of(SpearAttackFrame0, SpearAttackFrame1, SpearAttackFrame2, SpearAttackFrame3, SpearAttackFrame4);
    public static List<String> SpearDieFrames = List.of(SpearDieFrame0, SpearDieFrame1, SpearDieFrame2, SpearDieFrame3, SpearDieFrame4);

    public static List<String> KnightFrames = List.of(KnightFrame0, KnightFrame1, KnightFrame2, KnightFrame3, KnightFrame4, KnightFrame5, KnightFrame6, KnightFrame7, KnightFrame8, KnightFrame9);
    public static List<String> KnightAttackFrames = List.of(KnightAttackFrame0, KnightAttackFrame1, KnightAttackFrame2, KnightAttackFrame3, KnightAttackFrame4, KnightAttackFrame5, KnightAttackFrame6, KnightAttackFrame7, KnightAttackFrame8, KnightAttackFrame9);
    public static List<String> KnightDieFrames = List.of(KnightDieFrame0, KnightDieFrame1, KnightDieFrame2, KnightDieFrame3, KnightDieFrame4, KnightDieFrame5, KnightDieFrame6, KnightDieFrame7, KnightDieFrame8, KnightDieFrame9);


    public static List<String> GreenFrames = List.of(GreenFrame0, GreenFrame1, GreenFrame2, GreenFrame3, GreenFrame4,GreenFrame5, GreenFrame6, GreenFrame7, GreenFrame8, GreenFrame9);
    public static List<String> GreenAttackFrames = List.of(GreenAttackFrame0, GreenAttackFrame1, GreenAttackFrame2, GreenAttackFrame3, GreenAttackFrame4, GreenAttackFrame5, GreenAttackFrame6, GreenAttackFrame7, GreenAttackFrame8, GreenAttackFrame9);
    public static List<String> GreenDieFrames = List.of(GreenDieFrame0, GreenDieFrame1, GreenDieFrame2, GreenDieFrame3, GreenDieFrame4, GreenDieFrame5, GreenDieFrame6, GreenDieFrame7, GreenDieFrame8, GreenDieFrame9);

}
