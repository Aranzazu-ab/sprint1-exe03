package Level1Exe3;

import java.io.IOException;
import java.util.*;

public class QuizCountry {
    private final ManageFile fileCountries;
    private final Scanner scanner;

    public QuizCountry(){
        fileCountries = new ManageFile();
        scanner = new Scanner(System.in);
    }

    public void ready() {
        HashMap<String, String> countries;
        try {
            countries = fileCountries.loadFile("countries.txt");
        } catch (IOException error){
            System.out.println("Error loading countries file: "+ error.getMessage());
            return;
        }

        System.out.println("Enter your name: ");
        String username = scanner.nextLine();

        int score = play(countries);

        System.out.println("Final score: " + score + "/10");

        fileCountries.saveScore(username,
                score,
                "ranking.txt");

        fileCountries.showRanking("ranking.txt");
    }

    private int play(HashMap<String, String> countries){
        int score = 0;

        List<String> countriesRandom = new ArrayList<>(countries.keySet());
        Collections.shuffle(countriesRandom);

        for(int i=0; i<10; i++){
            String country =countriesRandom.get(i);
            System.out.println("What's the capital of " + country + "?");
            String answer = scanner.nextLine();
            String capital =countries.get(country);

            if (answer.equalsIgnoreCase(capital)){
                System.out.println("That's correct!");
                score++;
            } else{
                System.out.println("Sorry, that's incorrect!");
            }
        }

        return score;
    }


}
