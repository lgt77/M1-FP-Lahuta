package ua.com.javarush.gnew.crypto;

import ua.com.javarush.gnew.runner.RunOptions;

import java.util.ArrayList;
import java.util.Collections;

public class Cipher {
    private char[] inputChars;
    private ArrayList <Character> rotateAlphabet;
    private  ArrayList <Character> rotatePunctuation;

    public char[] inputChars(String input){
        KeyManager keyManager = new KeyManager();

        rotateAlphabet = ConstantsForCipher.ALPHABET.getCharsArrayConstants();
        Collections.rotate(rotateAlphabet, keyManager.key);
        rotatePunctuation = new ArrayList<>(ConstantsForCipher.PUNCTUATION.getCharsArrayConstants());
        Collections.rotate(rotatePunctuation, keyManager.key);

       return input.toCharArray();
    }

    public char[] getInputChars() {
        return inputChars;
    }

    public ArrayList<Character> getRotateAlphabet() {
        return rotateAlphabet;
    }

    public ArrayList<Character> getRotatePunctuation() {
        return rotatePunctuation;
    }
}
