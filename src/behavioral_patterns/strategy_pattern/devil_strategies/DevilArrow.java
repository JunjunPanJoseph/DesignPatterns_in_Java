package behavioral_patterns.strategy_pattern.devil_strategies;

import behavioral_patterns.strategy_pattern.DevilAttack;

public class DevilArrow implements DevilAttack {
    public void attack(){
        System.out.println("Devil's Arrow is Ultrasound!");
    }
}
