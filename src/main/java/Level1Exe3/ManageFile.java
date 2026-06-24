package Level1Exe3;

import javax.tools.JavaFileManager;
import java.io.*;
import java.util.HashMap;

public class ManageFile {

    public HashMap<String, String> loadFile (String fileName) throws IOException{
        HashMap<String, String> countries = new HashMap<>();

        try (BufferedReader reader =new BufferedReader(new FileReader(fileName))){
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                if (parts.length ==2) {
                    countries.put(parts[0].replace("_", " ").trim(), parts[1].replace("_", " ").replace("-"," ").trim());
                }
            }
        }
        return countries;
    }

    public void saveScore (String username, int score, String fileName){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))){
            writer.write(username + " - "+ score + " points");
            writer.newLine();
        } catch (IOException error) {
            System.out.println("Error writing file: " +error.getMessage());
        }
    }

    public void showRanking (String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            System.out.println("***********RANKING***********");
                    while ((line= reader.readLine()) != null){
                        System.out.println(line);
                    }
        } catch (IOException error) {
            System.out.println("Error ranking reader: " + error.getMessage());

        }
    }
}
