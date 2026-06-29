package Level1Exe3;

import java.util.*;

public class QuizCountry {
    private HashMap<String, String> countries;
    private ManageFile fileCountries = new ManageFile();
    private Scanner scanner;
    private String username;
    private int score;


    public QuizCountry(HashMap<String, String> countries) {
        this.countries = countries;
        this.fileCountries = fileCountries;
        this.scanner = new Scanner(System.in);
        this.score = 0;
    }

    private List<String> tenQuestions() {
        List<String> countriesList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countriesList);
        return countriesList.subList(0, 10);
    }

    private void askQuestion(String country) {
        System.out.println("What's the capital of " + country + "?");
        String answer = scanner.nextLine();
        String capital = countries.get(country);

        if (answer.equalsIgnoreCase(capital)) {
            System.out.println("That's correct!");
            score++;
        } else {
            System.out.println("Sorry, that's incorrect!");
        }
    }

    public void getUsername() {
        System.out.println("Enter your name: ");
        username = scanner.nextLine();
    }

    public void startQuiz() {
        List<String> questions = tenQuestions();
        for (String country : questions) {
            askQuestion(country);
        }
    }

    public void showScore(){
        System.out.println("Final score: " + score + "/10");
    }

    public void saveScore(ManageFile fileManager) {
        fileManager.saveScore(username, score, "ranking.txt");
    }

    public void startGame(ManageFile fileManager) {
        getUsername();
        startQuiz();
        showScore();
        saveScore(fileManager);
    }
}
//
//
//
//
//
//    public void prepareFile (){
//
//    }
//
//    public void ready() {
//        HashMap<String, String> countries;
//        try {
//            countries = fileCountries.loadFile("countries.txt"
//
//        System.out.println("Final score: " + score + "/10");
//
//        fileCountries.saveScore(username,
//                score,
//                "ranking.txt");
//
//        fileCountries.showRanking("ranking.txt");
//    }
//
//    private int play(HashMap<String, String> countries){
//        int score = 0;
//
//        List<String> countriesRandom = new ArrayList<>(countries.keySet());
//        Collections.shuffle(countriesRandom);
//
//        //list de contriesRandom los 10 primeros
//
//        for(int i=0; i<10; i++){
//            String country =countriesRandom.get(i);
//            System.out.println("What's the capital of " + country + "?");
//            String answer = scanner.nextLine();
//            String capital =countries.get(country);
//
//            if (answer.equalsIgnoreCase(capital)){
//                System.out.println("That's correct!");
//                score++;
//            } else{
//                System.out.println("Sorry, that's incorrect!");
//            }
//        }
//
//        return score;
//    }
//


