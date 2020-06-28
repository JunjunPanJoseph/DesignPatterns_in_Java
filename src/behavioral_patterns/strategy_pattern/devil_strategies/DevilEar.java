package behavioral_patterns.strategy_pattern.devil_strategies;

import behavioral_patterns.strategy_pattern.DevilAttack;

public class DevilEar implements DevilAttack {
    public void attack(){
        System.out.println("Devil's Ear is the ear of hell!");
    }
}
