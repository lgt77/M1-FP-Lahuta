package ua.com.javarush.gnew.crypto;

import java.util.ArrayList;
import java.util.Arrays;

public enum ConstantsForCipher {
    ALPHABET(new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
            'X', 'Y', 'Z'))),
    PUNCTUATION (new ArrayList<>(Arrays.asList('.', ',', '!', '?', ':', ';', '-',
            '(', ')', '[', ']', '{', '}','#', ' ', '@', '*', '+', '=', '_', '&',
            '\\', '/', '₴', '~', '`')));

    private final ArrayList<Character> CharsArrayConstants;

    ConstantsForCipher(ArrayList<Character> CharsArrayConstants) {
        this.CharsArrayConstants = CharsArrayConstants;
    }
        public ArrayList<Character> getCharsArrayConstants() {
        return this.CharsArrayConstants;
    }
}
