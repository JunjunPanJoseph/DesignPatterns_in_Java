package behavioral_patterns.state_pattern.directionState;

import behavioral_patterns.state_pattern.Character;
import behavioral_patterns.state_pattern.FaceDirectionState;

public class DirectionA  extends Direction  {
    public DirectionA(Character character) {
        super(character);
    }

    @Override
    public void a() {
        character.setX(character.getX() - 1);
    }
}

