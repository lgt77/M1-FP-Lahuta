package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Collections;

public class Rotator {

    protected ArrayList<Character> rotateAlphabet(int key){


        ArrayList<Character> rotateAlphabet = new ArrayList<>(ConstantsForCryptor.ALPHABET.getcharsArrayConstant());
        Collections.rotate(rotateAlphabet, key);
        return rotateAlphabet;
    }

    protected ArrayList<Character> rotatePunctuation(Integer key){
        ArrayList<Character> rotatePunctuation = new ArrayList<>(ConstantsForCryptor.PUNCTUATION.getcharsArrayConstant());
        Collections.rotate(rotatePunctuation, key);
        return rotatePunctuation;
    }

}
