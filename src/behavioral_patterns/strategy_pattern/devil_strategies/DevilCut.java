package behavioral_patterns.strategy_pattern.devil_strategies;

import behavioral_patterns.strategy_pattern.DevilAttack;

public class DevilCut implements DevilAttack {
    @Override
    public void attack() {
        System.out.println("Devil cut has the power of cutting stone!");
    }
}
