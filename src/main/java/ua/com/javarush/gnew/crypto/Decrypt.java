package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Collections;

public class Decrypt {

    public String decrypt(String input, int key) {
        if (key % 26 ==0) {
            key = 7 ;
        }
        key = (key % 26);

        ArrayList<Character> rotateAlphabet = new ArrayList<>(ConstantsForCipher.ALPHABET.getCharsArrayConstants());
        Collections.rotate(rotateAlphabet, key);
        ArrayList<Character> rotatePunctuation = new ArrayList<>(ConstantsForCipher.PUNCTUATION.getCharsArrayConstants());
        Collections.rotate(rotatePunctuation, key);

        char[] charsArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        Encrypt enc = new Encrypt();
        for(char symbol : charsArray) {
            if(ConstantsForCipher.ALPHABET.getCharsArrayConstants().contains(Character.toUpperCase(symbol))){
                sb.append(enc.symbolsBelongingABC(symbol, rotateAlphabet));
            } else if (ConstantsForCipher.PUNCTUATION.getCharsArrayConstants().contains(symbol)) {
                sb.append(enc.symbolsBelongingPUNCTUATION(symbol, rotatePunctuation));
            }else {
                sb.append(symbol);
            }
        }
        return sb.toString();
    }
}
