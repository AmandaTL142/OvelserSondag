package ExerciseThree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/*
Exercise 3
Write a program that reads a file with n number of strings separated by line breaks.
The program determines and prints how many words are in the file.
 */

public class FileReader {

    public void fileReaderSameLine() throws FileNotFoundException {
        File file = new File("src/ExerciseThree/FileTest");
        Scanner sc = new Scanner(file);
        ArrayList<String[]> ar = new ArrayList<>();
        while (sc.hasNext()) {

            String currentLine= sc.nextLine();

            String[] lineAsArray = currentLine.split(";");

            ar.add(lineAsArray);
        }
    }

    public static int fileReaderSeperateLines() throws FileNotFoundException {
        File file = new File("src/ExerciseThree/FileTest");
        Scanner sp = new Scanner(file);
        ArrayList<String> stringArray = new ArrayList<>();

        while(sp.hasNextLine()){
            String currentLine = sp.nextLine();
            stringArray.add(currentLine);
            System.out.println(currentLine);
        }

        int wordCount = 0;
        for(String line:stringArray){
            String[] currentLine = line.split(";");
            for (String word:currentLine){
                if(!word.equals(".") && !word.equals(",")){
                    wordCount++;
                }
            }
        }

        return wordCount;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(fileReaderSeperateLines());
    }



}
