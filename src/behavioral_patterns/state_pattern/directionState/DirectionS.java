package behavioral_patterns.state_pattern.directionState;

import behavioral_patterns.state_pattern.Character;
import behavioral_patterns.state_pattern.FaceDirectionState;

public class DirectionS extends Direction {
    public DirectionS(Character character) {
        super(character);
    }

    @Override
    public void s() {
        character.setY(character.getY() - 1);
    }
}
