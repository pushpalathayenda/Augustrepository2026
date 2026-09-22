package com.java.Hackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileContent {

    public static void main(String[] args) throws IOException {

        String inputFile = "C:/Users/pushp/Desktop/notes.txt";
        String outputFile = "C:/Users/pushp/Desktop/reverse_notes.txt";

        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<String> lines = new ArrayList<>();

        String line;

        // Read all lines and store in ArrayList
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        br.close();
        fr.close();

        // Write lines in reverse order to another file
        FileWriter fw = new FileWriter(outputFile);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = lines.size() - 1; i >= 0; i--) {
            bw.write(lines.get(i));
            bw.newLine();   // write next line
        }

        bw.close();
        fw.close();

        System.out.println("Reverse lines written to: " + outputFile);
    }
}
