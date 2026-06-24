package Level2Exe1;

import java.util.Objects;

public class Restaurant implements Comparable <Restaurant> {
    private String name;
    private int score;

    public Restaurant(String name, int score){
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
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

    @Override
    public int compareTo(Restaurant other){
        int result= name.compareTo(other.name);
        if (result != 0){
            return result;
        }
        return Integer.compare(other.getScore(),getScore());
    }


}
