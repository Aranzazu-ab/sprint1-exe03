package Level1Exe3;

import java.util.HashMap;

public class MainCapitalGame {
    public static void main(String[] args) {
        ManageFile fileManager = new ManageFile();
        HashMap<String, String> countriesGame = fileManager.loadFile("countries.txt");
        QuizCountry quiz = new QuizCountry(countriesGame);
        quiz.startGame(fileManager);
        fileManager.showRanking("ranking.txt");
    }
}
