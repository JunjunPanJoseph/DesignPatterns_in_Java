package behavioral_patterns.strategy_pattern;

import behavioral_patterns.strategy_pattern.devil_strategies.DevilArrow;
import behavioral_patterns.strategy_pattern.devil_strategies.DevilBeam;
import behavioral_patterns.strategy_pattern.devil_strategies.DevilCut;
import behavioral_patterns.strategy_pattern.devil_strategies.DevilEar;

public class DevilMan {
    // it has attribute for strategy.
    // if you want to use strategy, then call the method encapsulated in the strategy object
    private DevilAttack attackStrategy;
    // setter for the strategy object
    // It allows we change the strategy at run time
    public void setAttackStrategy(DevilAttack attackStrategy){
        this.attackStrategy = attackStrategy;
    }
    public void attack(){
        attackStrategy.attack();
        /*
        String method = "it is attack method";
        if ("Beam".equals(method)){
            System.out.println("something");
        } else if ("Punch".equals(method)){
            System.out.println("something");
        }
        */
    }


    public static void main(String[] args) {
        DevilMan devilMan = new DevilMan();
        System.out.println("Snake devil is comming");
        devilMan.setAttackStrategy(new DevilBeam());
        devilMan.attack();
        System.out.println("Ghost is comming");
        devilMan.setAttackStrategy(new DevilArrow());
        devilMan.attack();
        System.out.println("Human is comming");
        devilMan.setAttackStrategy(new DevilEar());
        devilMan.attack();
        System.out.println("Stone!");
        devilMan.setAttackStrategy(new DevilCut());
        devilMan.attack();
    }
}
