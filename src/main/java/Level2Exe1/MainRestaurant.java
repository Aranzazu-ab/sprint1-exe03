package Level2Exe1;

import java.util.HashSet;
import java.util.List;

public class MainRestaurant {
    public static void main (String[] args){
        ManageRestaurant manage =new ManageRestaurant();

        List<Restaurant> restaurants = List.of(
                new Restaurant("La Guerita Mexicana", 8),
                new Restaurant("El Pachuco", 7),
                new Restaurant("La Fabrica del Taco", 10),
                new Restaurant("El Pachuco", 6),
                new Restaurant("San Pedrito", 8),
                new Restaurant("La Guerita Mexicana", 8)
        );

        for (Restaurant restaurant : restaurants) {
            manage.addRestaurant(restaurant);
        }

        System.out.println("There are " +manage.getNumberOfRestaurants()+ " mexican restaurants:");
        manage.showRestaurants();

        System.out.println("Ordered Restaurants:");
        manage.showOrderedRestaurants();

    }
}
