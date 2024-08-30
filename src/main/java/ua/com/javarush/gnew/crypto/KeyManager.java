package ua.com.javarush.gnew.crypto;

import ua.com.javarush.gnew.runner.Command;
import ua.com.javarush.gnew.runner.RunOptions;

public class KeyManager {
    protected int key;

    public Integer key(RunOptions runOptions){
        if (runOptions.getCommand() == Command.ENCRYPT && runOptions.getKey() >0) {
            key = (runOptions.getKey() % 26) * -1;
            return key;
        }else if (runOptions.getCommand() == Command.DECRYPT && runOptions.getKey() < 0){
            key = (runOptions.getKey() % 26) * -1;
            return key;

        }else if ((runOptions.getKey() % 26) == 0){
            key =7;
            return runOptions.getCommand() == Command.ENCRYPT ? -key : key;
        }
        key = runOptions.getKey();
        return key;
    }
}

