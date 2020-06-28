package behavioral_patterns.state_pattern;

import behavioral_patterns.state_pattern.directionState.DirectionA;
import behavioral_patterns.state_pattern.directionState.DirectionD;
import behavioral_patterns.state_pattern.directionState.DirectionS;
import behavioral_patterns.state_pattern.directionState.DirectionW;
import behavioral_patterns.state_pattern.directionState.Direction;

public class Character implements FaceDirectionState{
    /* Don't write it like this.
    private int x;
    private int y;
    private enum T {W, A, S, D} ;
    T direction = T.W;

    public void w(){
        if (direction == T.W){
            y++;
        } else {
            direction = T.W;
        }
        showLocation();
    }
    public void a(){
        if (direction == T.A){
            x--;
        } else {
            direction = T.A;
        }
        showLocation();
    }
    public void s(){
        if (direction == T.S){
            y--;
        } else {
            direction = T.S;
        }
        showLocation();
    }
    public void d(){
        if (direction == T.D){
            x++;
        } else {
            direction = T.D;
        }
        showLocation();
    }
    public void showLocation(){
        System.out.println("Curr direction: " + direction + "  coordinate: (" + x + ", " + y + ")");
    }
    */

    private int x;
    private int y;
    private Direction currState;

    public Character(int x, int y){
        this.x = x;
        this.y = y;
        Direction w = new DirectionW(this);
        Direction a = new DirectionA(this);
        Direction s = new DirectionS(this);
        Direction d = new DirectionD(this);
        w.setWASDState(w, a, s, d);
        a.setWASDState(w, a, s, d);
        s.setWASDState(w, a, s, d);
        d.setWASDState(w, a, s, d);
        currState = w;
    }

    public void setCurrState(Direction currState) {
        this.currState = currState;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    @Override
    public void w() {
        currState.w();
        System.out.println("New state: " + currState.toString() + "  new coordinate: (" + x + ", " + y + ")");
    }

    @Override
    public void a() {
        currState.a();
        System.out.println("New state: " + currState.toString() + "  new coordinate: (" + x + ", " + y + ")");
    }

    @Override
    public void s() {
        currState.s();
        System.out.println("New state: " + currState.toString() + "  new coordinate: (" + x + ", " + y + ")");
    }

    @Override
    public void d() {
        currState.d();
        System.out.println("New state: " + currState.toString() + "  new coordinate: (" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Character character = new Character(0,0);
        character.w();
        character.w();
        character.w();
        character.d();
        character.d();
        character.s();
        character.s();
        character.s();
    }

}
