package Level2Exe1;

import java.util.HashSet;

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
}
