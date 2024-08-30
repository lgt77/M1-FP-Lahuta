package ua.com.javarush.gnew.crypto;

public class Encrypt extends Cipher {

    Cipher cipher = new Cipher();


    public String encrypt() {


        StringBuilder sb = new StringBuilder();
        SymbolsBelonging symBel = new SymbolsBelonging();
        for(char symbol : cipher.getInputChars()) {
            if (ConstantsForCipher.ALPHABET.getCharsArrayConstants().contains(Character.toUpperCase(symbol))){
                sb.append(symBel.symbolsBelongingABC(symbol, cipher.getRotateAlphabet()));
            } else if (ConstantsForCipher.PUNCTUATION.getCharsArrayConstants().contains(symbol)) {
                sb.append(symBel.symbolsBelongingPUNCTUATION(symbol, cipher.getRotatePunctuation()));
            }else {
                sb.append(symbol);
            }
        }

        return sb.toString();
    }

}