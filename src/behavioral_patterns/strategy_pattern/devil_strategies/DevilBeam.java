package behavioral_patterns.strategy_pattern.devil_strategies;

import behavioral_patterns.strategy_pattern.DevilAttack;

public class DevilBeam implements DevilAttack {
    public void attack(){
        System.out.println("Devil's Beam is hot beam!");
    }
}
