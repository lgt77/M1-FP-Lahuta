package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Arrays;

public enum Alphabet {
    ABC (new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z'))),
    PUNCTUATION (new ArrayList<>(Arrays.asList('.', ',', '!', '?', ':', ';', '-',
            '(', ')', '[', ']', '{', '}','#', ' ', '@', '*', '+', '=', '_', '&',
            '\\', '/', '₴', '~', '`')));

    private final ArrayList<Character> charsAlphabet;

    Alphabet(ArrayList<Character> charsAlphabet) {
        this.charsAlphabet = charsAlphabet;
    }

    public ArrayList<Character> getAlphabet() {
        return this.charsAlphabet;
    }

}
