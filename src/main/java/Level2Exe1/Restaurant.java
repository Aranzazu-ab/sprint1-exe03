package Level2Exe1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score){
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore(int score) {
        return score;
    }

    @Override
    public boolean equals (Object object){
        if (this==object){
            return true;
        }
        if (! (object instanceof Restaurant)){
            return false;
        }

        Restaurant obj = (Restaurant) object;
        return name.equals((obj.name)) && score == obj.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString(){
        return name +" - " +score;
    }


}
