package Level2Exe1;

import java.util.HashSet;

public class MainRestaurant {
    public static void main (String[] args){
        ManageRestaurant manage =new ManageRestaurant();

        manage.addRestaurant("La Guerita Mexicana", 8);
        manage.addRestaurant("El Pachuco", 7);
        manage.addRestaurant("La Fabrica del Taco", 10);
        manage.addRestaurant("El Pachuco", 6);
        manage.addRestaurant("San Pedrito", 8);
        manage.addRestaurant("La Guerita Mexicana", 8);

        System.out.println("There are " +manage.getNumberOfRestaurants()+ " mexican restaurants:");
        manage.showRestaurants();





    }
}
