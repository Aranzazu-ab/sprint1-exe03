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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
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
