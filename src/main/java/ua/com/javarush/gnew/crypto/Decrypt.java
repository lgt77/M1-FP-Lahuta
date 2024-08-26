package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Collections;

public class Decrypt {
    public Decrypt() {
    }

    public String decrypt(String input, int key) {
        if (key % 26 ==0) {
            key = 7 ;
        }
        key = (key % 26);

        ArrayList<Character> rotateAlphabet = new ArrayList(Alphabet.ABC.getAlphabet());
        Collections.rotate(rotateAlphabet, key);

        char[] charsArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        Encrypt enc = new Encrypt();
        for(char symbol : charsArray) {
            sb.append(enc.symbolsBelongingAlphabet(symbol, rotateAlphabet));
        }
        return sb.toString();
    }

}
