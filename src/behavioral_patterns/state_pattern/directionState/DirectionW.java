package behavioral_patterns.state_pattern.directionState;

import behavioral_patterns.state_pattern.Character;
import behavioral_patterns.state_pattern.FaceDirectionState;

public class DirectionW extends Direction {

    public DirectionW(Character character) {
        super(character);
    }

    @Override
    public void w() {
        character.setY(character.getY() + 1);
    }

}
