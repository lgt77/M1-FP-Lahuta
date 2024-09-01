package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;

public class SymbolsBelonging {
    protected Character symbolsBelongingABC(char symbol, ArrayList<Character> rotateAlphabet) {
        int index = ConstantsForCryptor.ALPHABET.getCharsArrayConstants().indexOf(Character.toUpperCase(symbol));
        if(Character.isLowerCase(symbol)){
            return  Character.toLowerCase(rotateAlphabet.get(index));
        }
        return rotateAlphabet.get(index);
    }

    protected Character symbolsBelongingPUNCTUATION(char symbol, ArrayList<Character> rotatePunctuation){
        int index = ConstantsForCryptor.PUNCTUATION.getCharsArrayConstants().indexOf(symbol);
        return rotatePunctuation.get(index);
    }
}
