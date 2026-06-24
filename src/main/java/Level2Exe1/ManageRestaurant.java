package Level2Exe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ManageRestaurant {
    private HashSet<Restaurant> mexicanRestaurants;

    public ManageRestaurant(){
        mexicanRestaurants = new HashSet<>();
    }

    public void addRestaurant( String name, int score){
        mexicanRestaurants.add(new Restaurant(name, score));
    }

    public void showRestaurants(){
        for (Restaurant restaurant : mexicanRestaurants){
            System.out.println(restaurant);
        }
    }

    public int getNumberOfRestaurants() {
        return mexicanRestaurants.size();
    }

    public void showOrderedRestaurants(){
        List<Restaurant> ordered = new ArrayList<>(mexicanRestaurants);
        Collections.sort(ordered);

        for (Restaurant mexRest : ordered) {
            System.out.println(mexRest);
        }
    }
}
