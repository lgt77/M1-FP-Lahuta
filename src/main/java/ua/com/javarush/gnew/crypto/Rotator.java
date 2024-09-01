package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Collections;

public class Rotator {

    public ArrayList<Character> rotateAlphabet(int key){


        ArrayList<Character> rotateAlphabet = new ArrayList<>(ConstantsForCryptor.ALPHABET.getCharsArrayConstants());
        Collections.rotate(rotateAlphabet, key);
        return rotateAlphabet;
    }

    public ArrayList<Character> rotatePunctuation(Integer key){
        ArrayList<Character> rotatePunctuation = new ArrayList<>(ConstantsForCryptor.PUNCTUATION.getCharsArrayConstants());
        Collections.rotate(rotatePunctuation, key);
        return rotatePunctuation;
    }

}
