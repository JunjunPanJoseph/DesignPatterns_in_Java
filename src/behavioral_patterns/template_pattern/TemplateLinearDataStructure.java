package part2.template;

import java.util.List;

public abstract class TemplateLinearDataStructure {
    protected List<Integer> list;
    public TemplateLinearDataStructure(List<Integer> list){
        this.list = list;
    }

    public abstract int getNext();
    public abstract boolean hasNext();
    public abstract void reset();

    public void add(int i){
        list.add(i);
    }
    public int get(int i){
        return list.get(i);
    }
    public String toString(){
        String string = "";
        reset();
        while(hasNext()){
            string += " " + getNext();
        }
        return string;
    }
}
