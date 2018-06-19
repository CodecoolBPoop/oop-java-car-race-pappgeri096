package com.codecool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Probability {

    private static List probabilityPile(int n1, int n2) {
        List array = new ArrayList();
        for(int i = 0; i < n1; i++) {
            array.add(true);
        }

        for(int i = 0; i < n2; i++) {
            array.add(false);
        }

        Collections.shuffle(array);

        return array;
    }

    public static boolean probability(int yes, int no) {
        List pile = probabilityPile(yes, no);

        return (boolean) pile.get(Random.generateRandomNumber(0, pile.size()));
    }

}
