package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Collections;

public class Encrypt {

    public String encrypt(String input, int key) {
        if (key % 26 ==0) {
            key = 7 ;
        }
        key = (key % 26) * -1;

        ArrayList<Character> rotateAlphabet = new ArrayList<>(ConstantsForCipher.ALPHABET.getCharsArrayConstants());
        Collections.rotate(rotateAlphabet, key);
        ArrayList<Character> rotatePunctuation= new ArrayList<>(ConstantsForCipher.PUNCTUATION.getCharsArrayConstants());
        Collections.rotate(rotatePunctuation, key);

        char[] charsArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(char symbol : charsArray) {
            if (ConstantsForCipher.ALPHABET.getCharsArrayConstants().contains(Character.toUpperCase(symbol))){
                sb.append(symbolsBelongingABC(symbol, rotateAlphabet));
            } else if (ConstantsForCipher.PUNCTUATION.getCharsArrayConstants().contains(symbol)) {
                sb.append(symbolsBelongingPUNCTUATION(symbol, rotatePunctuation));
            }else {
                sb.append(symbol);
            }
        }

        return sb.toString();
    }

    protected Character symbolsBelongingABC(char symbol, ArrayList<Character> rotateAlphabet) {
        int index = ConstantsForCipher.ALPHABET.getCharsArrayConstants().indexOf(Character.toUpperCase(symbol));
        if(Character.isLowerCase(symbol)){
            return  Character.toLowerCase(rotateAlphabet.get(index));
        }
        return rotateAlphabet.get(index);
    }

    protected Character symbolsBelongingPUNCTUATION(char symbol, ArrayList<Character> rotatePunctuation){
        int index = ConstantsForCipher.PUNCTUATION.getCharsArrayConstants().indexOf(symbol);
        return rotatePunctuation.get(index);
    }
}