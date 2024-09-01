package ua.com.javarush.gnew.crypto;

public class Cryptor {
    public String cypher(String input, int key) {

        Rotator rotator = new Rotator();

        char[] charsArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        SymbolsBelonging symBel = new SymbolsBelonging();
        for(char symbol : charsArray) {
            if(ConstantsForCryptor.ALPHABET.getCharsArrayConstant().contains(Character.toUpperCase(symbol))){
                sb.append(symBel.symbolsBelongingABC(symbol, rotator.rotateAlphabet(key)));
            } else if (ConstantsForCryptor.PUNCTUATION.getCharsArrayConstant().contains(symbol)) {
                sb.append(symBel.symbolsBelongingPUNCTUATION(symbol, rotator.rotatePunctuation(key)));
            }else {
                sb.append(symbol);
            }
        }
        return sb.toString();
    }
}
