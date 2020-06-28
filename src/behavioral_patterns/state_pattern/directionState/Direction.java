package behavioral_patterns.state_pattern.directionState;

import behavioral_patterns.state_pattern.Character;
import behavioral_patterns.state_pattern.FaceDirectionState;

public abstract class Direction implements FaceDirectionState {
    protected Character character;
    protected Direction w;
    protected Direction a;
    protected Direction s;
    protected Direction d;
    public Direction(Character character){
        this.character = character;
    }
    public void setWASDState(Direction w, Direction a, Direction s, Direction d){
        this.w = w;
        this.a = a;
        this.s = s;
        this.d = d;
    }
    @Override
    public void w() {
        character.setCurrState(w);
    }

    @Override
    public void a() {
        character.setCurrState(a);
    }

    @Override
    public void s() {
        character.setCurrState(s);
    }

    @Override
    public void d() {
        character.setCurrState(d);
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
