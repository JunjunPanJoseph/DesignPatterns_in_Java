package behavioral_patterns.state_pattern.directionState;

import behavioral_patterns.state_pattern.Character;
import behavioral_patterns.state_pattern.FaceDirectionState;

public class DirectionD extends Direction {
    public DirectionD(Character character){
        super(character);
    }
    @Override
    public void d() {
        character.setX(character.getX() + 1);
    }
}
