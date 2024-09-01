package ua.com.javarush.gnew.crypto;

import ua.com.javarush.gnew.runner.RunOptions;
import ua.com.javarush.gnew.runner.Command;


public class KeyManager {
   private int key;
    public int key(RunOptions runOptions){
        if (runOptions.getCommand() == Command.ENCRYPT && runOptions.getKey() !=0) {
            key = (runOptions.getKey() % 26) * -1;
            return key;
        }else if (runOptions.getCommand() == Command.DECRYPT && runOptions.getKey() != 0) {
            key = (runOptions.getKey() % 26) * -1;
            return key;
        }else {
            key =7;
            return runOptions.getCommand() == Command.ENCRYPT ? -key : key;
        }
    }
}
