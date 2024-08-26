package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Collections;

public class Encrypt {
    public Encrypt() {
    }

    public String encrypt(String input, int key) {
        if (key % 26 ==0) {
            key = 7 ;
        }
        key = (key % 26) * -1;
        System.out.println( key);

        ArrayList<Character> rotateAlphabet = new ArrayList(Alphabet.ABC.getAlphabet());
        Collections.rotate(rotateAlphabet, key);
        char[] charsArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(char symbol : charsArray) {
            sb.append(this.symbolsBelongingAlphabet(symbol, rotateAlphabet));
        }

        return sb.toString();
    }

    protected Character symbolsBelongingAlphabet(char symbol, ArrayList<Character> rotateAlphabet) {
        if (!Alphabet.ABC.getAlphabet().contains(Character.toUpperCase(symbol))) {
            return symbol;
        }
        int index = Alphabet.ABC.getAlphabet().indexOf(Character.toUpperCase(symbol));
        if(Character.isLowerCase(symbol)){
            return  Character.toLowerCase(rotateAlphabet.get(index));
        }
        return rotateAlphabet.get(index);
    }
}