package com.codecool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileHandler {

    public static String[] readNames() {
        String[] names = new String[0];

        try (BufferedReader br = new BufferedReader(new FileReader("names.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                names = Arrays.copyOf(names, names.length+1);
                names[names.length-1] = line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;


    }
}
